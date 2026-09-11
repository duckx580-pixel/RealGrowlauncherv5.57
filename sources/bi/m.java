package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f2993a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f2994b = new u0("kotlin.Char", zh.e.f21349d);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return Character.valueOf(cVar.i());
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f2994b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        dVar.n(((Character) obj).charValue());
    }
}
