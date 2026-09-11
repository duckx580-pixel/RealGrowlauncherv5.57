package com.usercentrics.sdk.errors;

import kotlin.jvm.internal.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class NotInitializedException extends UsercentricsException {
    /* JADX WARN: Multi-variable type inference failed */
    public NotInitializedException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NotInitializedException(String str, Throwable th2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
    }

    public NotInitializedException(String str, Throwable th2) {
        super(String.valueOf(str), th2);
    }
}
