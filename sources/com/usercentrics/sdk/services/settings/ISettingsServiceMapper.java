package com.usercentrics.sdk.services.settings;

import com.usercentrics.sdk.models.settings.LegacyService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ISettingsServiceMapper {
    List<LegacyService> map(UsercentricsSettings usercentricsSettings, List<UsercentricsService> list, LegalBasisLocalization legalBasisLocalization);
}
