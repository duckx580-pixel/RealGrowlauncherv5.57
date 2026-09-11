package t4;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f16579d = new m1(0, rg.s.f14664i);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f16580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16582c;

    public m1(int i10, List list) {
        kotlin.jvm.internal.l.f("data", list);
        this.f16580a = new int[]{i10};
        this.f16581b = list;
        this.f16582c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.paging.TransformablePage<*>", obj);
        m1 m1Var = (m1) obj;
        return Arrays.equals(this.f16580a, m1Var.f16580a) && kotlin.jvm.internal.l.a(this.f16581b, m1Var.f16581b) && this.f16582c == m1Var.f16582c;
    }

    public final int hashCode() {
        return (k0.g.a(Arrays.hashCode(this.f16580a) * 31, 31, this.f16581b) + this.f16582c) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb2.append(Arrays.toString(this.f16580a));
        sb2.append(", data=");
        sb2.append(this.f16581b);
        sb2.append(", hintOriginalPageOffset=");
        return k0.g.i(sb2, this.f16582c, ", hintOriginalIndices=null)");
    }
}
