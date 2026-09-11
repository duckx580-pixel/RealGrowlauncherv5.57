package ll;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10168a;

    public l(Executor executor) {
        this.f10168a = executor;
    }

    @Override // ll.d
    public final e a(Type type, Annotation[] annotationArr) {
        if (r0.f(type) != c.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new x7.h(13, r0.e(0, (ParameterizedType) type), r0.i(annotationArr, m0.class) ? null : this.f10168a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
