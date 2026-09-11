package s;

import java.util.LinkedHashMap;
import t.i1;
import t.j1;
import t.k1;
import t.q1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f15008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t.p0 f15009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t.p0 f15010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t.p0 f15011d;

    static {
        c cVar = c.w;
        c cVar2 = c.f14914x;
        j1 j1Var = k1.f16126a;
        f15008a = new j1(cVar, cVar2);
        f15009b = t.d.m(400.0f, null, 5);
        int i10 = q2.i.f13745c;
        Object obj = q1.f16167a;
        f15010c = t.d.m(400.0f, new q2.i(t6.k.b(1, 1)), 1);
        f15011d = t.d.m(400.0f, new q2.k(te.a.c(1, 1)), 1);
    }

    public static final e0 a(a1.d dVar, eh.c cVar, t.y yVar) {
        return new e0(new p0((g0) null, (n0) null, new t(dVar, cVar, yVar), (ud.a) null, (LinkedHashMap) null, 59));
    }

    public static e0 b(i1 i1Var, int i10) {
        a1.c cVar = a1.a.f184z;
        a1.c cVar2 = a1.a.f182x;
        int i11 = 1;
        t.y yVarM = i1Var;
        if ((i10 & 1) != 0) {
            Object obj = q1.f16167a;
            yVarM = t.d.m(400.0f, new q2.k(te.a.c(1, 1)), 1);
        }
        a1.c cVar3 = (i10 & 2) != 0 ? cVar : cVar2;
        return a(kotlin.jvm.internal.l.a(cVar3, cVar2) ? a1.a.f177r : kotlin.jvm.internal.l.a(cVar3, cVar) ? a1.a.f181v : a1.a.f179t, new c(i11, 12), yVarM);
    }

    public static e0 c(i1 i1Var, int i10) {
        t.y yVarM = i1Var;
        if ((i10 & 1) != 0) {
            yVarM = t.d.m(400.0f, null, 5);
        }
        return new e0(new p0(new g0(yVarM), (n0) null, (t) null, (ud.a) null, (LinkedHashMap) null, 62));
    }

    public static f0 d(i1 i1Var, int i10) {
        t.y yVarM = i1Var;
        if ((i10 & 1) != 0) {
            yVarM = t.d.m(400.0f, null, 5);
        }
        return new f0(new p0(new g0(yVarM), (n0) null, (t) null, (ud.a) null, (LinkedHashMap) null, 62));
    }

    public static final f0 e(a1.d dVar, eh.c cVar, t.y yVar) {
        return new f0(new p0((g0) null, (n0) null, new t(dVar, cVar, yVar), (ud.a) null, (LinkedHashMap) null, 59));
    }

    public static f0 f(i1 i1Var, int i10) {
        a1.c cVar = a1.a.f184z;
        a1.c cVar2 = a1.a.f182x;
        int i11 = 1;
        t.y yVarM = i1Var;
        if ((i10 & 1) != 0) {
            Object obj = q1.f16167a;
            yVarM = t.d.m(400.0f, new q2.k(te.a.c(1, 1)), 1);
        }
        a1.c cVar3 = (i10 & 2) != 0 ? cVar : cVar2;
        return e(kotlin.jvm.internal.l.a(cVar3, cVar2) ? a1.a.f177r : kotlin.jvm.internal.l.a(cVar3, cVar) ? a1.a.f181v : a1.a.f179t, new c(i11, 13), yVarM);
    }

    public static final e0 g(eh.c cVar, t.y yVar) {
        return new e0(new p0((g0) null, new n0(new y(cVar, 2), yVar), (t) null, (ud.a) null, (LinkedHashMap) null, 61));
    }

    public static e0 h(eh.c cVar) {
        int i10 = q2.i.f13745c;
        Object obj = q1.f16167a;
        return g(cVar, t.d.m(400.0f, new q2.i(t6.k.b(1, 1)), 1));
    }

    public static f0 i(eh.c cVar) {
        int i10 = q2.i.f13745c;
        Object obj = q1.f16167a;
        return new f0(new p0((g0) null, new n0(new y(cVar, 3), t.d.m(400.0f, new q2.i(t6.k.b(1, 1)), 1)), (t) null, (ud.a) null, (LinkedHashMap) null, 61));
    }
}
