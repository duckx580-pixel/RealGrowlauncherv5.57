package com.usercentrics.sdk.core.application;

import com.usercentrics.sdk.acm.api.AdditionalConsentModeApiImpl;
import com.usercentrics.sdk.acm.repository.AdditionalConsentModeRemoteRepositoryImpl;
import com.usercentrics.sdk.acm.service.AdditionalConsentModeServiceImpl;
import com.usercentrics.sdk.services.api.NetworkResolver;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.v2.etag.cache.IEtagCacheStorage;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication$additionalConsentModeService$1 extends m implements a {
    final MainApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainApplication$additionalConsentModeService$1(MainApplication mainApplication) {
        super(0);
        this.this$0 = mainApplication;
    }

    @Override // eh.a
    public final AdditionalConsentModeServiceImpl invoke() {
        return new AdditionalConsentModeServiceImpl(new AdditionalConsentModeRemoteRepositoryImpl(new AdditionalConsentModeApiImpl(this.this$0.getHttpInstance(), (NetworkResolver) this.this$0.getNetworkResolver().getValue()), this.this$0.getJsonParserInstance(), this.this$0.getLogger(), (IEtagCacheStorage) this.this$0.getEtagCacheStorage().getValue(), (INetworkStrategy) this.this$0.getNetworkStrategy().getValue()), (DeviceStorage) this.this$0.getStorageInstance().getValue(), this.this$0.getLogger());
    }
}
