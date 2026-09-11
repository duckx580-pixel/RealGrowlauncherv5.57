package uf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f17966i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f17967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f17968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ u[] f17969t;

    static {
        u uVar = new u("LEFT_SELECTION", 0);
        f17966i = uVar;
        u uVar2 = new u("RIGHT_SELECTION", 1);
        f17967r = uVar2;
        u uVar3 = new u("SELECTION_ANCHOR", 2);
        f17968s = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        f17969t = uVarArr;
        o1.c.p(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f17969t.clone();
    }
}
