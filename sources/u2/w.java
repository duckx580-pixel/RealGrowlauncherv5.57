package u2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17613c;

    public w(int i10) {
        boolean z3 = (i10 & 1) == 0;
        boolean z10 = (i10 & 32) != 0;
        this.f17611a = z3;
        this.f17612b = true;
        this.f17613c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f17611a == wVar.f17611a && this.f17612b == wVar.f17612b && this.f17613c == wVar.f17613c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + h0.c(h0.c((x.f17614i.hashCode() + h0.c(h0.c(h0.c(Boolean.hashCode(true) * 31, 31, this.f17611a), 31, true), 31, true)) * 31, 31, this.f17612b), 31, this.f17613c);
    }
}
