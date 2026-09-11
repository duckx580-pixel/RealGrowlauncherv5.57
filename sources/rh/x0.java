package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends sh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oh.f f14849b;

    @Override // sh.d
    public final boolean a(sh.b bVar) {
        v0 v0Var = (v0) bVar;
        if (this.f14848a >= 0) {
            return false;
        }
        long j = v0Var.f14835y;
        if (j < v0Var.f14836z) {
            v0Var.f14836z = j;
        }
        this.f14848a = j;
        return true;
    }

    @Override // sh.d
    public final ug.c[] b(sh.b bVar) {
        long j = this.f14848a;
        this.f14848a = -1L;
        this.f14849b = null;
        return ((v0) bVar).u(j);
    }
}
