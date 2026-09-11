package com.usercentrics.sdk.core.time;

import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DateTime$seconds$2 extends m implements a {
    final DateTime this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTime$seconds$2(DateTime dateTime) {
        super(0);
        this.this$0 = dateTime;
    }

    @Override // eh.a
    public final Integer invoke() {
        return Integer.valueOf(this.this$0.calendar.get(13));
    }
}
