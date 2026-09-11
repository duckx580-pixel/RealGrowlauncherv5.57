package k3;

import android.graphics.Insets;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f9223e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9227d;

    public c(int i10, int i11, int i12, int i13) {
        this.f9224a = i10;
        this.f9225b = i11;
        this.f9226c = i12;
        this.f9227d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f9224a, cVar2.f9224a), Math.max(cVar.f9225b, cVar2.f9225b), Math.max(cVar.f9226c, cVar2.f9226c), Math.max(cVar.f9227d, cVar2.f9227d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f9223e : new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f9224a, this.f9225b, this.f9226c, this.f9227d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9227d == cVar.f9227d && this.f9224a == cVar.f9224a && this.f9226c == cVar.f9226c && this.f9225b == cVar.f9225b;
    }

    public final int hashCode() {
        return (((((this.f9224a * 31) + this.f9225b) * 31) + this.f9226c) * 31) + this.f9227d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f9224a);
        sb2.append(", top=");
        sb2.append(this.f9225b);
        sb2.append(", right=");
        sb2.append(this.f9226c);
        sb2.append(", bottom=");
        return h0.g(sb2, this.f9227d, '}');
    }
}
