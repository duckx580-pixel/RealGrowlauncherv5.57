package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh.h f2999a = w9.a.i("kotlin.Unit", zh.j.f21369e, new zh.g[0]);

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        zh.h hVar = this.f2999a;
        cVar.d(hVar).b(hVar);
        return qg.o.f13926a;
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return this.f2999a;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        kotlin.jvm.internal.l.f("value", obj);
        zh.h hVar = this.f2999a;
        dVar.d(hVar).b(hVar);
    }
}
