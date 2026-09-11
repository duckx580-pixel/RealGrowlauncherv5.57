package z;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f20481a;

    public c(q qVar) {
        this.f20481a = qVar;
    }

    @Override // b0.n
    public final int b() {
        return this.f20481a.g().j;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // b0.n
    public final int c() {
        return Math.min(b() - 1, ((m) rg.l.k0(this.f20481a.g().f20523g)).f20527a);
    }

    @Override // b0.n
    public final void d() {
        androidx.compose.ui.node.a aVar = this.f20481a.f20566m;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // b0.n
    public final boolean e() {
        return !((Collection) this.f20481a.g().f20523g).isEmpty();
    }

    @Override // b0.n
    public final int f() {
        return Math.max(0, this.f20481a.f20557c.f42b.f());
    }
}
