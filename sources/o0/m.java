package o0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f12500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f12501e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0 f12502f = p.I(w0.d.f18732t, n0.f12509t);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f12503g;

    public m(o oVar, int i10, boolean z3, boolean z10, n0 n0Var) {
        this.f12503g = oVar;
        this.f12497a = i10;
        this.f12498b = z3;
        this.f12499c = z10;
    }

    @Override // o0.r
    public final void a(t tVar, w0.a aVar) {
        this.f12503g.f12514b.a(tVar, aVar);
    }

    @Override // o0.r
    public final void b() {
        o oVar = this.f12503g;
        oVar.f12536z--;
    }

    @Override // o0.r
    public final boolean c() {
        return this.f12498b;
    }

    @Override // o0.r
    public final boolean d() {
        return this.f12499c;
    }

    @Override // o0.r
    public final d1 e() {
        return (d1) this.f12502f.getValue();
    }

    @Override // o0.r
    public final int f() {
        return this.f12497a;
    }

    @Override // o0.r
    public final ug.h g() {
        return this.f12503g.f12514b.g();
    }

    @Override // o0.r
    public final void h(t tVar) {
        o oVar = this.f12503g;
        oVar.f12514b.h(oVar.f12519g);
        oVar.f12514b.h(tVar);
    }

    @Override // o0.r
    public final void i(Set set) {
        HashSet hashSet = this.f12500d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f12500d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // o0.r
    public final void j(o oVar) {
        this.f12501e.add(oVar);
    }

    @Override // o0.r
    public final void k(t tVar) {
        this.f12503g.f12514b.k(tVar);
    }

    @Override // o0.r
    public final void l() {
        this.f12503g.f12536z++;
    }

    @Override // o0.r
    public final void m(o oVar) {
        HashSet<Set> hashSet = this.f12500d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl", oVar);
                set.remove(oVar.f12515c);
            }
        }
        kotlin.jvm.internal.a0.a(this.f12501e).remove(oVar);
    }

    @Override // o0.r
    public final void n(t tVar) {
        this.f12503g.f12514b.n(tVar);
    }

    public final void o() {
        LinkedHashSet<o> linkedHashSet = this.f12501e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f12500d;
        if (hashSet != null) {
            for (o oVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(oVar.f12515c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
