package v8;

import b8.a0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f18622a = new l();

    public final void a(Exception exc) {
        l lVar = this.f18622a;
        lVar.getClass();
        a0.i("Exception must not be null", exc);
        synchronized (lVar.f18636a) {
            try {
                if (lVar.f18638c) {
                    return;
                }
                lVar.f18638c = true;
                lVar.f18641f = exc;
                lVar.f18637b.h(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Object obj) {
        l lVar = this.f18622a;
        synchronized (lVar.f18636a) {
            try {
                if (lVar.f18638c) {
                    return;
                }
                lVar.f18638c = true;
                lVar.f18640e = obj;
                lVar.f18637b.h(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
