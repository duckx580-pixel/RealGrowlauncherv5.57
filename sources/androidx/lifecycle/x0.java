package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface x0 {
    default v0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default v0 d(kotlin.jvm.internal.f fVar, m4.c cVar) {
        return e(a.a.w(fVar), cVar);
    }

    default v0 e(Class cls, m4.c cVar) {
        return a(cls);
    }
}
