package a8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.a f530b;

    public p0(qd.a aVar) {
        this.f530b = aVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f529a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f529a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f530b.s();
            a();
        }
    }
}
