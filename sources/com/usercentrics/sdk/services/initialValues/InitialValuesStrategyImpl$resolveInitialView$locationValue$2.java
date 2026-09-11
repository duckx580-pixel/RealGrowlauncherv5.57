package com.usercentrics.sdk.services.initialValues;

import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class InitialValuesStrategyImpl$resolveInitialView$locationValue$2 extends m implements a {
    final InitialValuesStrategyImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialValuesStrategyImpl$resolveInitialView$locationValue$2(InitialValuesStrategyImpl initialValuesStrategyImpl) {
        super(0);
        this.this$0 = initialValuesStrategyImpl;
    }

    @Override // eh.a
    public final UsercentricsLocation invoke() {
        return this.this$0.locationService.getLocation();
    }
}
