package w1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.fragment.app.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f18773e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d2.v f18774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b2.o f18775d;

    @Override // androidx.fragment.app.h
    public final int[] E(int i10) {
        int iG;
        if (A().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            b2.o oVar = this.f18775d;
            if (oVar == null) {
                kotlin.jvm.internal.l.l("node");
                throw null;
            }
            int iZ = gh.a.z(oVar.e().b());
            int length = A().length();
            if (length <= i10) {
                i10 = length;
            }
            d2.v vVar = this.f18774c;
            if (vVar == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            int iF = vVar.f(i10);
            d2.v vVar2 = this.f18774c;
            if (vVar2 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            float fK = vVar2.k(iF) - iZ;
            if (fK > 0.0f) {
                d2.v vVar3 = this.f18774c;
                if (vVar3 == null) {
                    kotlin.jvm.internal.l.l("layoutResult");
                    throw null;
                }
                iG = vVar3.g(fK);
            } else {
                iG = 0;
            }
            if (i10 == A().length() && iG < iF) {
                iG++;
            }
            return w(I(iG, p2.h.f13271r), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int I(int i10, p2.h hVar) {
        d2.v vVar = this.f18774c;
        if (vVar == null) {
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        int iJ = vVar.j(i10);
        d2.v vVar2 = this.f18774c;
        if (vVar2 == null) {
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        if (hVar != vVar2.m(iJ)) {
            d2.v vVar3 = this.f18774c;
            if (vVar3 != null) {
                return vVar3.j(i10);
            }
            kotlin.jvm.internal.l.l("layoutResult");
            throw null;
        }
        if (this.f18774c != null) {
            return r6.e(i10, false) - 1;
        }
        kotlin.jvm.internal.l.l("layoutResult");
        throw null;
    }

    @Override // androidx.fragment.app.h
    public final int[] q(int i10) {
        int iG;
        if (A().length() <= 0 || i10 >= A().length()) {
            return null;
        }
        try {
            b2.o oVar = this.f18775d;
            if (oVar == null) {
                kotlin.jvm.internal.l.l("node");
                throw null;
            }
            int iZ = gh.a.z(oVar.e().b());
            if (i10 <= 0) {
                i10 = 0;
            }
            d2.v vVar = this.f18774c;
            if (vVar == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            int iF = vVar.f(i10);
            d2.v vVar2 = this.f18774c;
            if (vVar2 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            float fK = vVar2.k(iF) + iZ;
            d2.v vVar3 = this.f18774c;
            if (vVar3 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            if (vVar3 == null) {
                kotlin.jvm.internal.l.l("layoutResult");
                throw null;
            }
            if (fK < vVar3.k(vVar3.f4911b.f4850f - 1)) {
                d2.v vVar4 = this.f18774c;
                if (vVar4 == null) {
                    kotlin.jvm.internal.l.l("layoutResult");
                    throw null;
                }
                iG = vVar4.g(fK);
            } else {
                d2.v vVar5 = this.f18774c;
                if (vVar5 == null) {
                    kotlin.jvm.internal.l.l("layoutResult");
                    throw null;
                }
                iG = vVar5.f4911b.f4850f;
            }
            return w(i10, I(iG - 1, p2.h.f13270i) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
