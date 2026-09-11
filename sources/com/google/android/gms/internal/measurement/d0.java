package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3731a;

    static {
        f3731a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
