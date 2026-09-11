package mi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11800i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f11801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11802s;

    public /* synthetic */ l(int i10, eh.c cVar, boolean z3) {
        this.f11800i = i10;
        this.f11801r = cVar;
        this.f11802s = z3;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f11800i) {
            case 0:
                this.f11801r.invoke(Boolean.valueOf(!this.f11802s));
                break;
            case 1:
                this.f11801r.invoke(Boolean.valueOf(!this.f11802s));
                break;
            default:
                this.f11801r.invoke(Boolean.valueOf(!this.f11802s));
                break;
        }
        return qg.o.f13926a;
    }
}
