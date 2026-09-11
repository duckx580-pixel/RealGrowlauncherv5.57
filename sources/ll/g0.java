package ll;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import launcher.powerkuy.growlauncher.api.service.ApiService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f10115b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f10116a;

    static {
        f10115b = "Dalvik".equals(System.getProperty("java.vm.name")) ? new f0() : new g0();
    }

    public g0() {
        Constructor declaredConstructor = null;
        try {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.f10116a = declaredConstructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Object obj, Method method, Object... objArr) {
        Constructor constructor = this.f10116a;
        return (constructor != null ? (MethodHandles.Lookup) constructor.newInstance(ApiService.class, -1) : MethodHandles.lookup()).unreflectSpecial(method, ApiService.class).bindTo(obj).invokeWithArguments(objArr);
    }
}
