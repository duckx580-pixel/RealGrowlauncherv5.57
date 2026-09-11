package t;

import f0.c2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f16112c;

    public i1(int i10, v vVar, int i11) {
        this(i10, 0, (i11 & 4) != 0 ? x.f16209a : vVar);
    }

    @Override // t.i
    public final l1 a(j1 j1Var) {
        return new c2(this.f16110a, this.f16111b, this.f16112c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            if (i1Var.f16110a == this.f16110a && i1Var.f16111b == this.f16111b && kotlin.jvm.internal.l.a(i1Var.f16112c, this.f16112c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16112c.hashCode() + (this.f16110a * 31)) * 31) + this.f16111b;
    }

    @Override // t.u, t.i
    public final n1 a(j1 j1Var) {
        return new c2(this.f16110a, this.f16111b, this.f16112c);
    }

    public i1(int i10, int i11, v vVar) {
        this.f16110a = i10;
        this.f16111b = i11;
        this.f16112c = vVar;
    }
}
