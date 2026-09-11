package xi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19821i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z.q f19822r;

    public /* synthetic */ k(z.q qVar, int i10) {
        this.f19821i = i10;
        this.f19822r = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f19821i) {
            case 0:
                z.l lVarG = this.f19822r.g();
                int i10 = lVarG.j;
                z.m mVar = (z.m) rg.l.l0(lVarG.f20523g);
                return Boolean.valueOf((mVar != null ? mVar.f20527a : 0) + 1 > i10 + (-2));
            default:
                z.l lVarG2 = this.f19822r.g();
                int i11 = lVarG2.j;
                z.m mVar2 = (z.m) rg.l.l0(lVarG2.f20523g);
                return Boolean.valueOf((mVar2 != null ? mVar2.f20527a : 0) + 1 > i11 + (-2));
        }
    }
}
