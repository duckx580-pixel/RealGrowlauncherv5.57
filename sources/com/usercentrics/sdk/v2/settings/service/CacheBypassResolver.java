package com.usercentrics.sdk.v2.settings.service;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBypassResolver implements ICacheBypassResolver {
    private boolean bypassCache;

    @Override // com.usercentrics.sdk.v2.settings.service.ICacheBypassResolver
    public boolean shouldBypassCache() {
        return this.bypassCache;
    }

    @Override // com.usercentrics.sdk.v2.settings.service.ICacheBypassResolver
    public void update(boolean z3, boolean z10) {
        boolean z11 = true;
        if (!z3 && !z10) {
            z11 = false;
        }
        this.bypassCache = z11;
    }
}
