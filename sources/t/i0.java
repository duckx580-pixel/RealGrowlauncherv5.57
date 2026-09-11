package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f16108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f16109b;

    public i0(Float f9, v vVar) {
        this.f16108a = f9;
        this.f16109b = vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return i0Var.f16108a.equals(this.f16108a) && kotlin.jvm.internal.l.a(i0Var.f16109b, this.f16109b);
    }

    public final int hashCode() {
        return this.f16109b.hashCode() + (this.f16108a.hashCode() * 31);
    }
}
