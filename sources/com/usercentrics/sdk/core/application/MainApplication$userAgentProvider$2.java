package com.usercentrics.sdk.core.application;

import android.content.Context;
import com.usercentrics.sdk.BuildKonfig;
import com.usercentrics.sdk.core.ClassLocator;
import com.usercentrics.sdk.ui.userAgent.NativeUserAgentProvider;
import com.usercentrics.sdk.ui.userAgent.UserAgentSDKTypeEvaluatorImpl;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication$userAgentProvider$2 extends m implements a {
    final Context $appContext;
    final MainApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainApplication$userAgentProvider$2(MainApplication mainApplication, Context context) {
        super(0);
        this.this$0 = mainApplication;
        this.$appContext = context;
    }

    @Override // eh.a
    public final NativeUserAgentProvider invoke() {
        return new NativeUserAgentProvider(this.$appContext, new UserAgentSDKTypeEvaluatorImpl((ClassLocator) this.this$0.getClassLocator().getValue(), BuildKonfig.INSTANCE.getSdk_version()), this.this$0.getPredefinedUIMediator(), this.this$0.options);
    }
}
