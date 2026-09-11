package kh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f9628t = new d(1, 0, 1);

    @Override // kh.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f9621i == dVar.f9621i && this.f9622r == dVar.f9622r;
    }

    @Override // kh.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f9621i * 31) + this.f9622r;
    }

    @Override // kh.b
    public final boolean isEmpty() {
        return this.f9621i > this.f9622r;
    }

    @Override // kh.b
    public final String toString() {
        return this.f9621i + ".." + this.f9622r;
    }
}
