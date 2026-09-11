package com.usercentrics.sdk;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ButtonType {
    private static final a $ENTRIES;
    private static final ButtonType[] $VALUES;
    public static final ButtonType ACCEPT_ALL = new ButtonType("ACCEPT_ALL", 0);
    public static final ButtonType DENY_ALL = new ButtonType("DENY_ALL", 1);
    public static final ButtonType MORE = new ButtonType("MORE", 2);
    public static final ButtonType SAVE = new ButtonType("SAVE", 3);

    private static final /* synthetic */ ButtonType[] $values() {
        return new ButtonType[]{ACCEPT_ALL, DENY_ALL, MORE, SAVE};
    }

    static {
        ButtonType[] buttonTypeArr$values = $values();
        $VALUES = buttonTypeArr$values;
        $ENTRIES = c.p(buttonTypeArr$values);
    }

    private ButtonType(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
