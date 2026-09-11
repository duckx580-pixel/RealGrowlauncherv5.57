package qh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oh.x;
import oh.x1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f13929i = f.f13962p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public oh.f f13930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f13931s;

    public a(d dVar) {
        this.f13931s = dVar;
    }

    @Override // oh.x1
    public final void a(th.r rVar, int i10) {
        oh.f fVar = this.f13930r;
        if (fVar != null) {
            fVar.a(rVar, i10);
        }
    }

    public final Object b(wg.c cVar) throws Throwable {
        l lVarN;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.w;
        d dVar = this.f13931s;
        l lVar = (l) atomicReferenceFieldUpdater.get(dVar);
        while (!dVar.w()) {
            long andIncrement = d.f13939s.getAndIncrement(dVar);
            long j = f.f13949b;
            long j10 = andIncrement / j;
            int i10 = (int) (andIncrement % j);
            if (lVar.f17228s != j10) {
                lVarN = dVar.n(j10, lVar);
                if (lVarN == null) {
                    continue;
                }
            } else {
                lVarN = lVar;
            }
            Object objH = dVar.H(lVarN, i10, andIncrement, null);
            lc.n nVar = f.f13959m;
            if (objH == nVar) {
                throw new IllegalStateException("unreachable");
            }
            lc.n nVar2 = f.f13961o;
            if (objH != nVar2) {
                if (objH != f.f13960n) {
                    lVarN.a();
                    this.f13929i = objH;
                    return Boolean.TRUE;
                }
                d dVar2 = this.f13931s;
                oh.f fVarN = x.n(qd.a.j(cVar));
                try {
                    this.f13930r = fVarN;
                    Object objH2 = dVar2.H(lVarN, i10, andIncrement, this);
                    if (objH2 == nVar) {
                        a(lVarN, i10);
                    } else {
                        if (objH2 == nVar2) {
                            if (andIncrement < dVar2.t()) {
                                lVarN.a();
                            }
                            l lVar2 = (l) d.w.get(dVar2);
                            while (true) {
                                if (dVar2.w()) {
                                    oh.f fVar = this.f13930r;
                                    kotlin.jvm.internal.l.c(fVar);
                                    this.f13930r = null;
                                    this.f13929i = f.f13958l;
                                    Throwable thO = dVar.o();
                                    if (thO == null) {
                                        fVar.resumeWith(Boolean.FALSE);
                                    } else {
                                        fVar.resumeWith(androidx.work.v.i(thO));
                                    }
                                } else {
                                    long andIncrement2 = d.f13939s.getAndIncrement(dVar2);
                                    long j11 = f.f13949b;
                                    long j12 = andIncrement2 / j11;
                                    int i11 = (int) (andIncrement2 % j11);
                                    if (lVar2.f17228s != j12) {
                                        l lVarN2 = dVar2.n(j12, lVar2);
                                        if (lVarN2 != null) {
                                            lVar2 = lVarN2;
                                        }
                                    }
                                    Object objH3 = dVar2.H(lVar2, i11, andIncrement2, this);
                                    if (objH3 == f.f13959m) {
                                        a(lVar2, i11);
                                        break;
                                    }
                                    if (objH3 == f.f13961o) {
                                        if (andIncrement2 < dVar2.t()) {
                                            lVar2.a();
                                        }
                                    } else {
                                        if (objH3 == f.f13960n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar2.a();
                                        this.f13929i = objH3;
                                        this.f13930r = null;
                                    }
                                }
                            }
                        } else {
                            lVarN.a();
                            this.f13929i = objH2;
                            this.f13930r = null;
                        }
                        fVarN.b(Boolean.TRUE, null);
                    }
                    Object objQ = fVarN.q();
                    vg.a aVar = vg.a.f18663i;
                    return objQ;
                } catch (Throwable th2) {
                    fVarN.B();
                    throw th2;
                }
            }
            if (andIncrement < dVar.t()) {
                lVarN.a();
            }
            lVar = lVarN;
        }
        this.f13929i = f.f13958l;
        Throwable thO2 = dVar.o();
        if (thO2 == null) {
            return Boolean.FALSE;
        }
        int i12 = th.s.f17229a;
        throw thO2;
    }

    public final Object c() throws Throwable {
        Object obj = this.f13929i;
        lc.n nVar = f.f13962p;
        if (obj == nVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f13929i = nVar;
        if (obj != f.f13958l) {
            return obj;
        }
        Throwable thR = this.f13931s.r();
        int i10 = th.s.f17229a;
        throw thR;
    }
}
