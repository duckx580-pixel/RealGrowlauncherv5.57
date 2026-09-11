package com.usercentrics.sdk.services.deviceStorage;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class StorageHolder {
    private final KeyValueStorage defaultKeyValueStorage;
    private final KeyValueStorage usercentricsKeyValueStorage;

    public StorageHolder(KeyValueStorage keyValueStorage, KeyValueStorage keyValueStorage2) {
        l.f("defaultKeyValueStorage", keyValueStorage);
        l.f("usercentricsKeyValueStorage", keyValueStorage2);
        this.defaultKeyValueStorage = keyValueStorage;
        this.usercentricsKeyValueStorage = keyValueStorage2;
    }

    public final KeyValueStorage getDefaultKeyValueStorage() {
        return this.defaultKeyValueStorage;
    }

    public final KeyValueStorage getUsercentricsKeyValueStorage() {
        return this.usercentricsKeyValueStorage;
    }
}
