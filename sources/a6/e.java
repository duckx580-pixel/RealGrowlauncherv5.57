package a6;

import j6.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.b f377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f378b;

    public e(j1.b bVar, o oVar) {
        this.f377a = bVar;
        this.f378b = oVar;
    }

    @Override // a6.f
    public final j1.b a() {
        return this.f377a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.f377a, eVar.f377a) && kotlin.jvm.internal.l.a(this.f378b, eVar.f378b);
    }

    public final int hashCode() {
        return this.f378b.hashCode() + (this.f377a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f377a + ", result=" + this.f378b + ')';
    }
}
