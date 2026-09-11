package k2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.e f9143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f9144b;

    public b0(d2.e eVar, o oVar) {
        this.f9143a = eVar;
        this.f9144b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.l.a(this.f9143a, b0Var.f9143a) && kotlin.jvm.internal.l.a(this.f9144b, b0Var.f9144b);
    }

    public final int hashCode() {
        return this.f9144b.hashCode() + (this.f9143a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f9143a) + ", offsetMapping=" + this.f9144b + ')';
    }
}
