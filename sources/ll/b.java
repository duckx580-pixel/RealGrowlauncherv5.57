package ll;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10105a;

    @Override // ll.i
    public final j a(Type type) {
        if (bj.a0.class.isAssignableFrom(r0.f(type))) {
            return a.f10096t;
        }
        return null;
    }

    @Override // ll.i
    public final j b(Type type, Annotation[] annotationArr, al.h hVar) {
        if (type == bj.f0.class) {
            return r0.i(annotationArr, nl.w.class) ? a.f10097u : a.f10095s;
        }
        if (type == Void.class) {
            return a.w;
        }
        if (!this.f10105a || type != qg.o.class) {
            return null;
        }
        try {
            return a.f10098v;
        } catch (NoClassDefFoundError unused) {
            this.f10105a = false;
            return null;
        }
    }
}
