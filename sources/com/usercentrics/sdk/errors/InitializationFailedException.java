package com.usercentrics.sdk.errors;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class InitializationFailedException extends UsercentricsException {
    /* JADX WARN: Illegal instructions before constructor call */
    public InitializationFailedException(UsercentricsException usercentricsException) {
        l.f("initializeOnlineError", usercentricsException);
        String message = usercentricsException.getMessage();
        super("Usercentrics initialization failed: ".concat(message == null ? "Unknown error" : message), usercentricsException);
    }
}
