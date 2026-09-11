package com.usercentrics.sdk.v2.settings.data;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class FirstLayerCloseOption {
    private static final a $ENTRIES;
    private static final FirstLayerCloseOption[] $VALUES;
    public static final FirstLayerCloseOption LINK = new FirstLayerCloseOption("LINK", 0);
    public static final FirstLayerCloseOption ICON = new FirstLayerCloseOption("ICON", 1);

    private static final /* synthetic */ FirstLayerCloseOption[] $values() {
        return new FirstLayerCloseOption[]{LINK, ICON};
    }

    static {
        FirstLayerCloseOption[] firstLayerCloseOptionArr$values = $values();
        $VALUES = firstLayerCloseOptionArr$values;
        $ENTRIES = c.p(firstLayerCloseOptionArr$values);
    }

    private FirstLayerCloseOption(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static FirstLayerCloseOption valueOf(String str) {
        return (FirstLayerCloseOption) Enum.valueOf(FirstLayerCloseOption.class, str);
    }

    public static FirstLayerCloseOption[] values() {
        return (FirstLayerCloseOption[]) $VALUES.clone();
    }
}
