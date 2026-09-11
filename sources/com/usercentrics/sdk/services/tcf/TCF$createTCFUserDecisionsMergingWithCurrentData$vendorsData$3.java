package com.usercentrics.sdk.services.tcf;

import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$3 extends m implements c {
    public static final TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$3 INSTANCE = new TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$3();

    public TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$3() {
        super(1);
    }

    @Override // eh.c
    public final Boolean invoke(TCFVendor tCFVendor) {
        l.f("it", tCFVendor);
        return Boolean.valueOf(tCFVendor.getShowLegitimateInterestToggle());
    }
}
