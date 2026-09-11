package k2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f9178d = new m(1, 1, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9181c;

    public m(int i10, int i11, boolean z3) {
        this.f9179a = z3;
        this.f9180b = i10;
        this.f9181c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f9179a == mVar.f9179a && this.f9180b == mVar.f9180b && this.f9181c == mVar.f9181c;
    }

    public final int hashCode() {
        return android.support.v4.media.session.a.z(this.f9181c, android.support.v4.media.session.a.z(this.f9180b, h0.c(android.support.v4.media.session.a.z(0, Boolean.hashCode(this.f9179a) * 31, 31), 31, true), 31), 31);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f9179a + ", capitalization=None, autoCorrect=true, keyboardType=" + ((Object) rk.a.l0(this.f9180b)) + ", imeAction=" + ((Object) l.a(this.f9181c)) + ", platformImeOptions=null)";
    }
}
