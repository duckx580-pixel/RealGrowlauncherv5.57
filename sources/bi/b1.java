package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f2941a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f2942b = new u0("kotlin.Short", zh.e.f21354i);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return Short.valueOf(cVar.z());
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f2942b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        dVar.g(((Number) obj).shortValue());
    }
}
