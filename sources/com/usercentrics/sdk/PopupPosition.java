package com.usercentrics.sdk;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PopupPosition {
    private static final a $ENTRIES;
    private static final PopupPosition[] $VALUES;
    public static final PopupPosition BOTTOM = new PopupPosition("BOTTOM", 0);
    public static final PopupPosition CENTER = new PopupPosition("CENTER", 1);

    private static final /* synthetic */ PopupPosition[] $values() {
        return new PopupPosition[]{BOTTOM, CENTER};
    }

    static {
        PopupPosition[] popupPositionArr$values = $values();
        $VALUES = popupPositionArr$values;
        $ENTRIES = c.p(popupPositionArr$values);
    }

    private PopupPosition(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PopupPosition valueOf(String str) {
        return (PopupPosition) Enum.valueOf(PopupPosition.class, str);
    }

    public static PopupPosition[] values() {
        return (PopupPosition[]) $VALUES.clone();
    }
}
