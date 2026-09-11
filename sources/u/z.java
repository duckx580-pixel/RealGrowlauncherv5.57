package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c {
    public eh.a J;
    public final w K;
    public final b0 L;

    public z(eh.a aVar, eh.a aVar2, x.l lVar) {
        super(lVar, true, aVar);
        this.J = aVar2;
        w wVar = new w(true, null, aVar, aVar2);
        G0(wVar);
        this.K = wVar;
        a aVar3 = this.I;
        eh.a aVar4 = this.J;
        b0 b0Var = new b0(true, lVar, aVar, aVar3);
        b0Var.L = aVar4;
        G0(b0Var);
        this.L = b0Var;
    }

    @Override // u.c
    public final d I0() {
        return this.L;
    }
}
