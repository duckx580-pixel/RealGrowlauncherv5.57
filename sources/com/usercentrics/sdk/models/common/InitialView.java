package com.usercentrics.sdk.models.common;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class InitialView {
    private static final a $ENTRIES;
    private static final InitialView[] $VALUES;
    public static final InitialView FIRST_LAYER = new InitialView("FIRST_LAYER", 0);
    public static final InitialView NONE = new InitialView("NONE", 1);

    private static final /* synthetic */ InitialView[] $values() {
        return new InitialView[]{FIRST_LAYER, NONE};
    }

    static {
        InitialView[] initialViewArr$values = $values();
        $VALUES = initialViewArr$values;
        $ENTRIES = c.p(initialViewArr$values);
    }

    private InitialView(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static InitialView valueOf(String str) {
        return (InitialView) Enum.valueOf(InitialView.class, str);
    }

    public static InitialView[] values() {
        return (InitialView[]) $VALUES.clone();
    }
}
