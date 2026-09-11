package com.usercentrics.tcf.core.encoder.field;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class BooleanEncoder {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Companion {
        private Companion() {
        }

        public final boolean decode(char c10) {
            return c10 == '1';
        }

        public final String encode(boolean z3) {
            return z3 ? "1" : "0";
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final boolean decode(String str) {
            l.f("value", str);
            return str.equals("1");
        }
    }
}
