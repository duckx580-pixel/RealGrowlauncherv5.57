package com.usercentrics.sdk.v2.settings.data;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SecondLayerSide {
    private static final a $ENTRIES;
    private static final SecondLayerSide[] $VALUES;
    public static final SecondLayerSide LEFT = new SecondLayerSide("LEFT", 0);
    public static final SecondLayerSide RIGHT = new SecondLayerSide("RIGHT", 1);

    private static final /* synthetic */ SecondLayerSide[] $values() {
        return new SecondLayerSide[]{LEFT, RIGHT};
    }

    static {
        SecondLayerSide[] secondLayerSideArr$values = $values();
        $VALUES = secondLayerSideArr$values;
        $ENTRIES = c.p(secondLayerSideArr$values);
    }

    private SecondLayerSide(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SecondLayerSide valueOf(String str) {
        return (SecondLayerSide) Enum.valueOf(SecondLayerSide.class, str);
    }

    public static SecondLayerSide[] values() {
        return (SecondLayerSide[]) $VALUES.clone();
    }
}
