package com.usercentrics.sdk.services.deviceStorage.migrations;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MigrationException extends Exception {
    private final Throwable cause;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationException(String str, Throwable th2) {
        super(str, th2);
        l.f("message", str);
        l.f("cause", th2);
        this.message = str;
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
