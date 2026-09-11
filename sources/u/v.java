package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17534i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f17535r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i10) {
        super(0);
        this.f17534i = i10;
        this.f17535r = wVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17534i) {
            case 0:
                this.f17535r.F.invoke();
                break;
            default:
                eh.a aVar = this.f17535r.G;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
        }
        return Boolean.TRUE;
    }
}
