package s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v f14993i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f14994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f14995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ v[] f14996t;

    static {
        v vVar = new v("PreEnter", 0);
        f14993i = vVar;
        v vVar2 = new v("Visible", 1);
        f14994r = vVar2;
        v vVar3 = new v("PostExit", 2);
        f14995s = vVar3;
        f14996t = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f14996t.clone();
    }
}
