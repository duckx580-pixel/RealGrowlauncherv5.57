package t;

import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import v.d2;
import w1.q2;
import w1.r2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16103i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16105s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        super(1);
        this.f16103i = i10;
        this.f16104r = obj;
        this.f16105s = obj2;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        t4.t tVar;
        t4.t tVar2;
        t4.t tVarA;
        int i10 = 6;
        int i11 = 5;
        int i12 = 1;
        switch (this.f16103i) {
            case 0:
                f0 f0Var = (f0) this.f16104r;
                d0 d0Var = (d0) this.f16105s;
                f0Var.f16072a.b(d0Var);
                f0Var.f16073b.setValue(Boolean.TRUE);
                return new b0.p0(4, f0Var, d0Var);
            case 1:
                f1 f1Var = (f1) this.f16104r;
                f1 f1Var2 = (f1) this.f16105s;
                f1Var.f16084i.add(f1Var2);
                return new b0.p0(i11, f1Var, f1Var2);
            case 2:
                return new b0.p0(i10, (f1) this.f16104r, (z0) this.f16105s);
            case 3:
                f1 f1Var3 = (f1) this.f16104r;
                c1 c1Var = (c1) this.f16105s;
                f1Var3.f16083h.add(c1Var);
                return new b0.p0(7, f1Var3, c1Var);
            case 4:
                ((androidx.compose.ui.node.a) this.f16104r).X(((a1.n) obj).j((a1.n) this.f16105s));
                return qg.o.f13926a;
            case 5:
                t4.e eVar = (t4.e) obj;
                t4.u uVar = (t4.u) this.f16104r;
                if (eVar == null || (tVar = eVar.f16473d) == null) {
                    tVar = t4.t.f16628d;
                }
                if (eVar == null || (tVar2 = eVar.f16474e) == null) {
                    tVar2 = t4.t.f16628d;
                }
                tVar.getClass();
                int iOrdinal = uVar.ordinal();
                if (iOrdinal == 0) {
                    tVarA = t4.t.a(tVar, 6);
                } else if (iOrdinal == 1) {
                    tVarA = t4.t.a(tVar, 5);
                } else {
                    if (iOrdinal != 2) {
                        throw new a2.d();
                    }
                    tVarA = t4.t.a(tVar, 3);
                }
                return n7.e.f((n7.e) this.f16105s, eVar, tVarA, tVar2);
            case 6:
                v1.e0 e0Var = (v1.e0) obj;
                e0Var.b();
                i1.d.b0(e0Var, (g1.i) this.f16104r, (g1.p) this.f16105s, 0.0f, null, 60);
                return qg.o.f13926a;
            case 7:
                u2.s sVar = (u2.s) this.f16104r;
                sVar.setPositionProvider((u2.v) this.f16105s);
                sVar.l();
                return new u2.f();
            case 8:
                ((q0.f) ((ae.c) this.f16104r).f594i).n((v.j) this.f16105s);
                return qg.o.f13926a;
            case 9:
                long jH = ((f1.c) obj).f5977a;
                v.q1 q1Var = (v.q1) this.f16104r;
                v.a1 a1Var = (v.a1) this.f16105s;
                if (q1Var.f18258d) {
                    jH = f1.c.h(jH, -1.0f);
                }
                long jA = q1Var.a(a1Var, jH, 2);
                if (q1Var.f18258d) {
                    jA = f1.c.h(jA, -1.0f);
                }
                return new f1.c(jA);
            case 10:
                ((Number) obj).longValue();
                d2 d2Var = (d2) this.f16104r;
                float f9 = d2Var.f18155e;
                d2Var.f18155e = 0.0f;
                ((eh.c) this.f16105s).invoke(Float.valueOf(f9));
                return qg.o.f13926a;
            case 11:
                Context context = (Context) this.f16104r;
                Context applicationContext = context.getApplicationContext();
                w1.m0 m0Var = (w1.m0) this.f16105s;
                applicationContext.registerComponentCallbacks(m0Var);
                return new b0.p0(8, context, m0Var);
            case 12:
                w1.q0 q0Var = (w1.q0) this.f16104r;
                o0.x xVar = (o0.x) this.f16105s;
                synchronized (q0Var.f18893u) {
                    q0Var.w.remove(xVar);
                }
                return qg.o.f13926a;
            case 13:
                ((Choreographer) ((o0.b1) this.f16104r).f12391r).removeFrameCallback((o0.x) this.f16105s);
                return qg.o.f13926a;
            case 14:
                w1.m mVar = (w1.m) obj;
                eh.e eVar2 = (eh.e) this.f16105s;
                r2 r2Var = (r2) this.f16104r;
                if (!r2Var.f18927s) {
                    androidx.lifecycle.p lifecycle = mVar.f18848a.getLifecycle();
                    r2Var.f18929u = eVar2;
                    if (r2Var.f18928t == null) {
                        r2Var.f18928t = lifecycle;
                        lifecycle.a(r2Var);
                    } else if (lifecycle.b().compareTo(androidx.lifecycle.o.f1908s) >= 0) {
                        r2Var.f18926r.j(new w0.a(-2000640158, new q2(r2Var, eVar2, i12), true));
                    }
                }
                return qg.o.f13926a;
            case 15:
                kotlin.jvm.internal.l.f("$this$layout", (t1.p0) obj);
                ka.v vVar = (ka.v) this.f16104r;
                List list = (List) this.f16105s;
                kotlin.jvm.internal.l.f("measurables", list);
                LinkedHashMap linkedHashMap = (LinkedHashMap) vVar.f9531f;
                if (linkedHashMap.isEmpty()) {
                    for (b3.d dVar : ((b3.e) vVar.f9528c).f2692q0) {
                        Object obj2 = dVar.f2663f0;
                        if (obj2 instanceof t1.g0) {
                            linkedHashMap.put((t1.g0) obj2, new q2.i(t6.k.b(dVar.q(), dVar.r())));
                        }
                    }
                }
                int size = list.size() - 1;
                if (size >= 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        t1.g0 g0Var = (t1.g0) list.get(i13);
                        t1.q0 q0Var2 = (t1.q0) ((LinkedHashMap) vVar.f9529d).get(g0Var);
                        if (q0Var2 != null) {
                            q2.i iVar = (q2.i) linkedHashMap.get(g0Var);
                            kotlin.jvm.internal.l.c(iVar);
                            t1.p0.e(q0Var2, iVar.f13746a, 0.0f);
                        }
                        if (i14 <= size) {
                            i13 = i14;
                        }
                    }
                }
                return qg.o.f13926a;
            default:
                y.z0 z0Var = (y.z0) this.f16104r;
                View view = (View) this.f16105s;
                y.z zVar = z0Var.f20028t;
                if (z0Var.f20027s == 0) {
                    WeakHashMap weakHashMap = s3.z0.f15140a;
                    s3.o0.u(view, zVar);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(zVar);
                    s3.z0.m(view, zVar);
                }
                z0Var.f20027s++;
                return new b0.p0(9, z0Var, view);
        }
    }
}
