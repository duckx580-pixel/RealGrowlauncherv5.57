package com.usercentrics.sdk;

import kotlin.jvm.internal.l;
import nh.h;
import nh.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CommonKt {
    public static final String forceHttps(String str) {
        l.f("<this>", str);
        String string = h.r0(str).toString();
        return h.W(string) ? string : h.M(string, "://", false) ? o.H(string, "http://", "https://") : "https://".concat(string);
    }
}
