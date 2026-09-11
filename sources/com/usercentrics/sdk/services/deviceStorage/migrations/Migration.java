package com.usercentrics.sdk.services.deviceStorage.migrations;

import com.usercentrics.sdk.services.deviceStorage.StorageHolder;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Migration {
    private final StorageHolder storageHolder;
    private final int toVersion;

    public Migration(StorageHolder storageHolder, int i10) {
        l.f("storageHolder", storageHolder);
        this.storageHolder = storageHolder;
        this.toVersion = i10;
    }

    public final int getFromVersion() {
        return this.toVersion - 1;
    }

    public final StorageHolder getStorageHolder() {
        return this.storageHolder;
    }

    public final int getToVersion() {
        return this.toVersion;
    }

    public abstract void migrate();
}
