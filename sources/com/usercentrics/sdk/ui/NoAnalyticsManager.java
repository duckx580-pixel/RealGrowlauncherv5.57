package com.usercentrics.sdk.ui;

import com.usercentrics.sdk.UsercentricsAnalyticsEventType;
import com.usercentrics.sdk.analytics.UsercentricsAnalyticsManager;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class NoAnalyticsManager implements UsercentricsAnalyticsManager {
    @Override // com.usercentrics.sdk.analytics.UsercentricsAnalyticsManager
    public void track(UsercentricsAnalyticsEventType usercentricsAnalyticsEventType) {
        l.f("event", usercentricsAnalyticsEventType);
    }
}
