package ya;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f20225i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c[] f20226r;

    static {
        c cVar = new c("DEFAULT", 0);
        f20225i = cVar;
        f20226r = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f20226r.clone();
    }
}
