package com.usercentrics.sdk.ui.components.cards;

import com.usercentrics.sdk.ui.secondLayer.UCCardsContentPM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import nh.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UCCardComponent {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Companion {
        private Companion() {
        }

        public final List<UCCardComponent> from(List<UCCardsContentPM> list) {
            l.f("content", list);
            ArrayList arrayList = new ArrayList();
            for (UCCardsContentPM uCCardsContentPM : list) {
                String title = uCCardsContentPM.getTitle();
                if (title != null && !h.W(title)) {
                    arrayList.add(new UCSectionTitlePM(title));
                }
                arrayList.addAll(uCCardsContentPM.getCards());
                UCControllerIdPM controllerId = uCCardsContentPM.getControllerId();
                if (controllerId != null) {
                    arrayList.add(controllerId);
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private UCCardComponent() {
    }

    public /* synthetic */ UCCardComponent(g gVar) {
        this();
    }
}
