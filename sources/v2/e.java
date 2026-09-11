package v2;

import jj.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends l {
    @Override // jj.l
    public final void E(f fVar, f fVar2) {
        fVar.f18513b = fVar2;
    }

    @Override // jj.l
    public final void F(f fVar, Thread thread) {
        fVar.f18512a = thread;
    }

    @Override // jj.l
    public final boolean f(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f18518r != cVar) {
                    return false;
                }
                gVar.f18518r = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // jj.l
    public final boolean g(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f18517i != obj) {
                    return false;
                }
                gVar.f18517i = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // jj.l
    public final boolean h(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f18519s != fVar) {
                    return false;
                }
                gVar.f18519s = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
