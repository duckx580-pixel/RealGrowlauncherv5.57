package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 implements t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3 f4007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o3 f4008b;

    static {
        b9.b bVar = new b9.b(m3.a(), true, true);
        bVar.k("measurement.collection.event_safelist", true);
        f4007a = bVar.k("measurement.service.store_null_safelist", true);
        f4008b = bVar.k("measurement.service.store_safelist", true);
    }
}
