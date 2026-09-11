package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f2976a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f2977b = new u0("kotlin.Long", zh.e.f21353h);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return Long.valueOf(cVar.q());
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f2977b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        dVar.x(((Number) obj).longValue());
    }
}
