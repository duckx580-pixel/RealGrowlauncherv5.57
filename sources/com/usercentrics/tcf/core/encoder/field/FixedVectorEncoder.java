package com.usercentrics.tcf.core.encoder.field;

import com.usercentrics.tcf.core.errors.DecodingError;
import com.usercentrics.tcf.core.model.Vector;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class FixedVectorEncoder {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Companion {
        private Companion() {
        }

        public final Vector decode(String str, Integer num) throws DecodingError {
            l.f("value", str);
            if (num != null && str.length() != num.intValue()) {
                throw new DecodingError("bitfield encoding length mismatch");
            }
            Vector vector = new Vector();
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                i10++;
                if (BooleanEncoder.Companion.decode(str.charAt(i11))) {
                    vector.set(i10);
                }
            }
            vector.setBitLength(str.length());
            return vector;
        }

        public final String encode(Vector vector, Integer num) {
            l.f("value", vector);
            int iIntValue = num != null ? num.intValue() : vector.getMaxId();
            StringBuilder sb2 = new StringBuilder();
            int i10 = 1;
            if (1 <= iIntValue) {
                while (true) {
                    sb2.append(BooleanEncoder.Companion.encode(vector.has(i10)));
                    if (i10 == iIntValue) {
                        break;
                    }
                    i10++;
                }
            }
            String string = sb2.toString();
            l.e("toString(...)", string);
            return string;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }
}
