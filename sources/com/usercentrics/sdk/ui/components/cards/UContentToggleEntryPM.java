package com.usercentrics.sdk.ui.components.cards;

import com.usercentrics.sdk.ui.components.UCTogglePM;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UContentToggleEntryPM extends UCContentSectionPM {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f4765id;
    private final String name;
    private final UCTogglePM toggle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UContentToggleEntryPM(String str, String str2, UCTogglePM uCTogglePM) {
        super(null);
        l.f("id", str);
        l.f("name", str2);
        this.f4765id = str;
        this.name = str2;
        this.toggle = uCTogglePM;
    }

    public final String getId() {
        return this.f4765id;
    }

    public final String getName() {
        return this.name;
    }

    public final UCTogglePM getToggle() {
        return this.toggle;
    }
}
