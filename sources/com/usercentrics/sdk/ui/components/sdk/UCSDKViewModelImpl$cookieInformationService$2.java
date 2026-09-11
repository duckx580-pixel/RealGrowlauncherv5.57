package com.usercentrics.sdk.ui.components.sdk;

import com.usercentrics.sdk.ui.PredefinedUIDependencyManager;
import com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSDKViewModelImpl$cookieInformationService$2 extends m implements a {
    public static final UCSDKViewModelImpl$cookieInformationService$2 INSTANCE = new UCSDKViewModelImpl$cookieInformationService$2();

    public UCSDKViewModelImpl$cookieInformationService$2() {
        super(0);
    }

    @Override // eh.a
    public final UsercentricsCookieInformationService invoke() {
        return PredefinedUIDependencyManager.INSTANCE.getCookieInformationService();
    }
}
