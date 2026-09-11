package t6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.usercentrics.sdk.models.api.ApiConstants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ServiceConnection {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16930i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedBlockingQueue f16932s;

    public n(int i10) {
        this.f16930i = i10;
        switch (i10) {
            case 1:
                this.f16931r = false;
                this.f16932s = new LinkedBlockingQueue();
                break;
            default:
                this.f16932s = new LinkedBlockingQueue(1);
                this.f16931r = false;
                break;
        }
    }

    public IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b8.a0.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f16931r) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f16931r = true;
        IBinder iBinder = (IBinder) this.f16932s.poll(ApiConstants.DEFAULT_TIMEOUT_MILLIS, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f16930i) {
            case 0:
                try {
                    this.f16932s.put(iBinder);
                } catch (InterruptedException e8) {
                    s6.h.u("onServiceConnected Interrupted", e8);
                    return;
                }
                break;
            default:
                this.f16932s.add(iBinder);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = this.f16930i;
    }

    private final void b(ComponentName componentName) {
    }

    private final void c(ComponentName componentName) {
    }
}
