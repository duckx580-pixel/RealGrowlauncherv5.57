package com.usercentrics.sdk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UsercentricsInternalHelper {
    public static final UsercentricsInternalHelper INSTANCE = new UsercentricsInternalHelper();

    private UsercentricsInternalHelper() {
    }

    public final void reset() {
        UsercentricsInternal.INSTANCE.reset();
    }
}
