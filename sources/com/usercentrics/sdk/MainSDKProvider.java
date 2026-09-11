package com.usercentrics.sdk;

import android.content.Context;
import com.usercentrics.sdk.core.application.Application;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainSDKProvider implements SDKProvider {
    @Override // com.usercentrics.sdk.SDKProvider
    public UsercentricsSDK provide(Application application, UsercentricsOptions usercentricsOptions, Context context) {
        l.f("application", application);
        l.f("options", usercentricsOptions);
        return new UsercentricsSDKImpl(application, usercentricsOptions);
    }
}
