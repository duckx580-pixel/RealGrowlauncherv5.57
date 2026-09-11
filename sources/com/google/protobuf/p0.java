package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0[] f4637a;

    @Override // com.google.protobuf.w0
    public final g1 a(Class cls) {
        for (w0 w0Var : this.f4637a) {
            if (w0Var.b(cls)) {
                return w0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.w0
    public final boolean b(Class cls) {
        for (w0 w0Var : this.f4637a) {
            if (w0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
