package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16021b;

    public b1(Object obj, Object obj2) {
        this.f16020a = obj;
        this.f16021b = obj2;
    }

    @Override // t.a1
    public final Object a() {
        return this.f16020a;
    }

    @Override // t.a1
    public final Object c() {
        return this.f16021b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.l.a(this.f16020a, a1Var.a()) && kotlin.jvm.internal.l.a(this.f16021b, a1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f16020a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f16021b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
