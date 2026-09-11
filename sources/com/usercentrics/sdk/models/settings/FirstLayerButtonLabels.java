package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class FirstLayerButtonLabels {
    private final String acceptAll;
    private final String denyAll;
    private final String more;
    private final String save;

    public FirstLayerButtonLabels(String str, String str2, String str3, String str4) {
        l.f("acceptAll", str);
        l.f("denyAll", str2);
        l.f("more", str3);
        l.f("save", str4);
        this.acceptAll = str;
        this.denyAll = str2;
        this.more = str3;
        this.save = str4;
    }

    public final String getAcceptAll() {
        return this.acceptAll;
    }

    public final String getDenyAll() {
        return this.denyAll;
    }

    public final String getMore() {
        return this.more;
    }

    public final String getSave() {
        return this.save;
    }
}
