package w2;

import t1.n0;
import w1.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends f0 implements n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f19054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eh.c f19055d;

    public k(f fVar, eh.c cVar) {
        kotlin.jvm.internal.l.f("constrainBlock", cVar);
        this.f19054c = fVar;
        this.f19055d = cVar;
    }

    @Override // a1.l, a1.n
    public final Object a(Object obj, eh.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // a1.l, a1.n
    public final boolean e(eh.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }

    public final boolean equals(Object obj) {
        k kVar = obj instanceof k ? (k) obj : null;
        return kotlin.jvm.internal.l.a(this.f19055d, kVar != null ? kVar.f19055d : null);
    }

    public final int hashCode() {
        return this.f19055d.hashCode();
    }

    @Override // a1.n
    public final a1.n j(a1.n nVar) {
        return super.j(nVar);
    }

    @Override // t1.n0
    public final Object k(q2.b bVar) {
        kotlin.jvm.internal.l.f("<this>", bVar);
        return new j(this.f19054c, this.f19055d);
    }
}
