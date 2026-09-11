package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f4668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f4669b;

    static {
        u0 u0Var = null;
        try {
            u0Var = (u0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4668a = u0Var;
        f4669b = new u0();
    }
}
