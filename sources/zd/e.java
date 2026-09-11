package zd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e[] f21324i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f21325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f21326s;

    static {
        e eVar = new e("PRIVATE", 0);
        f21325r = eVar;
        e eVar2 = new e("PUBLIC", 1);
        f21326s = eVar2;
        f21324i = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f21324i.clone();
    }
}
