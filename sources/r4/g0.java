package r4;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f14503a = new f0(false, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f14504b = new f0(false, 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f14505c = new f0(false, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f14506d = new f0(true, 3);

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
