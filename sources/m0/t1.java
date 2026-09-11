package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0.a f11281b;

    public t1(o5 o5Var, w0.a aVar) {
        this.f11280a = o5Var;
        this.f11281b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return kotlin.jvm.internal.l.a(this.f11280a, t1Var.f11280a) && this.f11281b.equals(t1Var.f11281b);
    }

    public final int hashCode() {
        Object obj = this.f11280a;
        return this.f11281b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f11280a + ", transition=" + this.f11281b + ')';
    }
}
