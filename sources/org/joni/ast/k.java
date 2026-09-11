package org.joni.ast;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f13169i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f13170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f13171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f13172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f13173u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f13174v;
    public static final /* synthetic */ k[] w;

    static {
        k kVar = new k("ASIS", 0);
        f13169i = kVar;
        k kVar2 = new k("DEL", 1);
        f13170r = kVar2;
        k kVar3 = new k("A", 2);
        f13171s = kVar3;
        k kVar4 = new k("AQ", 3);
        f13172t = kVar4;
        k kVar5 = new k("QQ", 4);
        f13173u = kVar5;
        k kVar6 = new k("P_QQ", 5);
        f13174v = kVar6;
        w = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) w.clone();
    }
}
