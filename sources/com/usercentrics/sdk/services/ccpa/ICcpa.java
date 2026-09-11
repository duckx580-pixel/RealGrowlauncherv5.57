package com.usercentrics.sdk.services.ccpa;

import com.usercentrics.ccpa.CCPAData;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ICcpa {

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class DefaultImpls {
        public static /* synthetic */ void setCcpaStorage$default(ICcpa iCcpa, boolean z3, Boolean bool, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCcpaStorage");
            }
            if ((i10 & 2) != 0) {
                bool = Boolean.TRUE;
            }
            iCcpa.setCcpaStorage(z3, bool);
        }
    }

    CCPAData getCCPAData();

    String getCCPADataAsString();

    void initialize(Boolean bool);

    void setCcpaStorage(boolean z3, Boolean bool);

    void setNotApplicable();
}
