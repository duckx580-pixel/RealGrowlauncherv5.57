package t4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t0 f16632e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16636d;

    static {
        x xVar = x.f16655g;
        kotlin.jvm.internal.l.f("insertEvent", xVar);
        f16632e = new t0(xVar.f16658c, xVar.f16659d, xVar.f16657b);
    }

    public t0(int i10, int i11, List list) {
        kotlin.jvm.internal.l.f("pages", list);
        this.f16633a = rg.l.y0(list);
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((m1) it.next()).f16581b.size();
        }
        this.f16634b = size;
        this.f16635c = i10;
        this.f16636d = i11;
    }

    public final n1 a(int i10) {
        ArrayList arrayList;
        int i11 = 0;
        int size = i10 - this.f16635c;
        while (true) {
            arrayList = this.f16633a;
            if (size < ((m1) arrayList.get(i11)).f16581b.size() || i11 >= sb.c.t(arrayList)) {
                break;
            }
            size -= ((m1) arrayList.get(i11)).f16581b.size();
            i11++;
        }
        return new n1(((m1) arrayList.get(i11)).f16582c, size, i10 - this.f16635c, ((e() - i10) - this.f16636d) - 1, c(), d());
    }

    public final Object b(int i10) {
        ArrayList arrayList = this.f16633a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = ((m1) arrayList.get(i11)).f16581b.size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return ((m1) arrayList.get(i11)).f16581b.get(i10);
    }

    public final int c() {
        Integer numValueOf;
        int[] iArr = ((m1) rg.l.c0(this.f16633a)).f16580a;
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 > i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i10);
        }
        kotlin.jvm.internal.l.c(numValueOf);
        return numValueOf.intValue();
    }

    public final int d() {
        Integer numValueOf;
        int[] iArr = ((m1) rg.l.k0(this.f16633a)).f16580a;
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i10);
        }
        kotlin.jvm.internal.l.c(numValueOf);
        return numValueOf.intValue();
    }

    public final int e() {
        return this.f16635c + this.f16634b + this.f16636d;
    }

    public final String toString() {
        int i10 = this.f16634b;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b(i11));
        }
        String strJ0 = rg.l.j0(arrayList, null, null, null, null, 63);
        StringBuilder sb2 = new StringBuilder("[(");
        k0.g.x(sb2, this.f16635c, " placeholders), ", strJ0, ", (");
        return k0.g.i(sb2, this.f16636d, " placeholders)]");
    }
}
