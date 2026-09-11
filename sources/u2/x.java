package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f17614i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x[] f17615r;

    static {
        x xVar = new x("Inherit", 0);
        f17614i = xVar;
        f17615r = new x[]{xVar, new x("SecureOn", 1), new x("SecureOff", 2)};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f17615r.clone();
    }
}
