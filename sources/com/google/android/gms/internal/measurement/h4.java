package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g4 f3808a = new g4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g4 f3809b;

    static {
        g4 g4Var = null;
        try {
            g4Var = (g4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f3809b = g4Var;
    }
}
