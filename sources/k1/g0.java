package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9040i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f9041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f9042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f9043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f9044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f9045v;
    public final float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f9046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f9047y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f9048z;

    public g0(String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.f9040i = str;
        this.f9041r = f9;
        this.f9042s = f10;
        this.f9043t = f11;
        this.f9044u = f12;
        this.f9045v = f13;
        this.w = f14;
        this.f9046x = f15;
        this.f9047y = list;
        this.f9048z = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return kotlin.jvm.internal.l.a(this.f9040i, g0Var.f9040i) && this.f9041r == g0Var.f9041r && this.f9042s == g0Var.f9042s && this.f9043t == g0Var.f9043t && this.f9044u == g0Var.f9044u && this.f9045v == g0Var.f9045v && this.w == g0Var.w && this.f9046x == g0Var.f9046x && kotlin.jvm.internal.l.a(this.f9047y, g0Var.f9047y) && kotlin.jvm.internal.l.a(this.f9048z, g0Var.f9048z);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9048z.hashCode() + k0.g.a(s.h0.a(s.h0.a(s.h0.a(s.h0.a(s.h0.a(s.h0.a(s.h0.a(this.f9040i.hashCode() * 31, this.f9041r, 31), this.f9042s, 31), this.f9043t, 31), this.f9044u, 31), this.f9045v, 31), this.w, 31), this.f9046x, 31), 31, this.f9047y);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
