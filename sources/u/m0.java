package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends a1.m implements u1.d, v1.p {
    public boolean D;
    public v1.t0 E;

    @Override // v1.p
    public final void u(v1.t0 t0Var) {
        this.E = t0Var;
        if (this.D) {
            if (!t0Var.J0().C) {
                eh.c cVar = this.C ? (eh.c) h(l0.f17462a) : null;
                if (cVar != null) {
                    cVar.invoke(null);
                    return;
                }
                return;
            }
            v1.t0 t0Var2 = this.E;
            if (t0Var2 == null || !t0Var2.J0().C) {
                return;
            }
            eh.c cVar2 = this.C ? (eh.c) h(l0.f17462a) : null;
            if (cVar2 != null) {
                cVar2.invoke(this.E);
            }
        }
    }
}
