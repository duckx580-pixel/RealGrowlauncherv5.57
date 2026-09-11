package com.usercentrics.ccpa;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface CCPAStorage {
    void deleteKey(String str);

    String getValue(String str, String str2);

    void putValue(String str, String str2);
}
