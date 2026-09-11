package ci;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements xh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f3537a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f3538b = e.f3534b;

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        kotlin.jvm.internal.l.f("decoder", cVar);
        android.support.v4.media.session.b.g(cVar);
        return new d((List) new bi.c(n.f3557a, 0).deserialize(cVar));
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return f3538b;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        d dVar2 = (d) obj;
        kotlin.jvm.internal.l.f("value", dVar2);
        android.support.v4.media.session.b.h(dVar);
        new bi.c(n.f3557a, 0).serialize(dVar, dVar2);
    }
}
