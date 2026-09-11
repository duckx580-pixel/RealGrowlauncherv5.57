package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h1 f14787i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h1 f14788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ wg.i f14789s;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(h1 h1Var, h1 h1Var2, eh.f fVar) {
        this.f14787i = h1Var;
        this.f14788r = h1Var2;
        this.f14789s = (wg.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eh.f, wg.i] */
    @Override // rh.h
    public final Object collect(i iVar, ug.c cVar) throws Throwable {
        sh.o oVar = new sh.o(new h[]{this.f14787i, this.f14788r}, new b0((eh.f) this.f14789s, (ug.c) null), iVar, null);
        sh.q qVar = new sh.q(cVar, cVar.getContext());
        Object objC = gh.a.C(qVar, qVar, oVar);
        vg.a aVar = vg.a.f18663i;
        qg.o oVar2 = qg.o.f13926a;
        if (objC != aVar) {
            objC = oVar2;
        }
        return objC == aVar ? objC : oVar2;
    }
}
