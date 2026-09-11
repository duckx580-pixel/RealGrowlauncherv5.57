package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh.c f2995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f2996b;

    public m0(xh.c cVar) {
        kotlin.jvm.internal.l.f("serializer", cVar);
        this.f2995a = cVar;
        this.f2996b = new x0(cVar.getDescriptor());
    }

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        if (cVar.s()) {
            return cVar.x(this.f2995a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kotlin.jvm.internal.y.a(m0.class).equals(kotlin.jvm.internal.y.a(obj.getClass())) && kotlin.jvm.internal.l.a(this.f2995a, ((m0) obj).f2995a);
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return this.f2996b;
    }

    public final int hashCode() {
        return this.f2995a.hashCode();
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        if (obj != null) {
            dVar.j(this.f2995a, obj);
        } else {
            dVar.e();
        }
    }
}
