package bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f2934i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ q[] f2935r;

    static {
        q qVar = new q("SKIP", 0);
        q qVar2 = new q("TERMINATE", 1);
        f2934i = qVar2;
        q[] qVarArr = {qVar, qVar2};
        f2935r = qVarArr;
        o1.c.p(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f2935r.clone();
    }
}
