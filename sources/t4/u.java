package t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f16637i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f16638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f16639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ u[] f16640t;

    static {
        u uVar = new u("REFRESH", 0);
        f16637i = uVar;
        u uVar2 = new u("PREPEND", 1);
        f16638r = uVar2;
        u uVar3 = new u("APPEND", 2);
        f16639s = uVar3;
        f16640t = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f16640t.clone();
    }
}
