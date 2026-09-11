package com.usercentrics.sdk.ui;

import com.usercentrics.sdk.ActualKt;
import com.usercentrics.sdk.core.ClassLocator;
import com.usercentrics.sdk.extensions.ArrayExtensionsKt;
import com.usercentrics.sdk.models.settings.PredefinedUIVariant;
import com.usercentrics.sdk.services.deviceStorage.KeyValueStorage;
import com.usercentrics.sdk.services.deviceStorage.StorageKeys;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIMediatorImpl implements PredefinedUIMediator {
    private final ClassLocator classLocator;
    private final KeyValueStorage keyValueStorage;

    public PredefinedUIMediatorImpl(ClassLocator classLocator, KeyValueStorage keyValueStorage) {
        l.f("classLocator", classLocator);
        l.f("keyValueStorage", keyValueStorage);
        this.classLocator = classLocator;
        this.keyValueStorage = keyValueStorage;
    }

    @Override // com.usercentrics.sdk.ui.PredefinedUIMediator
    public boolean isModulePresent() {
        return this.classLocator.locate(ActualKt.getPredefinedUIFlagClassName()) || this.classLocator.locate(ActualKt.getPredefinedUITVFlagClassName());
    }

    @Override // com.usercentrics.sdk.ui.PredefinedUIMediator
    public PredefinedUIVariant popStoredVariant() {
        String strEmptyToNull;
        KeyValueStorage keyValueStorage = this.keyValueStorage;
        StorageKeys storageKeys = StorageKeys.UI_VARIANT;
        String string = keyValueStorage.getString(storageKeys.getText(), null);
        if (string == null || (strEmptyToNull = ArrayExtensionsKt.emptyToNull(string)) == null) {
            return null;
        }
        this.keyValueStorage.deleteKey(storageKeys.getText());
        return PredefinedUIVariant.valueOf(strEmptyToNull);
    }

    @Override // com.usercentrics.sdk.ui.PredefinedUIMediator
    public void storeVariant(PredefinedUIVariant predefinedUIVariant) {
        l.f("variant", predefinedUIVariant);
        this.keyValueStorage.put(StorageKeys.UI_VARIANT.getText(), predefinedUIVariant.name());
    }
}
