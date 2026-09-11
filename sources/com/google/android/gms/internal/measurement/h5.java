package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g5 f3810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g5 f3811b;

    static {
        g5 g5Var = null;
        try {
            g5Var = (g5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f3810a = g5Var;
        f3811b = new g5();
    }
}
