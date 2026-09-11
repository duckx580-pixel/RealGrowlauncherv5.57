package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19926d;

    public c0(int i10, int i11, int i12, int i13) {
        this.f19923a = i10;
        this.f19924b = i11;
        this.f19925c = i12;
        this.f19926d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f19923a == c0Var.f19923a && this.f19924b == c0Var.f19924b && this.f19925c == c0Var.f19925c && this.f19926d == c0Var.f19926d;
    }

    public final int hashCode() {
        return (((((this.f19923a * 31) + this.f19924b) * 31) + this.f19925c) * 31) + this.f19926d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f19923a);
        sb2.append(", top=");
        sb2.append(this.f19924b);
        sb2.append(", right=");
        sb2.append(this.f19925c);
        sb2.append(", bottom=");
        return s.h0.g(sb2, this.f19926d, ')');
    }
}
