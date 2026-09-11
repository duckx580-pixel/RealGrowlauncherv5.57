package com.usercentrics.sdk.models.settings;

import k0.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIPurposeVendorDetails {
    private final String title;
    private final String value;

    public PredefinedUIPurposeVendorDetails(String str, String str2) {
        l.f("title", str);
        l.f("value", str2);
        this.title = str;
        this.value = str2;
    }

    public static /* synthetic */ PredefinedUIPurposeVendorDetails copy$default(PredefinedUIPurposeVendorDetails predefinedUIPurposeVendorDetails, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = predefinedUIPurposeVendorDetails.title;
        }
        if ((i10 & 2) != 0) {
            str2 = predefinedUIPurposeVendorDetails.value;
        }
        return predefinedUIPurposeVendorDetails.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.value;
    }

    public final PredefinedUIPurposeVendorDetails copy(String str, String str2) {
        l.f("title", str);
        l.f("value", str2);
        return new PredefinedUIPurposeVendorDetails(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredefinedUIPurposeVendorDetails)) {
            return false;
        }
        PredefinedUIPurposeVendorDetails predefinedUIPurposeVendorDetails = (PredefinedUIPurposeVendorDetails) obj;
        return l.a(this.title, predefinedUIPurposeVendorDetails.title) && l.a(this.value, predefinedUIPurposeVendorDetails.value);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return g.g("PredefinedUIPurposeVendorDetails(title=", this.title, ", value=", this.value, ")");
    }

    public /* synthetic */ PredefinedUIPurposeVendorDetails(String str, String str2, int i10, kotlin.jvm.internal.g gVar) {
        this(str, (i10 & 2) != 0 ? PredefinedUICustomizationFont.defaultFamily : str2);
    }
}
