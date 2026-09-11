package com.usercentrics.sdk.services.deviceStorage;

import com.usercentrics.ccpa.CCPAStorage;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class KeyValueStorageExtensionsKt {
    public static final CCPAStorage toCcpaStorage(KeyValueStorage keyValueStorage) {
        l.f("<this>", keyValueStorage);
        return new CCPAStorageProxy(keyValueStorage);
    }
}
