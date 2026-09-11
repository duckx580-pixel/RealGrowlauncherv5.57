package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f3004a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f3005b = new u0("kotlin.Double", zh.e.f21350e);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return Double.valueOf(cVar.B());
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f3005b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        dVar.f(((Number) obj).doubleValue());
    }
}
