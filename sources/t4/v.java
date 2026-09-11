package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f16642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mf.c f16643b;

    public v(o4.a aVar, v0 v0Var) {
        kotlin.jvm.internal.l.f("parent", v0Var);
        this.f16642a = v0Var;
        rh.h hVar = v0Var.f16644a;
        mf.c cVar = new mf.c();
        cVar.f11702r = new af.a(11, (byte) 0);
        rh.v0 v0VarA = rh.w0.a(1, Integer.MAX_VALUE, 1);
        cVar.f11701i = v0VarA;
        ug.c cVar2 = null;
        cVar.f11703s = new rh.m1(v0VarA, new androidx.work.e(cVar, null));
        oh.m1 m1VarS = oh.x.s(aVar, null, 2, new t.d1(hVar, cVar, cVar2, 2), 1);
        m1VarS.Q(new t.q0(3, cVar));
        cVar.f11704t = m1VarS;
        cVar.f11705u = new a6.i(new t.d1(1, cVar, cVar2));
        this.f16643b = cVar;
    }
}
