package com.usercentrics.sdk.services.initialValues.variants;

import kotlin.jvm.internal.l;
import nh.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class StrategyReasonsKt {
    public static final String formatUSFrameworkMessage(String str, String str2) {
        l.f("message", str);
        if (str2 == null) {
            str2 = "CCPA";
        }
        return o.H(str, "##us_framework##", str2);
    }
}
