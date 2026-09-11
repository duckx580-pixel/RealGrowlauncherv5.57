package com.usercentrics.sdk.analytics;

import com.usercentrics.sdk.UsercentricsAnalyticsEventType;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class FakeUsercentricsAnalyticsManager implements UsercentricsAnalyticsManager {
    private UsercentricsAnalyticsEventType eventTracked;

    public final UsercentricsAnalyticsEventType getEventTracked() {
        return this.eventTracked;
    }

    public final void setEventTracked(UsercentricsAnalyticsEventType usercentricsAnalyticsEventType) {
        this.eventTracked = usercentricsAnalyticsEventType;
    }

    @Override // com.usercentrics.sdk.analytics.UsercentricsAnalyticsManager
    public void track(UsercentricsAnalyticsEventType usercentricsAnalyticsEventType) {
        l.f("event", usercentricsAnalyticsEventType);
        this.eventTracked = usercentricsAnalyticsEventType;
    }
}
