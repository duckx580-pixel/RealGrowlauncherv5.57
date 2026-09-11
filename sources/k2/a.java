package k2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.e f9139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9140b;

    public a(d2.e eVar, int i10) {
        this.f9139a = eVar;
        this.f9140b = i10;
    }

    @Override // k2.i
    public final void a(j jVar) {
        int i10 = jVar.f9175d;
        d2.e eVar = this.f9139a;
        if (i10 != -1) {
            jVar.d(i10, jVar.f9176e, eVar.f4836i);
        } else {
            jVar.d(jVar.f9173b, jVar.f9174c, eVar.f4836i);
        }
        int i11 = jVar.f9173b;
        int i12 = jVar.f9174c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f9140b;
        int iE = gh.a.e(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - eVar.f4836i.length(), 0, jVar.f9172a.b());
        jVar.f(iE, iE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.f9139a.f4836i, aVar.f9139a.f4836i) && this.f9140b == aVar.f9140b;
    }

    public final int hashCode() {
        return (this.f9139a.f4836i.hashCode() * 31) + this.f9140b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f9139a.f4836i);
        sb2.append("', newCursorPosition=");
        return h0.g(sb2, this.f9140b, ')');
    }

    public a(String str, int i10) {
        this(new d2.e(6, str, null), i10);
    }
}
