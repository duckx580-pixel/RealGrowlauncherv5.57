package o;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f12364i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f12365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f12366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f12367t;

    public c(Object obj, Object obj2) {
        this.f12364i = obj;
        this.f12365r = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12364i.equals(cVar.f12364i) && this.f12365r.equals(cVar.f12365r);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12364i;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12365r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f12364i.hashCode() ^ this.f12365r.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f12364i + "=" + this.f12365r;
    }
}
