package com.usercentrics.sdk.services.tcf;

import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$6 extends m implements c {
    final TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCF$createTCFUserDecisionsMergingWithCurrentData$vendorsData$6(TCF tcf) {
        super(1);
        this.this$0 = tcf;
    }

    @Override // eh.c
    public final Boolean invoke(TCFVendor tCFVendor) {
        l.f("vendor", tCFVendor);
        return Boolean.valueOf(this.this$0.hasImplicitLegitimateInterest(tCFVendor.getPurposes(), tCFVendor.getLegitimateInterestPurposes(), tCFVendor.getSpecialPurposes()));
    }
}
