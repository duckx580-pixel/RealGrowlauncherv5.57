package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f12406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(eh.a aVar) {
        super(aVar);
        n0 n0Var = n0.f12510u;
        this.f12406b = n0Var;
    }

    @Override // o0.f1
    public final d2 b(Object obj, d2 d2Var) {
        if (d2Var == null || !(d2Var instanceof s0)) {
            return p.I(obj, this.f12406b);
        }
        ((s0) d2Var).setValue(obj);
        return d2Var;
    }
}
