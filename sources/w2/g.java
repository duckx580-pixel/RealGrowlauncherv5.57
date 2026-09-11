package w2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19045b;

    public g(Integer num, int i10) {
        this.f19044a = num;
        this.f19045b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f19044a.equals(gVar.f19044a) && this.f19045b == gVar.f19045b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19045b) + (this.f19044a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalAnchor(id=");
        sb2.append(this.f19044a);
        sb2.append(", index=");
        return h0.g(sb2, this.f19045b, ')');
    }
}
