package b8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f2780g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f fVar, int i10) {
        super(fVar, i10, null);
        this.f2780g = fVar;
    }

    @Override // b8.v
    public final void a(y7.a aVar) {
        f fVar = this.f2780g;
        fVar.E.a(aVar);
        fVar.f2774t = aVar.f20169r;
        fVar.f2775u = System.currentTimeMillis();
    }

    @Override // b8.v
    public final boolean b() {
        this.f2780g.E.a(y7.a.f20167u);
        return true;
    }
}
