package t;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.appcompat.widget.w3;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Map;
import t6.t3;
import u.t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16165i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16166r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10, Object obj) {
        super(1);
        this.f16165i = i10;
        this.f16166r = obj;
    }

    /* JADX WARN: Type inference failed for: r3v37, types: [t1.q0, v1.a] */
    @Override // eh.c
    public final Object invoke(Object obj) {
        float f9 = 0.0f;
        switch (this.f16165i) {
            case 0:
                h hVar = (h) obj;
                a0.g gVar = (a0.g) this.f16166r;
                Object value = hVar.f16098e.getValue();
                j1 j1Var = k1.f16126a;
                gVar.invoke(value, Float.valueOf(((k) hVar.f16099f).f16122a));
                return qg.o.f13926a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                t1.x0 x0Var = (t1.x0) entry.getValue();
                t1.d0 d0Var = (t1.d0) this.f16166r;
                int iK = d0Var.C.k(key);
                if (iK < 0 || iK >= d0Var.f16275u) {
                    x0Var.dispose();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ((androidx.compose.ui.node.a) this.f16166r).U((q2.b) obj);
                return qg.o.f13926a;
            case 3:
                ((rh.v0) ((mf.c) this.f16166r).f11701i).d(null);
                return qg.o.f13926a;
            case 4:
                ((t4.h1) this.f16166r).f16513i.h(null, false);
                return qg.o.f13926a;
            case 5:
                t6.n1 n1Var = (t6.n1) obj;
                kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, n1Var);
                if (n1Var == t6.n1.f16935r) {
                    ((t6.b0) ((w3) this.f16166r).f1068v).c("didSendRevenueTriggerOnLastBackground", true);
                }
                return qg.o.f13926a;
            case 6:
                ConnectivityManager connectivityManager = (ConnectivityManager) ((t3) this.f16166r).f1693a;
                kotlin.jvm.internal.l.c(connectivityManager);
                return connectivityManager.getNetworkInfo((Network) obj);
            case 7:
                long j = ((q2.k) obj).f13751a;
                long jC = te.a.C(j);
                u.f fVar = (u.f) this.f16166r;
                boolean zA = f1.f.a(jC, fVar.f17440p);
                fVar.f17440p = te.a.C(j);
                if (!zA) {
                    int i10 = (int) (j >> 32);
                    int i11 = (int) (j & 4294967295L);
                    fVar.f17428c.setSize(i10, i11);
                    fVar.f17429d.setSize(i10, i11);
                    fVar.f17430e.setSize(i11, i10);
                    fVar.f17431f.setSize(i11, i10);
                    fVar.f17433h.setSize(i10, i11);
                    fVar.f17434i.setSize(i10, i11);
                    fVar.j.setSize(i11, i10);
                    fVar.f17435k.setSize(i11, i10);
                }
                if (!zA) {
                    fVar.i();
                    fVar.e();
                }
                return qg.o.f13926a;
            case 8:
                d1.c cVar = (d1.c) obj;
                u.o oVar = (u.o) this.f16166r;
                if (cVar.a() * oVar.G < 0.0f || f1.f.c(cVar.f4804i.e()) <= 0.0f) {
                    return cVar.b(u.m.f17463r);
                }
                float f10 = 2;
                float fMin = Math.min(q2.e.a(oVar.G, 0.0f) ? 1.0f : (float) Math.ceil(cVar.a() * oVar.G), (float) Math.ceil(f1.f.c(cVar.f4804i.e()) / f10));
                float f11 = fMin / f10;
                long jB = vd.a.b(f11, f11);
                long jH = a.a.h(f1.f.d(cVar.f4804i.e()) - fMin, f1.f.b(cVar.f4804i.e()) - fMin);
                boolean z3 = f10 * fMin > f1.f.c(cVar.f4804i.e());
                g1.f0 f0VarB = oVar.I.b(cVar.f4804i.e(), cVar.f4804i.getLayoutDirection(), cVar);
                if (!(f0VarB instanceof g1.d0)) {
                    if (!(f0VarB instanceof g1.c0)) {
                        throw new a2.d();
                    }
                    g1.m0 m0Var = oVar.H;
                    if (z3) {
                        jB = f1.c.f5973b;
                    }
                    long j10 = jB;
                    if (z3) {
                        jH = cVar.f4804i.e();
                    }
                    return cVar.b(new s.a0(m0Var, j10, jH, z3 ? i1.g.f7990a : new i1.h(fMin, 0.0f, 0, 0, 30), 1));
                }
                g1.m0 m0Var2 = oVar.H;
                f1.e eVar = ((g1.d0) f0VarB).f6864e;
                if (xd.c.o(eVar)) {
                    return cVar.b(new u.n(z3, m0Var2, eVar.f5987e, f11, fMin, jB, jH, new i1.h(fMin, 0.0f, 0, 0, 30)));
                }
                if (oVar.F == null) {
                    u.l lVar = new u.l();
                    lVar.f17461a = null;
                    oVar.F = lVar;
                }
                u.l lVar2 = oVar.F;
                kotlin.jvm.internal.l.c(lVar2);
                g1.i iVar = lVar2.f17461a;
                g1.i iVar2 = iVar;
                if (iVar == null) {
                    g1.i iVarG = g1.f0.g();
                    lVar2.f17461a = iVarG;
                    iVar2 = iVarG;
                }
                iVar2.c();
                iVar2.a(eVar);
                if (!z3) {
                    g1.i iVarG2 = g1.f0.g();
                    iVarG2.a(new f1.e(fMin, fMin, eVar.b() - fMin, eVar.a() - fMin, qd.a.o(eVar.f5987e, fMin), qd.a.o(eVar.f5988f, fMin), qd.a.o(eVar.f5989g, fMin), qd.a.o(eVar.f5990h, fMin)));
                    iVar2.b(iVar2, iVarG2, 0);
                }
                return cVar.b(new h0(6, iVar2, m0Var2));
            case 9:
                long j11 = ((f1.c) obj).f5977a;
                u.u uVar = (u.u) this.f16166r;
                if (uVar.F) {
                    uVar.H.invoke();
                }
                return qg.o.f13926a;
            case 10:
                t1.p pVar = (t1.p) obj;
                u.n0 n0Var = (u.n0) this.f16166r;
                if (n0Var.C) {
                    n0Var.D.invoke(pVar);
                    eh.c cVar2 = n0Var.C ? (eh.c) n0Var.h(u.l0.f17462a) : null;
                    if (cVar2 != null) {
                        cVar2.invoke(pVar);
                    }
                }
                return qg.o.f13926a;
            case 11:
                float fFloatValue = ((Number) obj).floatValue();
                t1 t1Var = (t1) this.f16166r;
                o0.w0 w0Var = t1Var.f17526a;
                float f12 = w0Var.f() + fFloatValue + t1Var.f17530e;
                float fD = gh.a.d(f12, 0.0f, t1Var.f17529d.f());
                z = f12 == fD;
                float f13 = fD - w0Var.f();
                int iZ = gh.a.z(f13);
                w0Var.g(w0Var.f() + iZ);
                t1Var.f17530e = f13 - iZ;
                if (!z) {
                    fFloatValue = f13;
                }
                return Float.valueOf(fFloatValue);
            case 12:
                q1.q qVar = (q1.q) obj;
                ((eh.e) this.f16166r).invoke(qVar, new f1.c(q1.o.f(qVar, false)));
                qVar.a();
                return qg.o.f13926a;
            case 13:
                ((v.j1) this.f16166r).Q.J = (t1.p) obj;
                return qg.o.f13926a;
            case 14:
                v1.a aVar = (v1.a) obj;
                v1.d0 d0Var2 = (v1.d0) this.f16166r;
                if (aVar.E()) {
                    if (aVar.c().f18368b) {
                        aVar.B();
                    }
                    for (Map.Entry entry2 : aVar.c().f18375i.entrySet()) {
                        v1.d0.a(d0Var2, (t1.l) entry2.getKey(), ((Number) entry2.getValue()).intValue(), aVar.f());
                    }
                    v1.t0 t0Var = aVar.f().A;
                    kotlin.jvm.internal.l.c(t0Var);
                    while (!t0Var.equals(d0Var2.f18367a.f())) {
                        for (t1.l lVar3 : d0Var2.b(t0Var).keySet()) {
                            v1.d0.a(d0Var2, lVar3, d0Var2.c(t0Var, lVar3), t0Var);
                        }
                        t0Var = t0Var.A;
                        kotlin.jvm.internal.l.c(t0Var);
                    }
                }
                return qg.o.f13926a;
            case 15:
                ((q0.f) this.f16166r).b((a1.l) obj);
                return Boolean.TRUE;
            case 16:
                g1.r rVar = (g1.r) obj;
                v1.t0 t0Var2 = (v1.t0) this.f16166r;
                androidx.compose.ui.node.a aVar2 = t0Var2.f18489y;
                if (aVar2.D()) {
                    v1.a1 snapshotObserver = ((w1.t) v1.f.z(aVar2)).getSnapshotObserver();
                    g1.h0 h0Var = v1.t0.R;
                    snapshotObserver.a(t0Var2, v1.e.f18377s, new a0.r(21, t0Var2, rVar));
                    t0Var2.P = false;
                } else {
                    t0Var2.P = true;
                }
                return qg.o.f13926a;
            case 17:
                return new b0.p(7, (w1.e1) this.f16166r);
            case 18:
                qg.o oVar2 = qg.o.f13926a;
                if (w1.i1.f18828b.compareAndSet(false, true)) {
                    ((qh.d) this.f16166r).l(oVar2);
                }
                return oVar2;
            case 19:
                ((wh.i) this.f16166r).b();
                return qg.o.f13926a;
            case 20:
                x0.j jVar = ((x0.g) this.f16166r).f19360c;
                return Boolean.valueOf(jVar != null ? jVar.a(obj) : true);
            case 21:
                zh.a aVar3 = (zh.a) obj;
                kotlin.jvm.internal.l.f("$this$buildSerialDescriptor", aVar3);
                zh.a.a(aVar3, "type", bi.c1.f2947b);
                zh.a.a(aVar3, "value", w9.a.i("kotlinx.serialization.Polymorphic<" + ((Object) ((kotlin.jvm.internal.f) ((xh.e) this.f16166r).f19756a).b()) + '>', zh.i.f21364b, new zh.g[0]));
                return qg.o.f13926a;
            case 22:
                y0.v vVar = (y0.v) this.f16166r;
                synchronized (vVar.f20117f) {
                    y0.u uVar2 = vVar.f20119h;
                    kotlin.jvm.internal.l.c(uVar2);
                    Object obj2 = uVar2.f20102b;
                    kotlin.jvm.internal.l.c(obj2);
                    int i12 = uVar2.f20104d;
                    q.r rVar2 = uVar2.f20103c;
                    if (rVar2 == null) {
                        rVar2 = new q.r();
                        uVar2.f20103c = rVar2;
                        uVar2.f20106f.i(obj2, rVar2);
                    }
                    uVar2.c(obj, i12, obj2, rVar2);
                }
                return qg.o.f13926a;
            case 23:
                float fFloatValue2 = ((Number) obj).floatValue();
                z.q qVar2 = (z.q) this.f16166r;
                float f14 = -fFloatValue2;
                if ((f14 >= 0.0f || qVar2.a()) && (f14 <= 0.0f || qVar2.c())) {
                    if (Math.abs(qVar2.f20560f) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + qVar2.f20560f).toString());
                    }
                    float f15 = qVar2.f20560f + f14;
                    qVar2.f20560f = f15;
                    if (Math.abs(f15) > 0.5f) {
                        z.l lVar4 = (z.l) qVar2.f20558d.getValue();
                        float f16 = qVar2.f20560f;
                        int iZ2 = gh.a.z(f16);
                        z.l lVar5 = qVar2.f20556b;
                        boolean zE = lVar4.e(iZ2, !qVar2.f20555a);
                        if (zE && lVar5 != null) {
                            zE = lVar5.e(iZ2, true);
                        }
                        if (zE) {
                            qVar2.f(lVar4, qVar2.f20555a, true);
                            qVar2.f20575v.setValue(qg.o.f13926a);
                            qVar2.h(f16 - qVar2.f20560f, lVar4);
                        } else {
                            androidx.compose.ui.node.a aVar4 = qVar2.f20566m;
                            if (aVar4 != null) {
                                aVar4.j();
                            }
                            qVar2.h(f16 - qVar2.f20560f, qVar2.g());
                        }
                    }
                    if (Math.abs(qVar2.f20560f) > 0.5f) {
                        f14 -= qVar2.f20560f;
                        qVar2.f20560f = 0.0f;
                    }
                    f9 = f14;
                }
                return Float.valueOf(-f9);
            default:
                int iIntValue = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                zh.h hVar2 = (zh.h) this.f16166r;
                sb2.append(hVar2.f21359e[iIntValue]);
                sb2.append(": ");
                sb2.append(hVar2.f21360f[iIntValue].a());
                return sb2.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a0.g gVar) {
        super(1);
        this.f16165i = 0;
        j1 j1Var = k1.f16126a;
        this.f16166r = gVar;
    }
}
