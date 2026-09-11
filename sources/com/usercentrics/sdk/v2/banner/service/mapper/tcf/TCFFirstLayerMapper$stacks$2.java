package com.usercentrics.sdk.v2.banner.service.mapper.tcf;

import com.usercentrics.sdk.StackProps;
import com.usercentrics.sdk.UsercentricsMaps;
import eh.a;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCFFirstLayerMapper$stacks$2 extends m implements a {
    final TCFFirstLayerMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCFFirstLayerMapper$stacks$2(TCFFirstLayerMapper tCFFirstLayerMapper) {
        super(0);
        this.this$0 = tCFFirstLayerMapper;
    }

    @Override // eh.a
    public final List<StackProps> invoke() {
        return UsercentricsMaps.Companion.mapStacks(this.this$0.tcfData);
    }
}
