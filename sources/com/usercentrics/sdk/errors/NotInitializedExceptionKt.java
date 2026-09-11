package com.usercentrics.sdk.errors;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class NotInitializedExceptionKt {
    private static final String notInitializedMessage = "Usercentrics was not initialized, please ensure that you invoke 'Usercentrics.initialize()' before you start using 'Usercentrics.instance'";

    public static final String getNotInitializedMessage() {
        return notInitializedMessage;
    }
}
