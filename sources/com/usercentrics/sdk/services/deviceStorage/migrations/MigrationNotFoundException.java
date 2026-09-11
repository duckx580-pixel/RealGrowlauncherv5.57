package com.usercentrics.sdk.services.deviceStorage.migrations;

import android.support.v4.media.session.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MigrationNotFoundException extends Exception {
    private final String message;

    public MigrationNotFoundException(int i10, int i11) {
        this.message = a.l("Failed to find a Migration routine from ", i10, i11, " to ");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
