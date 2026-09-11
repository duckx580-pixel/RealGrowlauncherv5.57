package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1.d f14986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh.c f14987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t.y f14988c;

    public t(a1.d dVar, eh.c cVar, t.y yVar) {
        this.f14986a = dVar;
        this.f14987b = cVar;
        this.f14988c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f14986a.equals(tVar.f14986a) && this.f14987b.equals(tVar.f14987b) && kotlin.jvm.internal.l.a(this.f14988c, tVar.f14988c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f14988c.hashCode() + ((this.f14987b.hashCode() + (this.f14986a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f14986a + ", size=" + this.f14987b + ", animationSpec=" + this.f14988c + ", clip=true)";
    }
}
