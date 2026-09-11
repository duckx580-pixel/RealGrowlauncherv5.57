package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f16569b;

    public m(int i10, p1 p1Var) {
        kotlin.jvm.internal.l.f("hint", p1Var);
        this.f16568a = i10;
        this.f16569b = p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f16568a == mVar.f16568a && kotlin.jvm.internal.l.a(this.f16569b, mVar.f16569b);
    }

    public final int hashCode() {
        return this.f16569b.hashCode() + (Integer.hashCode(this.f16568a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f16568a + ", hint=" + this.f16569b + ')';
    }
}
