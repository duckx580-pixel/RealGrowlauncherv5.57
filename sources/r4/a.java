package r4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends v {
    @Override // r4.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // r4.v
    public final int hashCode() {
        return super.hashCode() * 961;
    }
}
