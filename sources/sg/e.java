package sg;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Map.Entry, fh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f15775i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15777s;

    public e(f fVar, int i10) {
        l.f("map", fVar);
        this.f15775i = fVar;
        this.f15776r = i10;
        this.f15777s = fVar.f15784x;
    }

    public final void a() {
        if (this.f15775i.f15784x != this.f15777s) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f15775i.f15778i[this.f15776r];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f15775i.f15779r;
        l.c(objArr);
        return objArr[this.f15776r];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f15775i;
        fVar.c();
        Object[] objArr = fVar.f15779r;
        if (objArr == null) {
            int length = fVar.f15778i.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f15779r = objArr;
        }
        int i10 = this.f15776r;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
