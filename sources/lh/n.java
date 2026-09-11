package lh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f9942i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ n[] f9943r;

    static {
        n nVar = new n("INVARIANT", 0);
        f9942i = nVar;
        n[] nVarArr = {nVar, new n("IN", 1), new n("OUT", 2)};
        f9943r = nVarArr;
        o1.c.p(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f9943r.clone();
    }
}
