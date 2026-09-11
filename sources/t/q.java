package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f16163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f16164b;

    public q(double d10, double d11) {
        this.f16163a = d10;
        this.f16164b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Double.compare(this.f16163a, qVar.f16163a) == 0 && Double.compare(this.f16164b, qVar.f16164b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f16164b) + (Double.hashCode(this.f16163a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f16163a + ", _imaginary=" + this.f16164b + ')';
    }
}
