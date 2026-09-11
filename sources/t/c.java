package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f16022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f16024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.z0 f16025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0.z0 f16026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f16027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f16028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f16029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f16030i;
    public final o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f16031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f16032l;

    public c(Object obj, j1 j1Var, Object obj2) {
        this.f16022a = j1Var;
        this.f16023b = obj2;
        j jVar = new j(j1Var, obj, null, 60);
        this.f16024c = jVar;
        Boolean bool = Boolean.FALSE;
        o0.n0 n0Var = o0.n0.f12510u;
        this.f16025d = o0.p.I(bool, n0Var);
        this.f16026e = o0.p.I(obj, n0Var);
        this.f16029h = new m0();
        new p0(obj2);
        o oVar = jVar.f16115s;
        boolean z3 = oVar instanceof k;
        o oVar2 = z3 ? d.f16049e : oVar instanceof l ? d.f16050f : oVar instanceof m ? d.f16051g : d.f16052h;
        this.f16030i = oVar2;
        o oVar3 = z3 ? d.f16045a : oVar instanceof l ? d.f16046b : oVar instanceof m ? d.f16047c : d.f16048d;
        this.j = oVar3;
        this.f16031k = oVar2;
        this.f16032l = oVar3;
    }

    public static final void a(c cVar) {
        j jVar = cVar.f16024c;
        jVar.f16115s.d();
        jVar.f16116t = Long.MIN_VALUE;
        cVar.f16025d.setValue(Boolean.FALSE);
    }

    public static Object b(c cVar, Object obj, i iVar, ug.c cVar2) {
        Object objInvoke = cVar.f16022a.f16121b.invoke(cVar.f16024c.f16115s);
        Object objD = cVar.d();
        j1 j1Var = cVar.f16022a;
        return m0.a(cVar.f16029h, new a(cVar, objInvoke, new x0(iVar, j1Var, objD, obj, (o) j1Var.f16120a.invoke(objInvoke)), cVar.f16024c.f16116t, null), cVar2);
    }

    public final Object c(Object obj) {
        if (kotlin.jvm.internal.l.a(this.f16031k, this.f16030i) && kotlin.jvm.internal.l.a(this.f16032l, this.j)) {
            return obj;
        }
        j1 j1Var = this.f16022a;
        o oVar = (o) j1Var.f16120a.invoke(obj);
        int iB = oVar.b();
        boolean z3 = false;
        for (int i10 = 0; i10 < iB; i10++) {
            if (oVar.a(i10) < this.f16031k.a(i10) || oVar.a(i10) > this.f16032l.a(i10)) {
                oVar.e(gh.a.d(oVar.a(i10), this.f16031k.a(i10), this.f16032l.a(i10)), i10);
                z3 = true;
            }
        }
        return z3 ? j1Var.f16121b.invoke(oVar) : obj;
    }

    public final Object d() {
        return this.f16024c.f16114r.getValue();
    }

    public final Object e(Object obj, ug.c cVar) {
        Object objA = m0.a(this.f16029h, new b(this, obj, null), cVar);
        return objA == vg.a.f18663i ? objA : qg.o.f13926a;
    }

    public /* synthetic */ c(Object obj, j1 j1Var, Object obj2, int i10) {
        this(obj, j1Var, (i10 & 4) != 0 ? null : obj2);
    }
}
