package ij;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oj.j f8294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final oj.j f8295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final oj.j f8296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final oj.j f8297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final oj.j f8298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final oj.j f8299i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oj.j f8301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oj.j f8302c;

    static {
        oj.j jVar = oj.j.f13087t;
        f8294d = cb.f.h(":");
        f8295e = cb.f.h(":status");
        f8296f = cb.f.h(":method");
        f8297g = cb.f.h(":path");
        f8298h = cb.f.h(":scheme");
        f8299i = cb.f.h(":authority");
    }

    public b(oj.j jVar, oj.j jVar2) {
        kotlin.jvm.internal.l.f("name", jVar);
        kotlin.jvm.internal.l.f("value", jVar2);
        this.f8301b = jVar;
        this.f8302c = jVar2;
        this.f8300a = jVar2.c() + jVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f8301b, bVar.f8301b) && kotlin.jvm.internal.l.a(this.f8302c, bVar.f8302c);
    }

    public final int hashCode() {
        oj.j jVar = this.f8301b;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        oj.j jVar2 = this.f8302c;
        return iHashCode + (jVar2 != null ? jVar2.hashCode() : 0);
    }

    public final String toString() {
        return this.f8301b.p() + ": " + this.f8302c.p();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(cb.f.h(str), cb.f.h(str2));
        kotlin.jvm.internal.l.f("name", str);
        kotlin.jvm.internal.l.f("value", str2);
        oj.j jVar = oj.j.f13087t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(oj.j jVar, String str) {
        this(jVar, cb.f.h(str));
        kotlin.jvm.internal.l.f("name", jVar);
        kotlin.jvm.internal.l.f("value", str);
        oj.j jVar2 = oj.j.f13087t;
    }
}
