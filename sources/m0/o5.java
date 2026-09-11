package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5 f11088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oh.f f11089b;

    public o5(p5 p5Var, oh.f fVar) {
        kotlin.jvm.internal.l.f("visuals", p5Var);
        this.f11088a = p5Var;
        this.f11089b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o5.class != obj.getClass()) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return kotlin.jvm.internal.l.a(this.f11088a, o5Var.f11088a) && this.f11089b.equals(o5Var.f11089b);
    }

    public final int hashCode() {
        return this.f11089b.hashCode() + (this.f11088a.hashCode() * 31);
    }
}
