package pi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13516i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f13517r;

    public /* synthetic */ n(g gVar, int i10) {
        this.f13516i = i10;
        this.f13517r = gVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10 = this.f13516i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        switch (i10) {
            case 0:
                this.f13517r.f13490g.invoke(bool, null);
                break;
            default:
                this.f13517r.f13490g.invoke(bool, null);
                break;
        }
        return qg.o.f13926a;
    }
}
