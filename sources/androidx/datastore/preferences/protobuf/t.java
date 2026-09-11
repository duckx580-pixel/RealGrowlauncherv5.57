package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f1616b = new t(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1617a;

    public /* synthetic */ t(int i10) {
        this.f1617a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final a1 a(Class cls) {
        switch (this.f1617a) {
            case 0:
                if (!w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (a1) w.e(cls.asSubclass(w.class)).d(3);
                } catch (Exception e8) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean b(Class cls) {
        switch (this.f1617a) {
            case 0:
                return w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
