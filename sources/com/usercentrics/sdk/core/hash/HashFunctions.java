package com.usercentrics.sdk.core.hash;

import kotlin.jvm.internal.l;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class HashFunctions {
    public static final HashFunctions INSTANCE = new HashFunctions();
    private static final String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    private HashFunctions() {
    }

    private final String byteToHexString(byte b4) {
        int i10 = b4;
        if (b4 < 0) {
            i10 = b4 + 256;
        }
        String[] strArr = hexArray;
        return h0.e(strArr[i10 / 16], strArr[i10 % 16]);
    }

    public final String byteArrayToHexString(byte[] bArr) {
        l.f("bytes", bArr);
        StringBuilder sb2 = new StringBuilder();
        for (byte b4 : bArr) {
            sb2.append(byteToHexString(b4));
        }
        String string = sb2.toString();
        l.e("toString(...)", string);
        return string;
    }
}
