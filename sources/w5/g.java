package w5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends sb.c {
    @Override // sb.c
    public final void H(h hVar, h hVar2) {
        hVar.f19089b = hVar2;
    }

    @Override // sb.c
    public final void I(h hVar, Thread thread) {
        hVar.f19088a = thread;
    }

    @Override // sb.c
    public final boolean k(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f19094r != dVar) {
                    return false;
                }
                iVar.f19094r = dVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.c
    public final boolean l(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f19093i != obj) {
                    return false;
                }
                iVar.f19093i = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // sb.c
    public final boolean m(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f19095s != hVar) {
                    return false;
                }
                iVar.f19095s = hVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
