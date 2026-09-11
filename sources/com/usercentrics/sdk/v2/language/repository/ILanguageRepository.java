package com.usercentrics.sdk.v2.language.repository;

import com.usercentrics.sdk.v2.location.data.LocationAwareResponse;
import java.util.List;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ILanguageRepository {

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchAvailableLanguages$default(ILanguageRepository iLanguageRepository, String str, String str2, boolean z3, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAvailableLanguages");
            }
            if ((i10 & 4) != 0) {
                z3 = false;
            }
            return iLanguageRepository.fetchAvailableLanguages(str, str2, z3, cVar);
        }
    }

    Object fetchAvailableLanguages(String str, String str2, boolean z3, c<? super LocationAwareResponse<List<String>>> cVar);
}
