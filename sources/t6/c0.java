package t6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16745a;

    public c0(List list) {
        this.f16745a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.l.a(this.f16745a, ((c0) obj).f16745a);
    }

    public final int hashCode() {
        return this.f16745a.hashCode();
    }

    public final String toString() {
        return "StorageConfig(typeEntries=" + this.f16745a + ")";
    }
}
