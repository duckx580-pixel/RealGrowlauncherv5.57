package com.usercentrics.sdk.ui;

import com.usercentrics.sdk.PredefinedUIViewHandlers;
import com.usercentrics.sdk.predefinedUI.PredefinedUIConsentManager;
import com.usercentrics.sdk.v2.banner.model.PredefinedUIViewData;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIHolder {
    private final PredefinedUIConsentManager consentManager;
    private final PredefinedUIViewData data;
    private final PredefinedUIViewHandlers viewHandlers;

    public PredefinedUIHolder(PredefinedUIViewData predefinedUIViewData, PredefinedUIConsentManager predefinedUIConsentManager, PredefinedUIViewHandlers predefinedUIViewHandlers) {
        l.f("data", predefinedUIViewData);
        l.f("consentManager", predefinedUIConsentManager);
        l.f("viewHandlers", predefinedUIViewHandlers);
        this.data = predefinedUIViewData;
        this.consentManager = predefinedUIConsentManager;
        this.viewHandlers = predefinedUIViewHandlers;
    }

    public static /* synthetic */ PredefinedUIHolder copy$default(PredefinedUIHolder predefinedUIHolder, PredefinedUIViewData predefinedUIViewData, PredefinedUIConsentManager predefinedUIConsentManager, PredefinedUIViewHandlers predefinedUIViewHandlers, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            predefinedUIViewData = predefinedUIHolder.data;
        }
        if ((i10 & 2) != 0) {
            predefinedUIConsentManager = predefinedUIHolder.consentManager;
        }
        if ((i10 & 4) != 0) {
            predefinedUIViewHandlers = predefinedUIHolder.viewHandlers;
        }
        return predefinedUIHolder.copy(predefinedUIViewData, predefinedUIConsentManager, predefinedUIViewHandlers);
    }

    public final PredefinedUIViewData component1() {
        return this.data;
    }

    public final PredefinedUIConsentManager component2() {
        return this.consentManager;
    }

    public final PredefinedUIViewHandlers component3() {
        return this.viewHandlers;
    }

    public final PredefinedUIHolder copy(PredefinedUIViewData predefinedUIViewData, PredefinedUIConsentManager predefinedUIConsentManager, PredefinedUIViewHandlers predefinedUIViewHandlers) {
        l.f("data", predefinedUIViewData);
        l.f("consentManager", predefinedUIConsentManager);
        l.f("viewHandlers", predefinedUIViewHandlers);
        return new PredefinedUIHolder(predefinedUIViewData, predefinedUIConsentManager, predefinedUIViewHandlers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredefinedUIHolder)) {
            return false;
        }
        PredefinedUIHolder predefinedUIHolder = (PredefinedUIHolder) obj;
        return l.a(this.data, predefinedUIHolder.data) && l.a(this.consentManager, predefinedUIHolder.consentManager) && l.a(this.viewHandlers, predefinedUIHolder.viewHandlers);
    }

    public final PredefinedUIConsentManager getConsentManager() {
        return this.consentManager;
    }

    public final PredefinedUIViewData getData() {
        return this.data;
    }

    public final PredefinedUIViewHandlers getViewHandlers() {
        return this.viewHandlers;
    }

    public int hashCode() {
        return this.viewHandlers.hashCode() + ((this.consentManager.hashCode() + (this.data.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "PredefinedUIHolder(data=" + this.data + ", consentManager=" + this.consentManager + ", viewHandlers=" + this.viewHandlers + ")";
    }
}
