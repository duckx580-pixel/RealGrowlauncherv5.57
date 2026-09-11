package com.usercentrics.sdk.v2.language.facade;

import qg.i;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ILanguageFacade {

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: resolveLanguage-yxL6bBk$default, reason: not valid java name */
        public static /* synthetic */ Object m105resolveLanguageyxL6bBk$default(ILanguageFacade iLanguageFacade, String str, String str2, String str3, boolean z3, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveLanguage-yxL6bBk");
            }
            if ((i10 & 8) != 0) {
                z3 = false;
            }
            return iLanguageFacade.mo104resolveLanguageyxL6bBk(str, str2, str3, z3, cVar);
        }
    }

    /* JADX INFO: renamed from: resolveLanguage-yxL6bBk, reason: not valid java name */
    Object mo104resolveLanguageyxL6bBk(String str, String str2, String str3, boolean z3, c<? super i> cVar);
}
