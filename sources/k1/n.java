package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9099d;

    public n(float f9, float f10) {
        super(3);
        this.f9098c = f9;
        this.f9099d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f9098c, nVar.f9098c) == 0 && Float.compare(this.f9099d, nVar.f9099d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9099d) + (Float.hashCode(this.f9098c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f9098c);
        sb2.append(", y=");
        return k0.g.h(sb2, this.f9099d, ')');
    }
}
