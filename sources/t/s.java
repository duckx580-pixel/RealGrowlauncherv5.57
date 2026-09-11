package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5.i f16176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f16177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f16179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f16180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f16181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f16182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f16183h;

    public s(t tVar, j1 j1Var, Object obj, o oVar) {
        kb.c cVar = tVar.f16186a;
        u5.i iVar = new u5.i();
        iVar.f17666i = cVar;
        this.f16176a = iVar;
        this.f16177b = j1Var;
        this.f16178c = obj;
        o oVar2 = (o) j1Var.f16120a.invoke(obj);
        this.f16179d = oVar2;
        this.f16180e = d.f(oVar);
        eh.c cVar2 = j1Var.f16121b;
        if (((o) iVar.f17669t) == null) {
            iVar.f17669t = oVar2.c();
        }
        o oVar3 = (o) iVar.f17669t;
        if (oVar3 == null) {
            kotlin.jvm.internal.l.l("targetVector");
            throw null;
        }
        int iB = oVar3.b();
        int i10 = 0;
        while (i10 < iB) {
            o oVar4 = (o) iVar.f17669t;
            if (oVar4 == null) {
                kotlin.jvm.internal.l.l("targetVector");
                throw null;
            }
            kb.c cVar3 = (kb.c) iVar.f17666i;
            float fA = oVar2.a(i10);
            float fA2 = oVar.a(i10);
            s.j0 j0Var = (s.j0) cVar3.f9562i;
            double dB = j0Var.b(fA2);
            double d10 = s.k0.f14955a;
            int i11 = i10;
            oVar4.e((Math.signum(fA2) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * ((double) (j0Var.f14950a * j0Var.f14951b))))) + fA, i11);
            i10 = i11 + 1;
        }
        o oVar5 = (o) iVar.f17669t;
        if (oVar5 == null) {
            kotlin.jvm.internal.l.l("targetVector");
            throw null;
        }
        this.f16182g = cVar2.invoke(oVar5);
        u5.i iVar2 = this.f16176a;
        o oVar6 = this.f16179d;
        if (((o) iVar2.f17668s) == null) {
            iVar2.f17668s = oVar6.c();
        }
        o oVar7 = (o) iVar2.f17668s;
        if (oVar7 == null) {
            kotlin.jvm.internal.l.l("velocityVector");
            throw null;
        }
        int iB2 = oVar7.b();
        long jMax = 0;
        for (int i12 = 0; i12 < iB2; i12++) {
            kb.c cVar4 = (kb.c) iVar2.f17666i;
            oVar6.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((s.j0) cVar4.f9562i).b(oVar.a(i12)) / (((double) s.k0.f14955a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f16183h = jMax;
        o oVarF = d.f(this.f16176a.k(jMax, this.f16179d, oVar));
        this.f16181f = oVarF;
        int iB3 = oVarF.b();
        for (int i13 = 0; i13 < iB3; i13++) {
            o oVar8 = this.f16181f;
            float fA3 = oVar8.a(i13);
            this.f16176a.getClass();
            this.f16176a.getClass();
            oVar8.e(gh.a.d(fA3, -0.0f, 0.0f), i13);
        }
    }

    @Override // t.f
    public final boolean a() {
        return false;
    }

    @Override // t.f
    public final long b() {
        return this.f16183h;
    }

    @Override // t.f
    public final j1 c() {
        return this.f16177b;
    }

    @Override // t.f
    public final o d(long j) {
        if (e(j)) {
            return this.f16181f;
        }
        return this.f16176a.k(j, this.f16179d, this.f16180e);
    }

    @Override // t.f
    public final Object f(long j) {
        if (e(j)) {
            return this.f16182g;
        }
        eh.c cVar = this.f16177b.f16121b;
        u5.i iVar = this.f16176a;
        o oVar = (o) iVar.f17667r;
        o oVar2 = this.f16179d;
        if (oVar == null) {
            iVar.f17667r = oVar2.c();
        }
        o oVar3 = (o) iVar.f17667r;
        if (oVar3 == null) {
            kotlin.jvm.internal.l.l("valueVector");
            throw null;
        }
        int iB = oVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            o oVar4 = (o) iVar.f17667r;
            if (oVar4 == null) {
                kotlin.jvm.internal.l.l("valueVector");
                throw null;
            }
            kb.c cVar2 = (kb.c) iVar.f17666i;
            float fA = oVar2.a(i10);
            long j10 = j / 1000000;
            s.i0 i0VarA = ((s.j0) cVar2.f9562i).a(this.f16180e.a(i10));
            long j11 = i0VarA.f14948c;
            oVar4.e((Math.signum(i0VarA.f14946a) * i0VarA.f14947b * s.b.a(j11 > 0 ? j10 / j11 : 1.0f).f14898a) + fA, i10);
        }
        o oVar5 = (o) iVar.f17667r;
        if (oVar5 != null) {
            return cVar.invoke(oVar5);
        }
        kotlin.jvm.internal.l.l("valueVector");
        throw null;
    }

    @Override // t.f
    public final Object g() {
        return this.f16182g;
    }
}
