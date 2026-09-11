package w2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19047b;

    public h(Integer num, int i10) {
        this.f19046a = num;
        this.f19047b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f19046a.equals(hVar.f19046a) && this.f19047b == hVar.f19047b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19047b) + (this.f19046a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalAnchor(id=");
        sb2.append(this.f19046a);
        sb2.append(", index=");
        return h0.g(sb2, this.f19047b, ')');
    }
}
