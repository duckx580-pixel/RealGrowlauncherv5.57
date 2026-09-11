package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends cb.f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static w0 f1938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b8.l f1939v = new b8.l();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Application f1940t;

    public w0(Application application) {
        super(2);
        this.f1940t = application;
    }

    @Override // cb.f, androidx.lifecycle.x0
    public final v0 a(Class cls) {
        Application application = this.f1940t;
        if (application != null) {
            return n(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // cb.f, androidx.lifecycle.x0
    public final v0 e(Class cls, m4.c cVar) {
        if (this.f1940t != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f11568a.get(f1939v);
        if (application != null) {
            return n(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return a.a.o(cls);
    }

    public final v0 n(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return a.a.o(cls);
        }
        try {
            v0 v0Var = (v0) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.l.e("{\n                try {\n…          }\n            }", v0Var);
            return v0Var;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
