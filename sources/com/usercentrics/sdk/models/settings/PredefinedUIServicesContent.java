package com.usercentrics.sdk.models.settings;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIServicesContent implements PredefinedUITabContent {
    private final List<PredefinedUICardUISection> cardUISections;

    public PredefinedUIServicesContent(List<PredefinedUICardUISection> list) {
        l.f("cardUISections", list);
        this.cardUISections = list;
    }

    @Override // com.usercentrics.sdk.models.settings.PredefinedUITabContent
    public List<PredefinedUICardUISection> getCardUISections() {
        return this.cardUISections;
    }
}
