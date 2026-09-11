package com.usercentrics.sdk.errors;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class RestoreUserSessionDisabledException extends UsercentricsException {
    public RestoreUserSessionDisabledException() {
        super("The `Cross-Device Consent Sharing` feature is not enabled. Please contact the support team in order to enable this feature for your configuration.", null, 2, null);
    }
}
