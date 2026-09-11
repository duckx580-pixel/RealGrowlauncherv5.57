package z4;

import java.util.ArrayList;
import java.util.List;
import k0.g;
import kotlin.jvm.internal.l;
import nh.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20605d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public d(String str, boolean z3, List list, List list2) {
        l.f("columns", list);
        l.f("orders", list2);
        this.f20602a = str;
        this.f20603b = z3;
        this.f20604c = list;
        this.f20605d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add("ASC");
            }
        }
        this.f20605d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f20602a;
            if (this.f20603b == dVar.f20603b && l.a(this.f20604c, dVar.f20604c) && l.a(this.f20605d, dVar.f20605d)) {
                String str2 = this.f20602a;
                return o.J(str2, "index_", false) ? o.J(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20602a;
        return this.f20605d.hashCode() + g.a((((o.J(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f20603b ? 1 : 0)) * 31, 31, this.f20604c);
    }

    public final String toString() {
        return "Index{name='" + this.f20602a + "', unique=" + this.f20603b + ", columns=" + this.f20604c + ", orders=" + this.f20605d + "'}";
    }
}
