package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends w1.f0 implements a1.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.c f16300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16301d = te.a.c(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public m0(eh.c cVar) {
        this.f16300c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f16300c, ((m0) obj).f16300c);
    }

    public final int hashCode() {
        return this.f16300c.hashCode();
    }
}
