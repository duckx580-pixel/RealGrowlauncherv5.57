package wh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lc.n;
import oh.x1;
import qg.o;
import t.q0;
import th.r;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class i implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19267c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19268d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19269e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19270f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19271g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f19273b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public i(int i10) {
        this.f19272a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(k0.g.d(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(k0.g.d(i10, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head = kVar;
        this.tail = kVar;
        this._availablePermits = i10;
        this.f19273b = new q0(19, this);
    }

    public final boolean a(x1 x1Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19269e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f19270f.getAndIncrement(this);
        g gVar = g.f19265i;
        long j = andIncrement / ((long) j.f19279f);
        loop0: while (true) {
            objB = th.a.b(kVar, j, gVar);
            if (!th.a.e(objB)) {
                r rVarC = th.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f17228s >= rVarC.f17228s) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) th.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = kVar2.f19280u;
        int i10 = (int) (andIncrement % ((long) j.f19279f));
        while (!atomicReferenceArray.compareAndSet(i10, null, x1Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                n nVar = j.f19275b;
                n nVar2 = j.f19276c;
                while (!atomicReferenceArray.compareAndSet(i10, nVar, nVar2)) {
                    if (atomicReferenceArray.get(i10) != nVar) {
                        return false;
                    }
                }
                ((oh.e) x1Var).b(o.f13926a, this.f19273b);
                return true;
            }
        }
        x1Var.a(kVar2, i10);
        return true;
    }

    public final void b() {
        int i10;
        Object objB;
        boolean z3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19271g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f19272a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19267c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f19268d.getAndIncrement(this);
            long j = andIncrement2 / ((long) j.f19279f);
            h hVar = h.f19266i;
            while (true) {
                objB = th.a.b(kVar, j, hVar);
                if (th.a.e(objB)) {
                    break;
                }
                r rVarC = th.a.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f17228s >= rVarC.f17228s) {
                        break;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            }
            k kVar2 = (k) th.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = kVar2.f19280u;
            kVar2.a();
            z3 = false;
            if (kVar2.f17228s <= j) {
                int i12 = (int) (andIncrement2 % ((long) j.f19279f));
                Object andSet = atomicReferenceArray.getAndSet(i12, j.f19275b);
                if (andSet == null) {
                    int i13 = j.f19274a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (atomicReferenceArray.get(i12) == j.f19276c) {
                            z3 = true;
                            break;
                        }
                    }
                    n nVar = j.f19275b;
                    n nVar2 = j.f19277d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, nVar, nVar2)) {
                            if (atomicReferenceArray.get(i12) != nVar) {
                                break;
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = !z3;
                } else if (andSet != j.f19278e) {
                    if (!(andSet instanceof oh.e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    oh.e eVar = (oh.e) andSet;
                    n nVarK = eVar.k(o.f13926a, this.f19273b);
                    if (nVarK != null) {
                        eVar.w(nVarK);
                        z3 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z3);
    }
}
