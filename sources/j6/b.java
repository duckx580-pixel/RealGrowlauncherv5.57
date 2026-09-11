package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f8780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f8781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b[] f8782u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8783i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8784r;

    static {
        b bVar = new b("ENABLED", 0, true, true);
        f8780s = bVar;
        b bVar2 = new b("READ_ONLY", 1, true, false);
        b bVar3 = new b("WRITE_ONLY", 2, false, true);
        b bVar4 = new b("DISABLED", 3, false, false);
        f8781t = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f8782u = bVarArr;
        o1.c.p(bVarArr);
    }

    public b(String str, int i10, boolean z3, boolean z10) {
        this.f8783i = z3;
        this.f8784r = z10;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8782u.clone();
    }
}
