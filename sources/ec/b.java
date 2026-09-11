package ec;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "POST";
        }
        if (i10 == 2) {
            return "GET";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "GET" : "POST";
    }
}
