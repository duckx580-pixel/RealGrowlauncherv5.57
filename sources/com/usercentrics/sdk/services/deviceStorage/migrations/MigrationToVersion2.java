package com.usercentrics.sdk.services.deviceStorage.migrations;

import com.usercentrics.sdk.services.deviceStorage.StorageHolder;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MigrationToVersion2 extends Migration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationToVersion2(StorageHolder storageHolder) {
        super(storageHolder, 2);
        l.f("storageHolder", storageHolder);
    }

    @Override // com.usercentrics.sdk.services.deviceStorage.migrations.Migration
    public void migrate() {
    }
}
