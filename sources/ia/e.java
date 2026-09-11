package ia;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f8177i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final HashMap f8178r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e[] f8179s;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("X86_32", 0);
        e eVar2 = new e("X86_64", 1);
        e eVar3 = new e("ARM_UNKNOWN", 2);
        e eVar4 = new e("PPC", 3);
        e eVar5 = new e("PPC64", 4);
        e eVar6 = new e("ARMV6", 5);
        e eVar7 = new e("ARMV7", 6);
        e eVar8 = new e("UNKNOWN", 7);
        f8177i = eVar8;
        e eVar9 = new e("ARMV7S", 8);
        e eVar10 = new e("ARM64", 9);
        f8179s = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10};
        HashMap map = new HashMap(4);
        f8178r = map;
        map.put("armeabi-v7a", eVar7);
        map.put("armeabi", eVar6);
        map.put("arm64-v8a", eVar10);
        map.put("x86", eVar);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f8179s.clone();
    }
}
