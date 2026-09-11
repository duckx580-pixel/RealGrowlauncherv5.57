package t;

import o0.d2;
import o0.x1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements d2 {
    public final /* synthetic */ f1 A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1 f16036i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0.z0 f16037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0.z0 f16038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0.z0 f16039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o0.z0 f16040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o0.x0 f16041v;
    public final o0.z0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0.z0 f16042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f16043y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p0 f16044z;

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Map] */
    public c1(f1 f1Var, Object obj, o oVar, j1 j1Var) {
        this.A = f1Var;
        this.f16036i = j1Var;
        o0.n0 n0Var = o0.n0.f12510u;
        o0.z0 z0VarI = o0.p.I(obj, n0Var);
        this.f16037r = z0VarI;
        Object objInvoke = null;
        this.f16038s = o0.p.I(d.m(0.0f, null, 7), n0Var);
        this.f16039t = o0.p.I(new x0(d(), j1Var, obj, z0VarI.getValue(), oVar), n0Var);
        this.f16040u = o0.p.I(Boolean.TRUE, n0Var);
        int i10 = o0.b.f12387b;
        this.f16041v = new o0.x0(0L);
        this.w = o0.p.I(Boolean.FALSE, n0Var);
        this.f16042x = o0.p.I(obj, n0Var);
        this.f16043y = oVar;
        Float f9 = (Float) q1.f16167a.get(j1Var);
        if (f9 != null) {
            float fFloatValue = f9.floatValue();
            o oVar2 = (o) j1Var.f16120a.invoke(obj);
            int iB = oVar2.b();
            for (int i11 = 0; i11 < iB; i11++) {
                oVar2.e(fFloatValue, i11);
            }
            objInvoke = this.f16036i.f16121b.invoke(oVar2);
        }
        this.f16044z = d.m(0.0f, objInvoke, 3);
    }

    public static void e(c1 c1Var, Object obj, boolean z3, int i10) {
        if ((i10 & 1) != 0) {
            obj = c1Var.f16042x.getValue();
        }
        Object obj2 = obj;
        int i11 = i10 & 2;
        if (i11 != 0) {
            z3 = false;
        }
        y yVarD = (!z3 || (c1Var.d() instanceof p0)) ? c1Var.d() : c1Var.f16044z;
        c1Var.f16039t.setValue(new x0(yVarD, c1Var.f16036i, obj2, c1Var.f16037r.getValue(), c1Var.f16043y));
        f1 f1Var = c1Var.A;
        o0.z0 z0Var = f1Var.f16082g;
        z0Var.setValue(Boolean.TRUE);
        if (f1Var.d()) {
            y0.q qVar = f1Var.f16083h;
            int size = qVar.size();
            long jMax = 0;
            for (int i12 = 0; i12 < size; i12++) {
                c1 c1Var2 = (c1) qVar.get(i12);
                jMax = Math.max(jMax, c1Var2.b().f16220h);
                c1Var2.f16042x.setValue(c1Var2.b().f(0L));
                c1Var2.f16043y = c1Var2.b().d(0L);
            }
            z0Var.setValue(Boolean.FALSE);
        }
    }

    public final x0 b() {
        return (x0) this.f16039t.getValue();
    }

    public final y d() {
        return (y) this.f16038s.getValue();
    }

    public final void f(Object obj, Object obj2, y yVar) {
        this.f16037r.setValue(obj2);
        this.f16038s.setValue(yVar);
        if (kotlin.jvm.internal.l.a(b().f16215c, obj) && kotlin.jvm.internal.l.a(b().f16216d, obj2)) {
            return;
        }
        e(this, obj, false, 2);
    }

    public final void g(Object obj, y yVar) {
        o0.z0 z0Var = this.f16037r;
        boolean zA = kotlin.jvm.internal.l.a(z0Var.getValue(), obj);
        o0.z0 z0Var2 = this.w;
        if (!zA || ((Boolean) z0Var2.getValue()).booleanValue()) {
            z0Var.setValue(obj);
            this.f16038s.setValue(yVar);
            o0.z0 z0Var3 = this.f16040u;
            e(this, null, !((Boolean) z0Var3.getValue()).booleanValue(), 1);
            Boolean bool = Boolean.FALSE;
            z0Var3.setValue(bool);
            o0.x0 x0Var = this.A.f16080e;
            this.f16041v.f(((x1) y0.m.s(x0Var.f12618r, x0Var)).f12619c);
            z0Var2.setValue(bool);
        }
    }

    @Override // o0.d2
    public final Object getValue() {
        return this.f16042x.getValue();
    }

    public final String toString() {
        return "current value: " + this.f16042x.getValue() + ", target: " + this.f16037r.getValue() + ", spec: " + d();
    }
}
