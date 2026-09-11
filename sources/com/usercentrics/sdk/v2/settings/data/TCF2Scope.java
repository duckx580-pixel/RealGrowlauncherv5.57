package com.usercentrics.sdk.v2.settings.data;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCF2Scope {
    private static final a $ENTRIES;
    private static final TCF2Scope[] $VALUES;
    public static final TCF2Scope GLOBAL = new TCF2Scope("GLOBAL", 0);
    public static final TCF2Scope SERVICE = new TCF2Scope("SERVICE", 1);

    private static final /* synthetic */ TCF2Scope[] $values() {
        return new TCF2Scope[]{GLOBAL, SERVICE};
    }

    static {
        TCF2Scope[] tCF2ScopeArr$values = $values();
        $VALUES = tCF2ScopeArr$values;
        $ENTRIES = c.p(tCF2ScopeArr$values);
    }

    private TCF2Scope(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TCF2Scope valueOf(String str) {
        return (TCF2Scope) Enum.valueOf(TCF2Scope.class, str);
    }

    public static TCF2Scope[] values() {
        return (TCF2Scope[]) $VALUES.clone();
    }
}
