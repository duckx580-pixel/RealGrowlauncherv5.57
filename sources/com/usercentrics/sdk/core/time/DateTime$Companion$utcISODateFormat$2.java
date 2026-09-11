package com.usercentrics.sdk.core.time;

import eh.a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DateTime$Companion$utcISODateFormat$2 extends m implements a {
    public static final DateTime$Companion$utcISODateFormat$2 INSTANCE = new DateTime$Companion$utcISODateFormat$2();

    public DateTime$Companion$utcISODateFormat$2() {
        super(0);
    }

    @Override // eh.a
    public final SimpleDateFormat invoke() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DateTime.utcTimeZone);
        return simpleDateFormat;
    }
}
