package u2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f17604i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f17605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q2.j f17606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17608u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.w wVar, s sVar, q2.j jVar, long j, long j10) {
        super(0);
        this.f17604i = wVar;
        this.f17605r = sVar;
        this.f17606s = jVar;
        this.f17607t = j;
        this.f17608u = j10;
    }

    @Override // eh.a
    public final Object invoke() {
        s sVar = this.f17605r;
        this.f17604i.f9666i = sVar.getPositionProvider().a(this.f17606s, this.f17607t, sVar.getParentLayoutDirection(), this.f17608u);
        return qg.o.f13926a;
    }
}
