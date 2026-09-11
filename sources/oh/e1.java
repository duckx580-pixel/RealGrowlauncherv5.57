package oh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends th.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f12861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1 f12862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f12863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0 f12864e;

    public e1(a1 a1Var, f1 f1Var, t0 t0Var) {
        this.f12863d = f1Var;
        this.f12864e = t0Var;
        this.f12861b = a1Var;
    }

    @Override // th.b
    public final void b(Object obj, Object obj2) {
        th.i iVar = (th.i) obj;
        boolean z3 = obj2 == null;
        th.i iVar2 = this.f12861b;
        th.i iVar3 = z3 ? iVar2 : this.f12862c;
        if (iVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = th.i.f17212i;
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, iVar3)) {
                if (atomicReferenceFieldUpdater.get(iVar) != this) {
                    return;
                }
            }
            if (z3) {
                th.i iVar4 = this.f12862c;
                kotlin.jvm.internal.l.c(iVar4);
                iVar2.h(iVar4);
            }
        }
    }

    @Override // th.b
    public final lc.n c(Object obj) {
        if (this.f12863d.M() == this.f12864e) {
            return null;
        }
        return th.a.f17195e;
    }
}
