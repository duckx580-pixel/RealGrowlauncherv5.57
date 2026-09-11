package com.usercentrics.sdk.services.settings;

import com.usercentrics.sdk.models.settings.LegacyService;
import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SettingsServicesMapper$map$apiSettingsMapped$2 extends m implements c {
    public static final SettingsServicesMapper$map$apiSettingsMapped$2 INSTANCE = new SettingsServicesMapper$map$apiSettingsMapped$2();

    public SettingsServicesMapper$map$apiSettingsMapped$2() {
        super(1);
    }

    @Override // eh.c
    public final String invoke(LegacyService legacyService) {
        l.f("it", legacyService);
        return legacyService.getName();
    }
}
