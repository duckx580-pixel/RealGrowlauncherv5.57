package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f4545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f4546b;

    static {
        a1 a1Var = null;
        try {
            a1Var = (a1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4545a = a1Var;
        f4546b = new a1();
    }
}
