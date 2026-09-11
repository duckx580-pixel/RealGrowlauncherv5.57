package com.usercentrics.sdk.core.application;

import android.content.Context;
import com.usercentrics.sdk.services.deviceStorage.KeyValueStorageProvider;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication$storageProvider$2 extends m implements a {
    final Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainApplication$storageProvider$2(Context context) {
        super(0);
        this.$appContext = context;
    }

    @Override // eh.a
    public final KeyValueStorageProvider invoke() {
        return new KeyValueStorageProvider(this.$appContext);
    }
}
