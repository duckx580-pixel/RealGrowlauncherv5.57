package ci;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f3564a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zh.h f3565b = w9.a.i("kotlinx.serialization.json.JsonNull", zh.i.f21365c, new zh.g[0]);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        android.support.v4.media.session.b.g(cVar);
        if (cVar.s()) {
            throw new di.f("Expected 'null' literal");
        }
        return u.INSTANCE;
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f3565b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        kotlin.jvm.internal.l.f("value", (u) obj);
        android.support.v4.media.session.b.h(dVar);
        dVar.e();
    }
}
