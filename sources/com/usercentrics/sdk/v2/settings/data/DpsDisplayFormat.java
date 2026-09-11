package com.usercentrics.sdk.v2.settings.data;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DpsDisplayFormat {
    private static final a $ENTRIES;
    private static final DpsDisplayFormat[] $VALUES;
    public static final DpsDisplayFormat ALL = new DpsDisplayFormat("ALL", 0);
    public static final DpsDisplayFormat SHORT = new DpsDisplayFormat("SHORT", 1);

    private static final /* synthetic */ DpsDisplayFormat[] $values() {
        return new DpsDisplayFormat[]{ALL, SHORT};
    }

    static {
        DpsDisplayFormat[] dpsDisplayFormatArr$values = $values();
        $VALUES = dpsDisplayFormatArr$values;
        $ENTRIES = c.p(dpsDisplayFormatArr$values);
    }

    private DpsDisplayFormat(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DpsDisplayFormat valueOf(String str) {
        return (DpsDisplayFormat) Enum.valueOf(DpsDisplayFormat.class, str);
    }

    public static DpsDisplayFormat[] values() {
        return (DpsDisplayFormat[]) $VALUES.clone();
    }
}
