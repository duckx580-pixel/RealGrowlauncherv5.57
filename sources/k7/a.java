package k7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements pg.a, j7.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f9268s = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile b f9269i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Object f9270r = f9268s;

    public a(b bVar) {
        this.f9269i = bVar;
    }

    public static pg.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    @Override // pg.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f9270r;
        Object obj3 = f9268s;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f9270r;
                if (obj == obj3) {
                    obj = this.f9269i.get();
                    Object obj4 = this.f9270r;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f9270r = obj;
                    this.f9269i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
