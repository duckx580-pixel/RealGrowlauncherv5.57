package n6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6.c f12133a = new j6.c();

    public static final boolean a(j6.i iVar) {
        int iOrdinal = iVar.f8822e.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return iVar.f8840y.f8795a == null && (iVar.f8838v instanceof k6.c);
        }
        throw new a2.d();
    }
}
