package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2952i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ di.a f2953r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ xh.b f2954s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2955t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(di.a aVar, xh.b bVar, Object obj, int i10) {
        super(0);
        this.f2952i = i10;
        this.f2953r = aVar;
        this.f2954s = bVar;
        this.f2955t = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f2952i) {
            case 0:
                di.a aVar = this.f2953r;
                if (!aVar.s()) {
                    return null;
                }
                xh.b bVar = this.f2954s;
                kotlin.jvm.internal.l.f("deserializer", bVar);
                return di.j.h(aVar, bVar);
            default:
                xh.b bVar2 = this.f2954s;
                kotlin.jvm.internal.l.f("deserializer", bVar2);
                return di.j.h(this.f2953r, bVar2);
        }
    }
}
