package com.usercentrics.sdk.core.application;

import com.usercentrics.sdk.v2.settings.service.CacheBypassResolver;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication$cacheBypassProvider$2 extends m implements a {
    public static final MainApplication$cacheBypassProvider$2 INSTANCE = new MainApplication$cacheBypassProvider$2();

    public MainApplication$cacheBypassProvider$2() {
        super(0);
    }

    @Override // eh.a
    public final CacheBypassResolver invoke() {
        return new CacheBypassResolver();
    }
}
