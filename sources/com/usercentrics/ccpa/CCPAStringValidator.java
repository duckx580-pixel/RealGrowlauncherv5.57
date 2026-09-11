package com.usercentrics.ccpa;

import kotlin.jvm.internal.l;
import nh.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CCPAStringValidator {
    public static final String initialValue = "1---";
    private static final int version = 1;
    public static final CCPAStringValidator INSTANCE = new CCPAStringValidator();
    private static final g validStringRegExp = new g("^[1][nNyY-][nNyY-][nNyY-]$");

    private CCPAStringValidator() {
    }

    public final boolean isValidString(String str) {
        l.f("ccpaString", str);
        g gVar = validStringRegExp;
        gVar.getClass();
        return gVar.f12308i.matcher(str).matches();
    }
}
