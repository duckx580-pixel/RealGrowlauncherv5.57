package t1;

import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import w1.t2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements o0.i {
    public int D;
    public int E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.compose.ui.node.a f16271i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o0.r f16272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c1 f16273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f16276v = new HashMap();
    public final HashMap w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f16277x = new y(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w f16278y = new w(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashMap f16279z = new HashMap();
    public final b1 A = new b1();
    public final LinkedHashMap B = new LinkedHashMap();
    public final q0.f C = new q0.f(new Object[16]);
    public final String F = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public d0(androidx.compose.ui.node.a aVar, c1 c1Var) {
        this.f16271i = aVar;
        this.f16273s = c1Var;
    }

    public static o0.t h(o0.t tVar, androidx.compose.ui.node.a aVar, boolean z3, o0.r rVar, w0.a aVar2) {
        if (tVar == null || tVar.G) {
            ViewGroup.LayoutParams layoutParams = t2.f18973a;
            tVar = new o0.t(rVar, new n7.e(aVar));
        }
        if (!z3) {
            tVar.j(aVar2);
            return tVar;
        }
        o0.o oVar = tVar.F;
        oVar.f12535y = 100;
        oVar.f12534x = true;
        tVar.j(aVar2);
        if (oVar.E || oVar.f12535y != 100) {
            throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        oVar.f12535y = -1;
        oVar.f12534x = false;
        return tVar;
    }

    @Override // o0.i
    public final void a() {
        androidx.compose.ui.node.a aVar = this.f16271i;
        aVar.B = true;
        HashMap map = this.f16276v;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            o0.t tVar = ((v) it.next()).f16325c;
            if (tVar != null) {
                tVar.l();
            }
        }
        aVar.J();
        aVar.B = false;
        map.clear();
        this.w.clear();
        this.E = 0;
        this.D = 0;
        this.f16279z.clear();
        d();
    }

    @Override // o0.i
    public final void b() {
        e(true);
    }

    public final void c(int i10) {
        boolean z3;
        boolean z10 = false;
        this.D = 0;
        int i11 = (((q0.c) this.f16271i.o()).f13638i.f13646s - this.E) - 1;
        if (i10 <= i11) {
            this.A.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object obj = this.f16276v.get((androidx.compose.ui.node.a) ((q0.c) this.f16271i.o()).get(i12));
                    kotlin.jvm.internal.l.c(obj);
                    this.A.f16266i.add(((v) obj).f16323a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f16273s.f(this.A);
            y0.g gVarH = y0.m.h((y0.g) y0.m.f20077a.get(), null, false);
            try {
                y0.g gVarJ = gVarH.j();
                z3 = false;
                while (i11 >= i10) {
                    try {
                        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) ((q0.c) this.f16271i.o()).get(i11);
                        Object obj2 = this.f16276v.get(aVar);
                        kotlin.jvm.internal.l.c(obj2);
                        v vVar = (v) obj2;
                        Object obj3 = vVar.f16323a;
                        if (this.A.f16266i.contains(obj3)) {
                            this.D++;
                            if (((Boolean) vVar.f16328f.getValue()).booleanValue()) {
                                v1.i0 i0Var = aVar.N;
                                i0Var.f18434o.A = 3;
                                v1.g0 g0Var = i0Var.f18435p;
                                if (g0Var != null) {
                                    g0Var.f18395y = 3;
                                }
                                vVar.f16328f.setValue(Boolean.FALSE);
                                z3 = true;
                            }
                        } else {
                            androidx.compose.ui.node.a aVar2 = this.f16271i;
                            aVar2.B = true;
                            this.f16276v.remove(aVar);
                            o0.t tVar = vVar.f16325c;
                            if (tVar != null) {
                                tVar.l();
                            }
                            this.f16271i.K(i11, 1);
                            aVar2.B = false;
                        }
                        this.w.remove(obj3);
                        i11--;
                    } catch (Throwable th2) {
                        y0.g.p(gVarJ);
                        throw th2;
                    }
                }
                y0.g.p(gVarJ);
                gVarH.c();
            } catch (Throwable th3) {
                gVarH.c();
                throw th3;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            synchronized (y0.m.f20078b) {
                q0.b bVar = ((y0.b) y0.m.f20085i.get()).f20042h;
                if (bVar != null) {
                    if (bVar.k()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                y0.m.a();
            }
        }
        d();
    }

    public final void d() {
        int i10 = ((q0.c) this.f16271i.o()).f13638i.f13646s;
        HashMap map = this.f16276v;
        if (map.size() != i10) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + map.size() + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i10 - this.D) - this.E < 0) {
            StringBuilder sbN = android.support.v4.media.session.a.n(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbN.append(this.D);
            sbN.append(". Precomposed children ");
            sbN.append(this.E);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        HashMap map2 = this.f16279z;
        if (map2.size() == this.E) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.E + ". Map size " + map2.size()).toString());
    }

    public final void e(boolean z3) {
        this.E = 0;
        this.f16279z.clear();
        androidx.compose.ui.node.a aVar = this.f16271i;
        int i10 = ((q0.c) aVar.o()).f13638i.f13646s;
        if (this.D != i10) {
            this.D = i10;
            y0.g gVarH = y0.m.h((y0.g) y0.m.f20077a.get(), null, false);
            try {
                y0.g gVarJ = gVarH.j();
                for (int i11 = 0; i11 < i10; i11++) {
                    try {
                        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) ((q0.c) aVar.o()).get(i11);
                        v vVar = (v) this.f16276v.get(aVar2);
                        if (vVar != null && ((Boolean) vVar.f16328f.getValue()).booleanValue()) {
                            v1.i0 i0Var = aVar2.N;
                            i0Var.f18434o.A = 3;
                            v1.g0 g0Var = i0Var.f18435p;
                            if (g0Var != null) {
                                g0Var.f18395y = 3;
                            }
                            if (z3) {
                                o0.t tVar = vVar.f16325c;
                                if (tVar != null) {
                                    tVar.k();
                                }
                                vVar.f16328f = o0.p.I(Boolean.FALSE, o0.n0.f12510u);
                            } else {
                                vVar.f16328f.setValue(Boolean.FALSE);
                            }
                            vVar.f16323a = w0.f16335a;
                        }
                    } catch (Throwable th2) {
                        y0.g.p(gVarJ);
                        throw th2;
                    }
                }
                y0.g.p(gVarJ);
                gVarH.c();
                this.w.clear();
            } catch (Throwable th3) {
                gVarH.c();
                throw th3;
            }
        }
        d();
    }

    public final x0 f(Object obj, eh.e eVar) {
        androidx.compose.ui.node.a aVar = this.f16271i;
        if (!aVar.C()) {
            return new b0();
        }
        d();
        if (!this.w.containsKey(obj)) {
            this.B.remove(obj);
            HashMap map = this.f16279z;
            Object objJ = map.get(obj);
            if (objJ == null) {
                objJ = j(obj);
                if (objJ != null) {
                    int iK = ((q0.c) aVar.o()).f13638i.k(objJ);
                    int i10 = ((q0.c) aVar.o()).f13638i.f13646s;
                    aVar.B = true;
                    aVar.G(iK, i10, 1);
                    aVar.B = false;
                    this.E++;
                } else {
                    int i11 = ((q0.c) aVar.o()).f13638i.f13646s;
                    androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(2);
                    aVar.B = true;
                    aVar.v(i11, aVar2);
                    aVar.B = false;
                    this.E++;
                    objJ = aVar2;
                }
                map.put(obj, objJ);
            }
            g((androidx.compose.ui.node.a) objJ, obj, eVar);
        }
        return new c0(this, obj);
    }

    public final void g(androidx.compose.ui.node.a aVar, Object obj, eh.e eVar) {
        boolean z3;
        HashMap map = this.f16276v;
        Object obj2 = map.get(aVar);
        Object obj3 = obj2;
        if (obj2 == null) {
            w0.a aVar2 = h.f16288a;
            v vVar = new v();
            vVar.f16323a = obj;
            vVar.f16324b = aVar2;
            vVar.f16325c = null;
            vVar.f16328f = o0.p.I(Boolean.TRUE, o0.n0.f12510u);
            map.put(aVar, vVar);
            obj3 = vVar;
        }
        v vVar2 = (v) obj3;
        o0.t tVar = vVar2.f16325c;
        if (tVar != null) {
            synchronized (tVar.f12574t) {
                z3 = tVar.C.f596b > 0;
            }
        } else {
            z3 = true;
        }
        if (vVar2.f16324b != eVar || z3 || vVar2.f16326d) {
            vVar2.f16324b = eVar;
            y0.g gVarH = y0.m.h((y0.g) y0.m.f20077a.get(), null, false);
            try {
                y0.g gVarJ = gVarH.j();
                try {
                    androidx.compose.ui.node.a aVar3 = this.f16271i;
                    aVar3.B = true;
                    eh.e eVar2 = vVar2.f16324b;
                    o0.t tVar2 = vVar2.f16325c;
                    o0.r rVar = this.f16272r;
                    if (rVar == null) {
                        throw new IllegalStateException("parent composition reference not set");
                    }
                    vVar2.f16325c = h(tVar2, aVar, vVar2.f16327e, rVar, new w0.a(-1750409193, new a0.g(12, vVar2, eVar2), true));
                    vVar2.f16327e = false;
                    aVar3.B = false;
                    gVarH.c();
                    vVar2.f16326d = false;
                } finally {
                    y0.g.p(gVarJ);
                }
            } catch (Throwable th2) {
                gVarH.c();
                throw th2;
            }
        }
    }

    @Override // o0.i
    public final void i() {
        e(false);
    }

    public final androidx.compose.ui.node.a j(Object obj) {
        HashMap map;
        int i10;
        if (this.D == 0) {
            return null;
        }
        androidx.compose.ui.node.a aVar = this.f16271i;
        int i11 = ((q0.c) aVar.o()).f13638i.f13646s - this.E;
        int i12 = i11 - this.D;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            map = this.f16276v;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            Object obj2 = map.get((androidx.compose.ui.node.a) ((q0.c) aVar.o()).get(i14));
            kotlin.jvm.internal.l.c(obj2);
            if (kotlin.jvm.internal.l.a(((v) obj2).f16323a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (i13 >= i12) {
                Object obj3 = map.get((androidx.compose.ui.node.a) ((q0.c) aVar.o()).get(i13));
                kotlin.jvm.internal.l.c(obj3);
                v vVar = (v) obj3;
                Object obj4 = vVar.f16323a;
                if (obj4 == w0.f16335a || this.f16273s.h(obj, obj4)) {
                    vVar.f16323a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
            i14 = i13;
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            aVar.B = true;
            aVar.G(i14, i12, 1);
            aVar.B = false;
        }
        this.D--;
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) ((q0.c) aVar.o()).get(i12);
        Object obj5 = map.get(aVar2);
        kotlin.jvm.internal.l.c(obj5);
        v vVar2 = (v) obj5;
        vVar2.f16328f = o0.p.I(Boolean.TRUE, o0.n0.f12510u);
        vVar2.f16327e = true;
        vVar2.f16326d = true;
        return aVar2;
    }
}
