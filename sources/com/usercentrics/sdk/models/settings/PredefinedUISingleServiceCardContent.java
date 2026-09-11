package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUISingleServiceCardContent extends PredefinedUICardContent {
    private final PredefinedUIServiceDetails service;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedUISingleServiceCardContent(PredefinedUIServiceDetails predefinedUIServiceDetails) {
        super(null);
        l.f("service", predefinedUIServiceDetails);
        this.service = predefinedUIServiceDetails;
    }

    public static /* synthetic */ PredefinedUISingleServiceCardContent copy$default(PredefinedUISingleServiceCardContent predefinedUISingleServiceCardContent, PredefinedUIServiceDetails predefinedUIServiceDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            predefinedUIServiceDetails = predefinedUISingleServiceCardContent.service;
        }
        return predefinedUISingleServiceCardContent.copy(predefinedUIServiceDetails);
    }

    public final PredefinedUIServiceDetails component1() {
        return this.service;
    }

    public final PredefinedUISingleServiceCardContent copy(PredefinedUIServiceDetails predefinedUIServiceDetails) {
        l.f("service", predefinedUIServiceDetails);
        return new PredefinedUISingleServiceCardContent(predefinedUIServiceDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PredefinedUISingleServiceCardContent) && l.a(this.service, ((PredefinedUISingleServiceCardContent) obj).service);
    }

    public final PredefinedUIServiceDetails getService() {
        return this.service;
    }

    public int hashCode() {
        return this.service.hashCode();
    }

    public String toString() {
        return "PredefinedUISingleServiceCardContent(service=" + this.service + ")";
    }
}
