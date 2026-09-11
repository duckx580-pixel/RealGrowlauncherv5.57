package w1;

import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements o0.q, androidx.lifecycle.t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f18925i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0.t f18926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.lifecycle.p f18928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public eh.e f18929u = z0.f19012a;

    public r2(t tVar, o0.t tVar2) {
        this.f18925i = tVar;
        this.f18926r = tVar2;
    }

    public final void b() {
        if (!this.f18927s) {
            this.f18927s = true;
            this.f18925i.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.p pVar = this.f18928t;
            if (pVar != null) {
                pVar.c(this);
            }
        }
        this.f18926r.l();
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            b();
        } else {
            if (nVar != androidx.lifecycle.n.ON_CREATE || this.f18927s) {
                return;
            }
            d(this.f18929u);
        }
    }

    public final void d(eh.e eVar) {
        this.f18925i.setOnViewTreeOwnersAvailable(new t.h0(14, this, eVar));
    }
}
