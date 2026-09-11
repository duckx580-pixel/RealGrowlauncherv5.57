package com.usercentrics.sdk.v2.consent.api;

import com.usercentrics.sdk.ui.userAgent.UsercentricsUserAgentInfo;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SaveConsentsApiImpl$userAgentInfo$2 extends m implements a {
    final SaveConsentsApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveConsentsApiImpl$userAgentInfo$2(SaveConsentsApiImpl saveConsentsApiImpl) {
        super(0);
        this.this$0 = saveConsentsApiImpl;
    }

    @Override // eh.a
    public final UsercentricsUserAgentInfo invoke() {
        return this.this$0.userAgentProvider.provide();
    }
}
