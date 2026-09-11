package com.usercentrics.sdk.core.hash;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.l;
import nh.a;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SHA256 {
    public static final SHA256 INSTANCE = new SHA256();

    private SHA256() {
    }

    public final String digest(String str) throws NoSuchAlgorithmException {
        l.f("input", str);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(a.f12288a);
        l.e("getBytes(...)", bytes);
        byte[] bArrDigest = messageDigest.digest(bytes);
        l.c(bArrDigest);
        String strE = PredefinedUICustomizationFont.defaultFamily;
        for (byte b4 : bArrDigest) {
            strE = h0.e(strE, String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b4)}, 1)));
        }
        return strE;
    }
}
