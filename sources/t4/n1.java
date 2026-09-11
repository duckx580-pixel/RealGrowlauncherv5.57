package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16588f;

    public n1(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i12, i13, i14, i15);
        this.f16587e = i10;
        this.f16588f = i11;
    }

    @Override // t4.p1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f16587e == n1Var.f16587e && this.f16588f == n1Var.f16588f && this.f16608a == n1Var.f16608a && this.f16609b == n1Var.f16609b && this.f16610c == n1Var.f16610c && this.f16611d == n1Var.f16611d;
    }

    @Override // t4.p1
    public final int hashCode() {
        return Integer.hashCode(this.f16588f) + Integer.hashCode(this.f16587e) + super.hashCode();
    }

    public final String toString() {
        return nh.i.B("ViewportHint.Access(\n            |    pageOffset=" + this.f16587e + ",\n            |    indexInPage=" + this.f16588f + ",\n            |    presentedItemsBefore=" + this.f16608a + ",\n            |    presentedItemsAfter=" + this.f16609b + ",\n            |    originalPageOffsetFirst=" + this.f16610c + ",\n            |    originalPageOffsetLast=" + this.f16611d + ",\n            |)");
    }
}
