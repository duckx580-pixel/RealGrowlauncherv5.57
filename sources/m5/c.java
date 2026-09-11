package m5;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements zc.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f11571i;

    public c(Handler handler) {
        this.f11571i = handler;
    }

    @Override // zc.k
    public boolean b(Runnable runnable) {
        return this.f11571i.post(runnable);
    }

    public c() {
        this.f11571i = xd.c.k(Looper.getMainLooper());
    }
}
