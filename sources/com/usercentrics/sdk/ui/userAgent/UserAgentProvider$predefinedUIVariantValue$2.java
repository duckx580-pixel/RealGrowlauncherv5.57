package com.usercentrics.sdk.ui.userAgent;

import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UserAgentProvider$predefinedUIVariantValue$2 extends m implements a {
    final UserAgentProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentProvider$predefinedUIVariantValue$2(UserAgentProvider userAgentProvider) {
        super(0);
        this.this$0 = userAgentProvider;
    }

    @Override // eh.a
    public final String invoke() {
        return this.this$0.getPredefinedUIVariant();
    }
}
