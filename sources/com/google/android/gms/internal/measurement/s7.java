package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 implements r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3 f3979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o3 f3980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o3 f3981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o3 f3982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o3 f3983e;

    static {
        b9.b bVar = new b9.b(m3.a(), false, true);
        f3979a = bVar.k("measurement.test.boolean_flag", false);
        f3980b = new o3(bVar, "measurement.test.double_flag", Double.valueOf(-3.0d), 2);
        f3981c = bVar.h(-2L, "measurement.test.int_flag");
        f3982d = bVar.h(-1L, "measurement.test.long_flag");
        f3983e = new o3(bVar, "measurement.test.string_flag", "---", 3);
    }
}
