package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f4652a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f4653b;

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4653b = rVar;
    }
}
