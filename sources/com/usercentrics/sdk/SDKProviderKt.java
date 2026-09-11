package com.usercentrics.sdk;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SDKProviderKt {
    private static SDKProvider usercentricsProvider = defaultSDKProvider();

    public static final MainSDKProvider defaultSDKProvider() {
        return new MainSDKProvider();
    }

    public static final SDKProvider getUsercentricsProvider() {
        return usercentricsProvider;
    }

    public static final void setUsercentricsProvider(SDKProvider sDKProvider) {
        l.f("<set-?>", sDKProvider);
        usercentricsProvider = sDKProvider;
    }
}
