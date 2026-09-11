package m0;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements t1.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11376a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f11377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11379d;

    public w(float f9, y.e eVar, y.g gVar) {
        this.f11377b = f9;
        this.f11378c = eVar;
        this.f11379d = gVar;
    }

    @Override // t1.h0
    public final t1.i0 a(t1.j0 j0Var, List list, long j) {
        int iH;
        switch (this.f11376a) {
            case 0:
                kotlin.jvm.internal.l.f("$this$Layout", j0Var);
                kotlin.jvm.internal.l.f("measurables", list);
                List<t1.g0> list2 = list;
                for (t1.g0 g0Var : list2) {
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(g0Var), "navigationIcon")) {
                        t1.q0 q0VarN = g0Var.n(q2.a.a(j, 0, 0, 0, 0, 14));
                        for (t1.g0 g0Var2 : list2) {
                            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(g0Var2), "actionIcons")) {
                                t1.q0 q0VarN2 = g0Var2.n(q2.a.a(j, 0, 0, 0, 0, 14));
                                if (q2.a.h(j) == Integer.MAX_VALUE) {
                                    iH = q2.a.h(j);
                                } else {
                                    iH = (q2.a.h(j) - q0VarN.f16308i) - q0VarN2.f16308i;
                                    if (iH < 0) {
                                        iH = 0;
                                    }
                                }
                                int i10 = iH;
                                for (t1.g0 g0Var3 : list2) {
                                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(g0Var3), "title")) {
                                        t1.q0 q0VarN3 = g0Var3.n(q2.a.a(j, 0, i10, 0, 0, 12));
                                        t1.l lVar = t1.c.f16268b;
                                        int iP = q0VarN3.P(lVar) != Integer.MIN_VALUE ? q0VarN3.P(lVar) : 0;
                                        int iZ = gh.a.z(this.f11377b);
                                        return j0Var.V(q2.a.h(j), iZ, rg.t.f14665i, new v(q0VarN, iZ, q0VarN3, (y.e) this.f11378c, j, q0VarN2, j0Var, (y.g) this.f11379d, iP));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                kotlin.jvm.internal.l.f("$this$Layout", j0Var);
                kotlin.jvm.internal.l.f("measurables", list);
                List<t1.g0> list3 = list;
                for (t1.g0 g0Var4 : list3) {
                    if (androidx.compose.ui.layout.a.a(g0Var4) == t4.f11294i) {
                        t1.q0 q0VarN4 = g0Var4.n(j);
                        for (t1.g0 g0Var5 : list3) {
                            if (androidx.compose.ui.layout.a.a(g0Var5) == t4.f11295r) {
                                t1.q0 q0VarN5 = g0Var5.n(q2.a.a(rk.a.f0(j, -q0VarN4.f16308i, 0, 2), 0, 0, 0, 0, 11));
                                int i11 = q0VarN4.f16308i + q0VarN5.f16308i;
                                int iMax = Math.max(q0VarN5.f16309r, q0VarN4.f16309r);
                                ((o0.s0) this.f11378c).setValue(Float.valueOf(q0VarN4.f16308i));
                                ((o0.s0) this.f11379d).setValue(Integer.valueOf(i11));
                                return j0Var.V(i11, iMax, rg.t.f14665i, new y4(q0VarN5, q0VarN4.f16308i / 2, (iMax - q0VarN5.f16309r) / 2, q0VarN4, gh.a.z(q0VarN5.f16308i * this.f11377b), (iMax - q0VarN4.f16309r) / 2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public w(o0.s0 s0Var, o0.s0 s0Var2, float f9) {
        this.f11378c = s0Var;
        this.f11379d = s0Var2;
        this.f11377b = f9;
    }
}
