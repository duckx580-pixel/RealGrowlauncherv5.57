package k2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9195b;

    public t(int i10, int i11) {
        this.f9194a = i10;
        this.f9195b = i11;
    }

    @Override // k2.i
    public final void a(j jVar) {
        int iE = gh.a.e(this.f9194a, 0, jVar.f9172a.b());
        int iE2 = gh.a.e(this.f9195b, 0, jVar.f9172a.b());
        if (iE < iE2) {
            jVar.f(iE, iE2);
        } else {
            jVar.f(iE2, iE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f9194a == tVar.f9194a && this.f9195b == tVar.f9195b;
    }

    public final int hashCode() {
        return (this.f9194a * 31) + this.f9195b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f9194a);
        sb2.append(", end=");
        return h0.g(sb2, this.f9195b, ')');
    }
}
