package u2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17595b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17597d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17594a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f17596c = x.f17614i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17598e = true;

    public n(boolean z3, boolean z10) {
        this.f17595b = z3;
        this.f17597d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f17594a == nVar.f17594a && this.f17595b == nVar.f17595b && this.f17596c == nVar.f17596c && this.f17597d == nVar.f17597d && this.f17598e == nVar.f17598e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17598e) + h0.c((this.f17596c.hashCode() + h0.c(Boolean.hashCode(this.f17594a) * 31, 31, this.f17595b)) * 31, 31, this.f17597d);
    }
}
