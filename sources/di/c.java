package di;

import androidx.work.v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5117a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rg.j f5118b = new rg.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f5119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5120d;

    static {
        Object objI;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.l.e("getProperty(\"kotlinx.serialization.json.pool.size\")", property);
            objI = nh.o.K(property);
        } catch (Throwable th2) {
            objI = v.i(th2);
        }
        if (objI instanceof qg.h) {
            objI = null;
        }
        Integer num = (Integer) objI;
        f5120d = num == null ? 1048576 : num.intValue();
    }
}
