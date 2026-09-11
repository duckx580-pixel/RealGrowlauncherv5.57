package ll;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f10117a = new h();

    @Override // ll.d
    public final e a(Type type, Annotation[] annotationArr) {
        if (r0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeE = r0.e(0, (ParameterizedType) type);
        if (r0.f(typeE) != k0.class) {
            return new u5.l(typeE);
        }
        if (typeE instanceof ParameterizedType) {
            return new kb.c(r0.e(0, (ParameterizedType) typeE));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
