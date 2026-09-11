package com.usercentrics.sdk.mediation.data;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCFConsentValue {
    private final Boolean consent;
    private final Boolean legitimateInterest;

    public TCFConsentValue(Boolean bool, Boolean bool2) {
        this.consent = bool;
        this.legitimateInterest = bool2;
    }

    public static /* synthetic */ TCFConsentValue copy$default(TCFConsentValue tCFConsentValue, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = tCFConsentValue.consent;
        }
        if ((i10 & 2) != 0) {
            bool2 = tCFConsentValue.legitimateInterest;
        }
        return tCFConsentValue.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.consent;
    }

    public final Boolean component2() {
        return this.legitimateInterest;
    }

    public final TCFConsentValue copy(Boolean bool, Boolean bool2) {
        return new TCFConsentValue(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TCFConsentValue)) {
            return false;
        }
        TCFConsentValue tCFConsentValue = (TCFConsentValue) obj;
        return l.a(this.consent, tCFConsentValue.consent) && l.a(this.legitimateInterest, tCFConsentValue.legitimateInterest);
    }

    public final Boolean getConsent() {
        return this.consent;
    }

    public final Boolean getLegitimateInterest() {
        return this.legitimateInterest;
    }

    public int hashCode() {
        Boolean bool = this.consent;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.legitimateInterest;
        return (iHashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "TCFConsentValue(consent=" + this.consent + ", legitimateInterest=" + this.legitimateInterest + ")";
    }
}
