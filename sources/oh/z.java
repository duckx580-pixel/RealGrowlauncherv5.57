package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f12942a;

    static {
        String property;
        c0 c0Var;
        int i10 = th.t.f17230a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            vh.d dVar = f0.f12869a;
            ph.d dVar2 = th.m.f17224a;
            ph.d dVar3 = dVar2.f13460v;
            c0Var = dVar2;
            if (dVar2 == null) {
                c0Var = y.f12940z;
            }
        } else {
            c0Var = y.f12940z;
        }
        f12942a = c0Var;
    }
}
