package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gh.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11833f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f11834g = Executors.newFixedThreadPool(4, new eb.b(2));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Handler f11835h;

    public static Handler H(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ki.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
