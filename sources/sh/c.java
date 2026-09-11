package sh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ug.c[] f15798a = new ug.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lc.n f15799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lc.n f15800c;

    static {
        int i10 = 26;
        f15799b = new lc.n(i10, "NULL");
        f15800c = new lc.n(i10, "UNINITIALIZED");
    }

    public static final Object a(ug.h hVar, Object obj, Object obj2, eh.e eVar, ug.c cVar) {
        Object objM = th.a.m(hVar, obj2);
        try {
            z zVar = new z(cVar, hVar);
            kotlin.jvm.internal.a0.c(2, eVar);
            Object objInvoke = eVar.invoke(obj, zVar);
            th.a.g(hVar, objM);
            if (objInvoke == vg.a.f18663i) {
                kotlin.jvm.internal.l.f("frame", cVar);
            }
            return objInvoke;
        } catch (Throwable th2) {
            th.a.g(hVar, objM);
            throw th2;
        }
    }
}
