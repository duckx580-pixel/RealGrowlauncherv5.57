package com.usercentrics.sdk.v2.translation.service;

import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;
import qg.o;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ITranslationService {
    LegalBasisLocalization getTranslations();

    Object loadTranslations(String str, boolean z3, c<? super o> cVar);
}
