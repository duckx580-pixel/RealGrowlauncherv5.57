package com.usercentrics.sdk.core.hash;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UUID {
    public static final UUID INSTANCE = new UUID();

    private UUID() {
    }

    public final String random() {
        String string = java.util.UUID.randomUUID().toString();
        l.e("toString(...)", string);
        return string;
    }
}
