package m5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f11605b;

    static {
        String strF = androidx.work.p.f("WrkDbPathHelper");
        kotlin.jvm.internal.l.e("tagWithPrefix(\"WrkDbPathHelper\")", strF);
        f11604a = strF;
        f11605b = new String[]{"-journal", "-shm", "-wal"};
    }
}
