package com.usercentrics.ccpa;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CCPADataKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final char toYesOrNo(boolean z3) {
        return z3 ? 'Y' : 'N';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean yesOrNoToBoolean(char c10) {
        Boolean bool = Boolean.FALSE;
        if (c10 == 'N' || c10 == 'n') {
            return bool;
        }
        if (c10 == 'Y') {
            return Boolean.TRUE;
        }
        if (c10 == 'y') {
            return Boolean.TRUE;
        }
        return null;
    }
}
