package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f16193i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f16194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f16195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f16196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.c f16197u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kotlin.jvm.internal.x xVar, float f9, f fVar, j jVar, eh.c cVar) {
        super(1);
        this.f16193i = xVar;
        this.f16194r = f9;
        this.f16195s = fVar;
        this.f16196t = jVar;
        this.f16197u = cVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f16193i.f9667i;
        kotlin.jvm.internal.l.c(obj2);
        d.i((h) obj2, jLongValue, this.f16194r, this.f16195s, this.f16196t, this.f16197u);
        return qg.o.f13926a;
    }
}
