package oh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class z0 extends f1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12943s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(w0 w0Var) {
        super(true);
        boolean z3 = true;
        P(w0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.f12872r;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        j jVar = iVar instanceof j ? (j) iVar : null;
        if (jVar == null) {
            z3 = false;
            break;
        }
        f1 f1VarL = jVar.l();
        while (!f1VarL.J()) {
            i iVar2 = (i) atomicReferenceFieldUpdater.get(f1VarL);
            j jVar2 = iVar2 instanceof j ? (j) iVar2 : null;
            if (jVar2 == null) {
                z3 = false;
                break;
            }
            f1VarL = jVar2.l();
        }
        this.f12943s = z3;
    }

    @Override // oh.f1
    public final boolean J() {
        return this.f12943s;
    }

    @Override // oh.f1
    public final boolean K() {
        return true;
    }
}
