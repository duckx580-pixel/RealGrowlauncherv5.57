package j6;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
import oh.s;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l6.a f8820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f8821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k6.d f8822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m6.a f8824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bj.o f8825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f8826i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f8830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f8831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f8832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f8833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f8834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f8835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f8836t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.p f8837u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k6.g f8838v;
    public final k6.e w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f8839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f8840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f8841z;

    public i(Context context, Object obj, l6.a aVar, Bitmap.Config config, k6.d dVar, List list, m6.a aVar2, bj.o oVar, p pVar, boolean z3, boolean z10, boolean z11, boolean z12, b bVar, b bVar2, b bVar3, s sVar, s sVar2, s sVar3, s sVar4, androidx.lifecycle.p pVar2, k6.g gVar, k6.e eVar, n nVar, d dVar2, c cVar) {
        this.f8818a = context;
        this.f8819b = obj;
        this.f8820c = aVar;
        this.f8821d = config;
        this.f8822e = dVar;
        this.f8823f = list;
        this.f8824g = aVar2;
        this.f8825h = oVar;
        this.f8826i = pVar;
        this.j = z3;
        this.f8827k = z10;
        this.f8828l = z11;
        this.f8829m = z12;
        this.f8830n = bVar;
        this.f8831o = bVar2;
        this.f8832p = bVar3;
        this.f8833q = sVar;
        this.f8834r = sVar2;
        this.f8835s = sVar3;
        this.f8836t = sVar4;
        this.f8837u = pVar2;
        this.f8838v = gVar;
        this.w = eVar;
        this.f8839x = nVar;
        this.f8840y = dVar2;
        this.f8841z = cVar;
    }

    public static h a(i iVar) {
        Context context = iVar.f8818a;
        iVar.getClass();
        return new h(iVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f8818a, iVar.f8818a) && this.f8819b.equals(iVar.f8819b) && kotlin.jvm.internal.l.a(this.f8820c, iVar.f8820c) && this.f8821d == iVar.f8821d && this.f8822e == iVar.f8822e && kotlin.jvm.internal.l.a(this.f8823f, iVar.f8823f) && kotlin.jvm.internal.l.a(this.f8824g, iVar.f8824g) && kotlin.jvm.internal.l.a(this.f8825h, iVar.f8825h) && this.f8826i.equals(iVar.f8826i) && this.j == iVar.j && this.f8827k == iVar.f8827k && this.f8828l == iVar.f8828l && this.f8829m == iVar.f8829m && this.f8830n == iVar.f8830n && this.f8831o == iVar.f8831o && this.f8832p == iVar.f8832p && kotlin.jvm.internal.l.a(this.f8833q, iVar.f8833q) && kotlin.jvm.internal.l.a(this.f8834r, iVar.f8834r) && kotlin.jvm.internal.l.a(this.f8835s, iVar.f8835s) && kotlin.jvm.internal.l.a(this.f8836t, iVar.f8836t) && kotlin.jvm.internal.l.a(this.f8837u, iVar.f8837u) && this.f8838v.equals(iVar.f8838v) && this.w == iVar.w && this.f8839x.equals(iVar.f8839x) && this.f8840y.equals(iVar.f8840y) && kotlin.jvm.internal.l.a(this.f8841z, iVar.f8841z);
    }

    public final int hashCode() {
        int iHashCode = (this.f8819b.hashCode() + (this.f8818a.hashCode() * 31)) * 31;
        l6.a aVar = this.f8820c;
        int iA = k0.g.a((this.f8822e.hashCode() + ((this.f8821d.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f8823f);
        this.f8824g.getClass();
        return this.f8841z.hashCode() + ((this.f8840y.hashCode() + ((this.f8839x.f8858i.hashCode() + ((this.w.hashCode() + ((this.f8838v.hashCode() + ((this.f8837u.hashCode() + ((this.f8836t.hashCode() + ((this.f8835s.hashCode() + ((this.f8834r.hashCode() + ((this.f8833q.hashCode() + ((this.f8832p.hashCode() + ((this.f8831o.hashCode() + ((this.f8830n.hashCode() + h0.c(h0.c(h0.c(h0.c((this.f8826i.f8867a.hashCode() + ((((m6.a.class.hashCode() + iA) * 31) + Arrays.hashCode(this.f8825h.f3167i)) * 31)) * 31, 31, this.j), 31, this.f8827k), 31, this.f8828l), 31, this.f8829m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
