package p2;

import g1.i0;
import g1.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f13259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13260b;

    public b(i0 i0Var, float f9) {
        this.f13259a = i0Var;
        this.f13260b = f9;
    }

    @Override // p2.o
    public final float c() {
        return this.f13260b;
    }

    @Override // p2.o
    public final long d() {
        int i10 = t.f6917o;
        return t.f6916n;
    }

    @Override // p2.o
    public final g1.p e() {
        return this.f13259a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f13259a, bVar.f13259a) && Float.compare(this.f13260b, bVar.f13260b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13260b) + (this.f13259a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f13259a);
        sb2.append(", alpha=");
        return k0.g.h(sb2, this.f13260b, ')');
    }
}
