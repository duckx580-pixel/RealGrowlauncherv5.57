package com.usercentrics.tcf.core.encoder.field;

import com.usercentrics.tcf.core.errors.DecodingError;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DateEncoder {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Companion {
        private Companion() {
        }

        public final long decode(String str, int i10) throws DecodingError {
            l.f("value", str);
            if (i10 == str.length()) {
                return IntEncoder.Companion.decode(str, i10) * ((long) 100);
            }
            throw new DecodingError("Invalid bit length");
        }

        public final String encode(long j, int i10) {
            return IntEncoder.Companion.encodeLong(j / ((long) 100), i10);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }
}
