package com.usercentrics.sdk.ui.secondLayer;

import com.usercentrics.sdk.ui.components.cards.UCCardPM;
import com.usercentrics.sdk.ui.components.cards.UCControllerIdPM;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCCardsContentPM extends UCLayerTabContentPM {
    private final List<UCCardPM> cards;
    private final UCControllerIdPM controllerId;
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCCardsContentPM(String str, List<UCCardPM> list, UCControllerIdPM uCControllerIdPM) {
        super(null);
        l.f("cards", list);
        this.title = str;
        this.cards = list;
        this.controllerId = uCControllerIdPM;
    }

    public final List<UCCardPM> getCards() {
        return this.cards;
    }

    public final UCControllerIdPM getControllerId() {
        return this.controllerId;
    }

    public final String getTitle() {
        return this.title;
    }
}
