package com.usercentrics.sdk.v2.etag.cache;

import com.usercentrics.sdk.v2.etag.repository.EtagHolder;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface IEtagCacheStorage {
    void boot(String str);

    String getRawEtagFileName(String str);

    String getStoredFile(String str, String str2);

    void removeOfflineStaging();

    void restoreOfflineStaging();

    void saveOfflineStaging();

    void storeFileAndEtag(EtagHolder etagHolder);
}
