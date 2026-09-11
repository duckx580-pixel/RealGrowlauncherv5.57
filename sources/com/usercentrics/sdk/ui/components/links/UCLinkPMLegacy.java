package com.usercentrics.sdk.ui.components.links;

import eh.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCLinkPMLegacy {
    private final a callback;
    private final String label;

    public UCLinkPMLegacy(String str, a aVar) {
        l.f("label", str);
        l.f("callback", aVar);
        this.label = str;
        this.callback = aVar;
    }

    public final a getCallback() {
        return this.callback;
    }

    public final String getLabel() {
        return this.label;
    }
}
