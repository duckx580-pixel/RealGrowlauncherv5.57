package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f2946a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f2947b = new u0("kotlin.String", zh.e.j);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return cVar.o();
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f2947b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.l.f("value", str);
        dVar.D(str);
    }
}
