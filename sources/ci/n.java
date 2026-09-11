package ci;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3557a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zh.h f3558b = w9.a.h("kotlinx.serialization.json.JsonElement", zh.c.f21346c, new zh.g[0], m.f3554r);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        return android.support.v4.media.session.b.g(cVar).l();
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f3558b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        k kVar = (k) obj;
        kotlin.jvm.internal.l.f("value", kVar);
        android.support.v4.media.session.b.h(dVar);
        if (kVar instanceof b0) {
            dVar.j(c0.f3531a, kVar);
        } else if (kVar instanceof x) {
            dVar.j(z.f3570a, kVar);
        } else if (kVar instanceof d) {
            dVar.j(f.f3537a, kVar);
        }
    }
}
