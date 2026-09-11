package com.usercentrics.gpp.core.encoder;

import android.support.v4.media.session.a;
import com.usercentrics.gpp.core.errors.GppDecodingError;
import com.usercentrics.gpp.core.errors.GppEncodingError;
import com.usercentrics.tcf.core.StringOrNumber;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class IntEncoder {
    public static final IntEncoder INSTANCE = new IntEncoder();

    private IntEncoder() {
    }

    public final int decode(String str, int i10) {
        l.f("bitString", str);
        try {
            return (int) com.usercentrics.tcf.core.encoder.field.IntEncoder.Companion.decode(str, i10);
        } catch (Exception e8) {
            throw new GppDecodingError("Failed to decode bit string to integer: " + e8.getMessage(), e8);
        }
    }

    public final long decodeLong(String str, int i10) throws GppDecodingError {
        l.f("bitString", str);
        try {
            return com.usercentrics.tcf.core.encoder.field.IntEncoder.Companion.decode(str, i10);
        } catch (Exception e8) {
            throw new GppDecodingError("Failed to decode bit string to long: " + e8.getMessage(), e8);
        }
    }

    public final String encode(int i10, int i11) throws GppEncodingError {
        try {
            return com.usercentrics.tcf.core.encoder.field.IntEncoder.Companion.encode(new StringOrNumber.Int(i10), i11);
        } catch (Exception e8) {
            String message = e8.getMessage();
            StringBuilder sbO = a.o("Failed to encode integer ", i10, " into ", i11, " bits: ");
            sbO.append(message);
            throw new GppEncodingError(sbO.toString(), e8);
        }
    }

    public final String encodeLong(long j, int i10) throws GppEncodingError {
        try {
            return com.usercentrics.tcf.core.encoder.field.IntEncoder.Companion.encodeLong(j, i10);
        } catch (Exception e8) {
            throw new GppEncodingError("Failed to encode long " + j + " into " + i10 + " bits: " + e8.getMessage(), e8);
        }
    }
}
