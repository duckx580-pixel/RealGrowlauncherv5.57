package t4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f16488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hd.b0 f16489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16490d;

    public f1(List list, Integer num, hd.b0 b0Var, int i10) {
        this.f16487a = list;
        this.f16488b = num;
        this.f16489c = b0Var;
        this.f16490d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.l.a(this.f16487a, f1Var.f16487a) && kotlin.jvm.internal.l.a(this.f16488b, f1Var.f16488b) && kotlin.jvm.internal.l.a(this.f16489c, f1Var.f16489c) && this.f16490d == f1Var.f16490d;
    }

    public final int hashCode() {
        int iHashCode = this.f16487a.hashCode();
        Integer num = this.f16488b;
        return Integer.hashCode(this.f16490d) + this.f16489c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingState(pages=");
        sb2.append(this.f16487a);
        sb2.append(", anchorPosition=");
        sb2.append(this.f16488b);
        sb2.append(", config=");
        sb2.append(this.f16489c);
        sb2.append(", leadingPlaceholderCount=");
        return s.h0.g(sb2, this.f16490d, ')');
    }
}
