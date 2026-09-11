package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f18391a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f18392b;

    @Override // e1.f
    public final boolean a() {
        Boolean bool = f18392b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written");
    }

    @Override // e1.f
    public final void b(boolean z3) {
        f18392b = Boolean.valueOf(z3);
    }
}
