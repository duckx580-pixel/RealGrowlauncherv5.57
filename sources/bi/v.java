package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f3032a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f3033b = new u0("kotlin.Float", zh.e.f21351f);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return Float.valueOf(cVar.A());
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f3033b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        dVar.l(((Number) obj).floatValue());
    }
}
