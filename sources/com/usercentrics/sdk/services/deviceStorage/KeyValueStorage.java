package com.usercentrics.sdk.services.deviceStorage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface KeyValueStorage {
    void deleteAll(List<String> list);

    void deleteKey(String str);

    void deleteKeysThatDoNotMatch(String str, Set<String> set);

    long getLong(String str, long j);

    int getNumber(String str, int i10);

    String getString(String str, String str2);

    Map<String, String> getStringWithKeyStartingWith(String str);

    boolean hasKey(String str);

    void purgeStorage();

    void put(String str, int i10);

    void put(String str, long j);

    void put(String str, String str2);

    void putIntegerMap(Map<String, Integer> map);

    void putStringMap(Map<String, String> map);

    void putValuesMap(Map<String, ? extends Object> map);
}
