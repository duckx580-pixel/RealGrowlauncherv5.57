package vh;

import java.util.concurrent.TimeUnit;
import th.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f18702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f18703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k8.j f18704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k8.j f18705h;

    static {
        String property;
        int i10 = t.f17230a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f18698a = property;
        f18699b = th.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = t.f17230a;
        if (i11 < 2) {
            i11 = 2;
        }
        f18700c = th.a.k(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f18701d = th.a.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f18702e = TimeUnit.SECONDS.toNanos(th.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f18703f = f.f18693a;
        f18704g = new k8.j(0);
        f18705h = new k8.j(1);
    }
}
