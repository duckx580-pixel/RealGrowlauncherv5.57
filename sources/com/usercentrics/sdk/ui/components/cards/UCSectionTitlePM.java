package com.usercentrics.sdk.ui.components.cards;

import kotlin.jvm.internal.l;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSectionTitlePM extends UCCardComponent {
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCSectionTitlePM(String str) {
        super(null);
        l.f("title", str);
        this.title = str;
    }

    public static /* synthetic */ UCSectionTitlePM copy$default(UCSectionTitlePM uCSectionTitlePM, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uCSectionTitlePM.title;
        }
        return uCSectionTitlePM.copy(str);
    }

    public final String component1() {
        return this.title;
    }

    public final UCSectionTitlePM copy(String str) {
        l.f("title", str);
        return new UCSectionTitlePM(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UCSectionTitlePM) && l.a(this.title, ((UCSectionTitlePM) obj).title);
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return h0.f("UCSectionTitlePM(title=", this.title, ")");
    }
}
