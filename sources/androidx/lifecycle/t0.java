package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f1930a = sb.c.D(Application.class, m0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f1931b = sb.c.C(m0.class);

    public static final Constructor a(Class cls, List list) {
        kotlin.jvm.internal.l.f("signature", list);
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.l.e("modelClass.constructors", constructors);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.l.e("constructor.parameterTypes", parameterTypes);
            List listL0 = rg.k.L0(parameterTypes);
            if (list.equals(listL0)) {
                return constructor;
            }
            if (list.size() == listL0.size() && listL0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final v0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (v0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + cls, e8);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
