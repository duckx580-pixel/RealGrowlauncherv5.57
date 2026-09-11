package com.usercentrics.sdk.core.application;

import com.usercentrics.sdk.v2.location.service.LocationService;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication$locationService$1 extends m implements a {
    final MainApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainApplication$locationService$1(MainApplication mainApplication) {
        super(0);
        this.this$0 = mainApplication;
    }

    @Override // eh.a
    public final LocationService invoke() {
        return new LocationService(this.this$0.getLocationRepository());
    }
}
