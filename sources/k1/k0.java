package k1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i0 {
    public final float A;
    public final float B;
    public final float C;
    public final float D;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9086i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f9087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g1.p f9089t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f9090u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g1.p f9091v;
    public final float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f9092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9093y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f9094z;

    public k0(String str, List list, int i10, g1.p pVar, float f9, g1.p pVar2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15) {
        this.f9086i = str;
        this.f9087r = list;
        this.f9088s = i10;
        this.f9089t = pVar;
        this.f9090u = f9;
        this.f9091v = pVar2;
        this.w = f10;
        this.f9092x = f11;
        this.f9093y = i11;
        this.f9094z = i12;
        this.A = f12;
        this.B = f13;
        this.C = f14;
        this.D = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            return kotlin.jvm.internal.l.a(this.f9086i, k0Var.f9086i) && kotlin.jvm.internal.l.a(this.f9089t, k0Var.f9089t) && this.f9090u == k0Var.f9090u && kotlin.jvm.internal.l.a(this.f9091v, k0Var.f9091v) && this.w == k0Var.w && this.f9092x == k0Var.f9092x && this.f9093y == k0Var.f9093y && this.f9094z == k0Var.f9094z && this.A == k0Var.A && this.B == k0Var.B && this.C == k0Var.C && this.D == k0Var.D && this.f9088s == k0Var.f9088s && kotlin.jvm.internal.l.a(this.f9087r, k0Var.f9087r);
        }
        return false;
    }

    public final int hashCode() {
        int iA = k0.g.a(this.f9086i.hashCode() * 31, 31, this.f9087r);
        g1.p pVar = this.f9089t;
        int iA2 = s.h0.a((iA + (pVar != null ? pVar.hashCode() : 0)) * 31, this.f9090u, 31);
        g1.p pVar2 = this.f9091v;
        return Integer.hashCode(this.f9088s) + s.h0.a(s.h0.a(s.h0.a(s.h0.a(android.support.v4.media.session.a.z(this.f9094z, android.support.v4.media.session.a.z(this.f9093y, s.h0.a(s.h0.a((iA2 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31, this.w, 31), this.f9092x, 31), 31), 31), this.A, 31), this.B, 31), this.C, 31), this.D, 31);
    }
}
