package com.usercentrics.sdk.v2.analytics.data;

import com.usercentrics.sdk.core.time.DateTime;
import ih.d;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBuster {
    public static final CacheBuster INSTANCE = new CacheBuster();

    private CacheBuster() {
    }

    public final String generate() {
        long jTimestamp = new DateTime().timestamp();
        int iC = d.f8292i.c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jTimestamp);
        sb2.append(iC);
        return sb2.toString();
    }
}
