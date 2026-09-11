package t6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16755c;

    public d0(int i10, String str, List list) {
        this.f16753a = str;
        this.f16754b = list;
        this.f16755c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f16753a.equals(d0Var.f16753a) && this.f16754b.equals(d0Var.f16754b) && this.f16755c == d0Var.f16755c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16755c) + k0.g.a(this.f16753a.hashCode() * 31, 31, this.f16754b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb2.append(this.f16753a);
        sb2.append(", eventTypes=");
        sb2.append(this.f16754b);
        sb2.append(", maxCapacity=");
        return k0.g.i(sb2, this.f16755c, ")");
    }
}
