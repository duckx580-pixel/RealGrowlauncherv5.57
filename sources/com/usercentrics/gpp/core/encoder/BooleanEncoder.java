package com.usercentrics.gpp.core.encoder;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class BooleanEncoder {
    public static final BooleanEncoder INSTANCE = new BooleanEncoder();

    private BooleanEncoder() {
    }

    public final boolean decode(String str) {
        l.f("bitString", str);
        return com.usercentrics.tcf.core.encoder.field.BooleanEncoder.Companion.decode(str);
    }

    public final String encode(boolean z3) {
        return com.usercentrics.tcf.core.encoder.field.BooleanEncoder.Companion.encode(z3);
    }

    public final boolean decode(char c10) {
        return com.usercentrics.tcf.core.encoder.field.BooleanEncoder.Companion.decode(c10);
    }
}
