package w9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f19144b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19145a;

    public e(Context context) {
        this.f19145a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f19146k) {
            try {
                Iterator it = ((q.d) f.f19148m.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19145a.unregisterReceiver(this);
    }
}
