package com.usercentrics.sdk.ui.secondLayer;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCLayerContentPM {
    private final int initialTabIndex;
    private final List<UCLayerTabPM> tabs;

    public UCLayerContentPM(int i10, List<UCLayerTabPM> list) {
        l.f("tabs", list);
        this.initialTabIndex = i10;
        this.tabs = list;
    }

    public final int getInitialTabIndex() {
        return this.initialTabIndex;
    }

    public final List<UCLayerTabPM> getTabs() {
        return this.tabs;
    }
}
