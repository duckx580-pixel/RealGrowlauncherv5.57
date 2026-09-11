package qj;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l5.o;
import u5.s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14000b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f13999a = i10;
        this.f14000b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        switch (this.f13999a) {
            case 0:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, o.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke((o) this.f14000b, objArr);
                } catch (InvocationTargetException e8) {
                    throw e8.getTargetException();
                } catch (ReflectiveOperationException e10) {
                    throw new RuntimeException("Reflection failed for method " + method, e10);
                }
            default:
                if ("toString".equals(method.getName())) {
                    return null;
                }
                ((s) this.f14000b).f17713r = method;
                return null;
        }
    }
}
