package com.usercentrics.gpp.core.errors;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class GppError extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GppError(String str, Throwable th2) {
        super(str, th2);
        l.f("message", str);
    }

    public /* synthetic */ GppError(String str, Throwable th2, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
