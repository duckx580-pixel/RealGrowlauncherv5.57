package l0;

import com.google.android.gms.internal.measurement.j3;
import com.rtsoft.growtopia.R;
import java.util.Iterator;
import java.util.Map;
import o0.m1;
import o0.s0;
import oh.w;
import v1.e0;
import y0.t;
import y0.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends cd.c implements m1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f9731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s0 f9732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s0 f9733v;
    public final t w;

    public b(boolean z3, float f9, s0 s0Var, s0 s0Var2) {
        super(z3, s0Var2);
        this.f9730s = z3;
        this.f9731t = f9;
        this.f9732u = s0Var;
        this.f9733v = s0Var2;
        this.w = new t();
    }

    @Override // o0.m1
    public final void a() {
        this.w.clear();
    }

    @Override // o0.m1
    public final void d() {
        this.w.clear();
    }

    @Override // u.v0
    public final void g(e0 e0Var) {
        b bVar = this;
        e0 e0Var2 = e0Var;
        i1.b bVar2 = e0Var2.f18385i;
        long j = ((g1.t) bVar.f9732u.getValue()).f6918a;
        e0Var2.b();
        bVar.m(e0Var2, bVar.f9731t, j);
        Object it = bVar.w.f20098r.iterator();
        while (((rk.e) it).hasNext()) {
            i iVar = (i) ((Map.Entry) ((x) it).next()).getValue();
            float f9 = ((e) bVar.f9733v.getValue()).f9741d;
            if (f9 != 0.0f) {
                long jB = g1.t.b(j, f9);
                t.c cVar = iVar.f9760i;
                boolean z3 = iVar.f9754c;
                float f10 = iVar.f9753b;
                if (iVar.f9755d == null) {
                    long jE = bVar2.e();
                    float f11 = j.f9763a;
                    iVar.f9755d = Float.valueOf(Math.max(f1.f.d(jE), f1.f.b(jE)) * 0.3f);
                }
                if (iVar.f9756e == null) {
                    iVar.f9756e = Float.isNaN(f10) ? Float.valueOf(j.a(e0Var2, z3, bVar2.e())) : Float.valueOf(e0Var2.W(f10));
                }
                if (iVar.f9752a == null) {
                    iVar.f9752a = new f1.c(bVar2.h0());
                }
                if (iVar.f9757f == null) {
                    iVar.f9757f = new f1.c(vd.a.b(f1.f.d(bVar2.e()) / 2.0f, f1.f.b(bVar2.e()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) iVar.f9762l.getValue()).booleanValue() || ((Boolean) iVar.f9761k.getValue()).booleanValue()) ? ((Number) iVar.f9758g.d()).floatValue() : 1.0f;
                Float f12 = iVar.f9755d;
                kotlin.jvm.internal.l.c(f12);
                float fFloatValue2 = f12.floatValue();
                Float f13 = iVar.f9756e;
                kotlin.jvm.internal.l.c(f13);
                float fP = xd.c.p(fFloatValue2, f13.floatValue(), ((Number) iVar.f9759h.d()).floatValue());
                f1.c cVar2 = iVar.f9752a;
                kotlin.jvm.internal.l.c(cVar2);
                float fD = f1.c.d(cVar2.f5977a);
                f1.c cVar3 = iVar.f9757f;
                kotlin.jvm.internal.l.c(cVar3);
                float fP2 = xd.c.p(fD, f1.c.d(cVar3.f5977a), ((Number) cVar.d()).floatValue());
                f1.c cVar4 = iVar.f9752a;
                kotlin.jvm.internal.l.c(cVar4);
                float fE = f1.c.e(cVar4.f5977a);
                f1.c cVar5 = iVar.f9757f;
                kotlin.jvm.internal.l.c(cVar5);
                long jB2 = vd.a.b(fP2, xd.c.p(fE, f1.c.e(cVar5.f5977a), ((Number) cVar.d()).floatValue()));
                long jB3 = g1.t.b(jB, g1.t.d(jB) * fFloatValue);
                if (z3) {
                    float fD2 = f1.f.d(bVar2.e());
                    float fB = f1.f.b(bVar2.e());
                    j3 j3Var = bVar2.f7986r;
                    long jN = j3Var.n();
                    j3Var.j().save();
                    ((j3) ((lc.n) j3Var.f3836r).f9915r).j().m(0.0f, 0.0f, fD2, fB, 1);
                    i1.d.u0(e0Var, jB3, fP, jB2, null, R.styleable.AppCompatTheme_windowNoTitle);
                    j3Var.j().p();
                    j3Var.t(jN);
                } else {
                    i1.d.u0(e0Var, jB3, fP, jB2, null, R.styleable.AppCompatTheme_windowNoTitle);
                }
            }
            bVar = this;
            e0Var2 = e0Var;
        }
    }

    @Override // cd.c
    public final void k(x.n nVar, w wVar) {
        kotlin.jvm.internal.l.f("interaction", nVar);
        kotlin.jvm.internal.l.f("scope", wVar);
        t tVar = this.w;
        Iterator it = tVar.f20098r.iterator();
        while (it.hasNext()) {
            i iVar = (i) ((Map.Entry) it.next()).getValue();
            iVar.f9762l.setValue(Boolean.TRUE);
            iVar.j.V(qg.o.f13926a);
        }
        boolean z3 = this.f9730s;
        ug.c cVar = null;
        i iVar2 = new i(z3 ? new f1.c(nVar.f19334a) : null, this.f9731t, z3);
        tVar.put(nVar, iVar2);
        oh.x.s(wVar, null, 0, new androidx.work.e(iVar2, this, nVar, cVar, 8), 3);
    }

    @Override // cd.c
    public final void q(x.n nVar) {
        kotlin.jvm.internal.l.f("interaction", nVar);
        i iVar = (i) this.w.get(nVar);
        if (iVar != null) {
            iVar.f9762l.setValue(Boolean.TRUE);
            iVar.j.V(qg.o.f13926a);
        }
    }

    @Override // o0.m1
    public final void h() {
    }
}
