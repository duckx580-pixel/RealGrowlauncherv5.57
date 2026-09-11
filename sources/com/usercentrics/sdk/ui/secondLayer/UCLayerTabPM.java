package com.usercentrics.sdk.ui.secondLayer;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCLayerTabPM {
    private final List<UCCardsContentPM> content;
    private final String title;

    public UCLayerTabPM(String str, List<UCCardsContentPM> list) {
        l.f("title", str);
        l.f("content", list);
        this.title = str;
        this.content = list;
    }

    public final List<UCCardsContentPM> getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }
}
