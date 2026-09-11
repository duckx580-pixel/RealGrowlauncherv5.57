package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f16213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f16214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f16217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f16218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f16219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f16220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f16221i;

    public x0(i iVar, j1 j1Var, Object obj, Object obj2, o oVar) {
        l1 l1VarA = iVar.a(j1Var);
        this.f16213a = l1VarA;
        this.f16214b = j1Var;
        this.f16215c = obj;
        this.f16216d = obj2;
        o oVar2 = (o) j1Var.f16120a.invoke(obj);
        this.f16217e = oVar2;
        eh.c cVar = j1Var.f16120a;
        o oVar3 = (o) cVar.invoke(obj2);
        this.f16218f = oVar3;
        o oVarF = oVar != null ? d.f(oVar) : ((o) cVar.invoke(obj)).c();
        this.f16219g = oVarF;
        this.f16220h = l1VarA.b(oVar2, oVar3, oVarF);
        this.f16221i = l1VarA.n(oVar2, oVar3, oVarF);
    }

    @Override // t.f
    public final boolean a() {
        return this.f16213a.a();
    }

    @Override // t.f
    public final long b() {
        return this.f16220h;
    }

    @Override // t.f
    public final j1 c() {
        return this.f16214b;
    }

    @Override // t.f
    public final o d(long j) {
        if (e(j)) {
            return this.f16221i;
        }
        return this.f16213a.r(j, this.f16217e, this.f16218f, this.f16219g);
    }

    @Override // t.f
    public final Object f(long j) {
        if (e(j)) {
            return this.f16216d;
        }
        o oVarD = this.f16213a.d(j, this.f16217e, this.f16218f, this.f16219g);
        int iB = oVarD.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(oVarD.a(i10))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + oVarD + ". Animation: " + this + ", playTimeNanos: " + j).toString());
            }
        }
        return this.f16214b.f16121b.invoke(oVarD);
    }

    @Override // t.f
    public final Object g() {
        return this.f16216d;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f16215c + " -> " + this.f16216d + ",initial velocity: " + this.f16219g + ", duration: " + (this.f16220h / 1000000) + " ms,animationSpec: " + this.f16213a;
    }
}
