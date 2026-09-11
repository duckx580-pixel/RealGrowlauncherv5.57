package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f19502i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f19503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a[] f19504s;

    static {
        a aVar = new a("GRANTED", 0);
        f19502i = aVar;
        a aVar2 = new a("DENIED", 1);
        f19503r = aVar2;
        f19504s = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19504s.clone();
    }
}
