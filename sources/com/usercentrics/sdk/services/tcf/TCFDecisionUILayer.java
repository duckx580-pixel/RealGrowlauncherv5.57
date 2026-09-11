package com.usercentrics.sdk.services.tcf;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCFDecisionUILayer {
    private static final a $ENTRIES;
    private static final TCFDecisionUILayer[] $VALUES;
    public static final TCFDecisionUILayer FIRST_LAYER = new TCFDecisionUILayer("FIRST_LAYER", 0, 1);
    public static final TCFDecisionUILayer SECOND_LAYER = new TCFDecisionUILayer("SECOND_LAYER", 1, 2);
    private final int value;

    private static final /* synthetic */ TCFDecisionUILayer[] $values() {
        return new TCFDecisionUILayer[]{FIRST_LAYER, SECOND_LAYER};
    }

    static {
        TCFDecisionUILayer[] tCFDecisionUILayerArr$values = $values();
        $VALUES = tCFDecisionUILayerArr$values;
        $ENTRIES = c.p(tCFDecisionUILayerArr$values);
    }

    private TCFDecisionUILayer(String str, int i10, int i11) {
        this.value = i11;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static TCFDecisionUILayer valueOf(String str) {
        return (TCFDecisionUILayer) Enum.valueOf(TCFDecisionUILayer.class, str);
    }

    public static TCFDecisionUILayer[] values() {
        return (TCFDecisionUILayer[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
