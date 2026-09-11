package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0[] f1549a;

    @Override // androidx.datastore.preferences.protobuf.q0
    public final a1 a(Class cls) {
        for (q0 q0Var : this.f1549a) {
            if (q0Var.b(cls)) {
                return q0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean b(Class cls) {
        for (q0 q0Var : this.f1549a) {
            if (q0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
