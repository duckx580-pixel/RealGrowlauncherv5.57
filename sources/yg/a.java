package yg;

import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f20442a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        l.c(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (l.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                l.e("getParameterTypes(...)", parameterTypes);
                if (l.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f20442a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !l.a(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
