package com.usercentrics.sdk.services.settings;

import com.usercentrics.sdk.core.hash.SHA256;
import com.usercentrics.sdk.core.hash.UUID;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class GeneratorIds implements IGeneratorIds {
    private final String hashFunction(String str) {
        return SHA256.INSTANCE.digest(str);
    }

    private final String randomUuid() {
        return UUID.INSTANCE.random();
    }

    @Override // com.usercentrics.sdk.services.settings.IGeneratorIds
    public String generateControllerId() {
        return hashFunction(randomUuid());
    }

    @Override // com.usercentrics.sdk.services.settings.IGeneratorIds
    public String generateProcessorId() {
        return hashFunction(randomUuid());
    }
}
