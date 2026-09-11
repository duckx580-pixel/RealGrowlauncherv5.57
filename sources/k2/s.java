package k2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.e f9192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9193b;

    public s(String str, int i10) {
        this.f9192a = new d2.e(6, str, null);
        this.f9193b = i10;
    }

    @Override // k2.i
    public final void a(j jVar) {
        int i10 = jVar.f9175d;
        d2.e eVar = this.f9192a;
        if (i10 != -1) {
            int i11 = jVar.f9176e;
            String str = eVar.f4836i;
            String str2 = eVar.f4836i;
            jVar.d(i10, i11, str);
            if (str2.length() > 0) {
                jVar.e(i10, str2.length() + i10);
            }
        } else {
            int i12 = jVar.f9173b;
            int i13 = jVar.f9174c;
            String str3 = eVar.f4836i;
            String str4 = eVar.f4836i;
            jVar.d(i12, i13, str3);
            if (str4.length() > 0) {
                jVar.e(i12, str4.length() + i12);
            }
        }
        int i14 = jVar.f9173b;
        int i15 = jVar.f9174c;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f9193b;
        int iE = gh.a.e(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - eVar.f4836i.length(), 0, jVar.f9172a.b());
        jVar.f(iE, iE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.l.a(this.f9192a.f4836i, sVar.f9192a.f4836i) && this.f9193b == sVar.f9193b;
    }

    public final int hashCode() {
        return (this.f9192a.f4836i.hashCode() * 31) + this.f9193b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f9192a.f4836i);
        sb2.append("', newCursorPosition=");
        return h0.g(sb2, this.f9193b, ')');
    }
}
