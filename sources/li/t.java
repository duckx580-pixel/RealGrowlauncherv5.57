package li;

import fi.y1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f10056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10057b;

    public t(y1 y1Var, long j) {
        kotlin.jvm.internal.l.f("item", y1Var);
        this.f10056a = y1Var;
        this.f10057b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.l.a(this.f10056a, tVar.f10056a) && f1.c.b(this.f10057b, tVar.f10057b);
    }

    public final int hashCode() {
        int iHashCode = this.f10056a.hashCode() * 31;
        int i10 = f1.c.f5976e;
        return Long.hashCode(this.f10057b) + iHashCode;
    }

    public final String toString() {
        return "ShortcutData(item=" + this.f10056a + ", offset=" + f1.c.i(this.f10057b) + ")";
    }
}
