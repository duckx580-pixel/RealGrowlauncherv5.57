package ll;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10180i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f10181r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(c cVar, int i10) {
        super(1);
        this.f10180i = i10;
        this.f10181r = cVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f10180i) {
            case 0:
                this.f10181r.cancel();
                break;
            default:
                this.f10181r.cancel();
                break;
        }
        return qg.o.f13926a;
    }
}
