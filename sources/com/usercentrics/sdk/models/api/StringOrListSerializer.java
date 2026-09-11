package com.usercentrics.sdk.models.api;

import bi.c;
import bi.c1;
import ci.d;
import ci.d0;
import ci.k;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class StringOrListSerializer extends d0 {
    public static final StringOrListSerializer INSTANCE = new StringOrListSerializer();

    private StringOrListSerializer() {
        super(new c(c1.f2946a, 0));
    }

    @Override // ci.d0
    public k transformDeserialize(k kVar) {
        l.f("element", kVar);
        return !(kVar instanceof d) ? new d(sb.c.C(kVar)) : kVar;
    }
}
