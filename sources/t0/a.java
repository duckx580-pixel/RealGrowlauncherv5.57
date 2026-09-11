package t0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16229i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16230r;

    public a(Object obj, Object obj2) {
        this.f16229i = obj;
        this.f16230r = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.l.a(entry.getKey(), this.f16229i) && kotlin.jvm.internal.l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16229i;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f16230r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f16229i;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16229i);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
