package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements xh.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f2981b = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f2982a = new n0();

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        this.f2982a.deserialize(cVar);
        return qg.o.f13926a;
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return this.f2982a.f2999a;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        qg.o oVar = (qg.o) obj;
        kotlin.jvm.internal.l.f("value", oVar);
        this.f2982a.serialize(dVar, oVar);
    }
}
