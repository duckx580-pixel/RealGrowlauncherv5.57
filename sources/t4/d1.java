package t4;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends e1 implements Iterable, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f16465i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f16467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f16468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f16469u;

    static {
        new d1(rg.s.f14664i, null, null, 0, 0);
    }

    public d1(List list, Object obj, Object obj2, int i10, int i11) {
        kotlin.jvm.internal.l.f("data", list);
        this.f16465i = list;
        this.f16466r = obj;
        this.f16467s = obj2;
        this.f16468t = i10;
        this.f16469u = i11;
        if (i10 != Integer.MIN_VALUE && i10 < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if (i11 != Integer.MIN_VALUE && i11 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return kotlin.jvm.internal.l.a(this.f16465i, d1Var.f16465i) && kotlin.jvm.internal.l.a(this.f16466r, d1Var.f16466r) && kotlin.jvm.internal.l.a(this.f16467s, d1Var.f16467s) && this.f16468t == d1Var.f16468t && this.f16469u == d1Var.f16469u;
    }

    public final int hashCode() {
        int iHashCode = this.f16465i.hashCode() * 31;
        Object obj = this.f16466r;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f16467s;
        return Integer.hashCode(this.f16469u) + android.support.v4.media.session.a.z(this.f16468t, (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f16465i.listIterator();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
        List list = this.f16465i;
        sb2.append(list.size());
        sb2.append("\n                    |   first Item: ");
        sb2.append(rg.l.e0(list));
        sb2.append("\n                    |   last Item: ");
        sb2.append(rg.l.l0(list));
        sb2.append("\n                    |   nextKey: ");
        sb2.append(this.f16467s);
        sb2.append("\n                    |   prevKey: ");
        sb2.append(this.f16466r);
        sb2.append("\n                    |   itemsBefore: ");
        sb2.append(this.f16468t);
        sb2.append("\n                    |   itemsAfter: ");
        sb2.append(this.f16469u);
        sb2.append("\n                    |) ");
        return nh.i.B(sb2.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d1(List list, Integer num, Integer num2) {
        this(list, num, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
        kotlin.jvm.internal.l.f("data", list);
    }
}
