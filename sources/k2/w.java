package k2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f9201i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w f9202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final w f9203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w f9204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ w[] f9205u;

    static {
        w wVar = new w("StartInput", 0);
        f9201i = wVar;
        w wVar2 = new w("StopInput", 1);
        f9202r = wVar2;
        w wVar3 = new w("ShowKeyboard", 2);
        f9203s = wVar3;
        w wVar4 = new w("HideKeyboard", 3);
        f9204t = wVar4;
        f9205u = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f9205u.clone();
    }
}
