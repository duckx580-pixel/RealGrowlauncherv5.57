package com.usercentrics.sdk.mediation.data;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AdjustMediationResult {
    private final boolean mediated;
    private final String name;

    public AdjustMediationResult(String str, boolean z3) {
        l.f("name", str);
        this.name = str;
        this.mediated = z3;
    }

    public static /* synthetic */ AdjustMediationResult copy$default(AdjustMediationResult adjustMediationResult, String str, boolean z3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adjustMediationResult.name;
        }
        if ((i10 & 2) != 0) {
            z3 = adjustMediationResult.mediated;
        }
        return adjustMediationResult.copy(str, z3);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.mediated;
    }

    public final AdjustMediationResult copy(String str, boolean z3) {
        l.f("name", str);
        return new AdjustMediationResult(str, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustMediationResult)) {
            return false;
        }
        AdjustMediationResult adjustMediationResult = (AdjustMediationResult) obj;
        return l.a(this.name, adjustMediationResult.name) && this.mediated == adjustMediationResult.mediated;
    }

    public final boolean getMediated() {
        return this.mediated;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.mediated) + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "AdjustMediationResult(name=" + this.name + ", mediated=" + this.mediated + ")";
    }
}
