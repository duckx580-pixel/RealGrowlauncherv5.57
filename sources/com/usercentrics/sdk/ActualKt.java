package com.usercentrics.sdk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ActualKt {
    private static final boolean isTVOS = false;
    private static final String predefinedUIFlagClassName = "com.usercentrics.sdk.bridge.UCPredefinedUIFlag";
    private static final String predefinedUITVFlagClassName = "com.usercentrics.sdk.bridge.UCPredefinedUIFlag";

    public static final String getPredefinedUIFlagClassName() {
        return predefinedUIFlagClassName;
    }

    public static final String getPredefinedUITVFlagClassName() {
        return predefinedUITVFlagClassName;
    }

    public static final long getTimeInMillis() {
        return System.currentTimeMillis();
    }

    public static final boolean isTVOS() {
        return isTVOS;
    }
}
