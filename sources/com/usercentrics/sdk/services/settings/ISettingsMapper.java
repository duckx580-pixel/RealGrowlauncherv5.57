package com.usercentrics.sdk.services.settings;

import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import com.usercentrics.sdk.v2.settings.data.UsercentricsService;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ISettingsMapper {

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class DefaultImpls {
        public static /* synthetic */ LegacyExtendedSettings map$default(ISettingsMapper iSettingsMapper, UsercentricsSettings usercentricsSettings, List list, LegalBasisLocalization legalBasisLocalization, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: map");
            }
            if ((i10 & 8) != 0) {
                str = null;
            }
            return iSettingsMapper.map(usercentricsSettings, list, legalBasisLocalization, str);
        }
    }

    LegacyExtendedSettings map(UsercentricsSettings usercentricsSettings, List<UsercentricsService> list, LegalBasisLocalization legalBasisLocalization, String str);
}
