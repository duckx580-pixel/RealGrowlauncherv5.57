package p2;

import g1.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13261a;

    public c(long j) {
        this.f13261a = j;
        if (j == t.f6916n) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // p2.o
    public final float c() {
        return t.d(this.f13261a);
    }

    @Override // p2.o
    public final long d() {
        return this.f13261a;
    }

    @Override // p2.o
    public final g1.p e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && t.c(this.f13261a, ((c) obj).f13261a);
    }

    public final int hashCode() {
        int i10 = t.f6917o;
        return Long.hashCode(this.f13261a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) t.i(this.f13261a)) + ')';
    }
}
