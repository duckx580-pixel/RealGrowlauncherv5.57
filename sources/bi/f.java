package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2962a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f2963b = new u0("kotlin.Boolean", zh.e.f21347b);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return Boolean.valueOf(cVar.h());
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f2963b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        dVar.i(((Boolean) obj).booleanValue());
    }
}
