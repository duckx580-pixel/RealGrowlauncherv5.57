package com.usercentrics.sdk.services.tcf;

import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCF$setPurposes$6$1 extends m implements c {
    public static final TCF$setPurposes$6$1 INSTANCE = new TCF$setPurposes$6$1();

    public TCF$setPurposes$6$1() {
        super(1);
    }

    @Override // eh.c
    public final String invoke(TCFPurpose tCFPurpose) {
        l.f("it", tCFPurpose);
        return tCFPurpose.getName();
    }
}
