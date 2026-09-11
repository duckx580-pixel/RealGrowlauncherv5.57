package com.usercentrics.sdk.extensions;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TimeExtensionsKt {
    public static final int HOURS_PER_DAY = 24;
    public static final int MILLIS_PER_SECOND = 1000;
    public static final int MINUTES_PER_HOUR = 60;
    public static final int SECONDS_PER_MINUTE = 60;
    public static final int millisToDays = 86400000;

    public static final long millisToSeconds(long j) {
        return j / ((long) MILLIS_PER_SECOND);
    }

    public static final long secondsToMillis(long j) {
        return j * ((long) MILLIS_PER_SECOND);
    }
}
