package com.usercentrics.sdk.errors;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class NotReadyException extends UsercentricsException {
    public NotReadyException() {
        super("Usercentrics is not ready, please ensure to invoke the shared instance inside 'Usercentrics.isReady'", null, 2, null);
    }
}
