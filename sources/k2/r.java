package k2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9191b;

    public r(int i10, int i11) {
        this.f9190a = i10;
        this.f9191b = i11;
    }

    @Override // k2.i
    public final void a(j jVar) {
        boolean z3 = jVar.f9175d != -1;
        f2.b bVar = jVar.f9172a;
        if (z3) {
            jVar.f9175d = -1;
            jVar.f9176e = -1;
        }
        int iE = gh.a.e(this.f9190a, 0, bVar.b());
        int iE2 = gh.a.e(this.f9191b, 0, bVar.b());
        if (iE != iE2) {
            if (iE < iE2) {
                jVar.e(iE, iE2);
            } else {
                jVar.e(iE2, iE);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f9190a == rVar.f9190a && this.f9191b == rVar.f9191b;
    }

    public final int hashCode() {
        return (this.f9190a * 31) + this.f9191b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f9190a);
        sb2.append(", end=");
        return h0.g(sb2, this.f9191b, ')');
    }
}
