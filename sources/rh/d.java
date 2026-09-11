package rh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends sh.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14697v = AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed");
    private volatile int consumed;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qh.t f14698t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14699u;

    public /* synthetic */ d(qh.t tVar, boolean z3) {
        this(tVar, z3, ug.i.f17989i, -3, 1);
    }

    @Override // sh.e
    public final String c() {
        return "channel=" + this.f14698t;
    }

    @Override // sh.e, rh.h
    public final Object collect(i iVar, ug.c cVar) throws Throwable {
        if (this.f15802r == -3) {
            boolean z3 = this.f14699u;
            if (z3 && f14697v.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objL = w0.l(iVar, this.f14698t, z3, cVar);
            if (objL == vg.a.f18663i) {
                return objL;
            }
        } else {
            Object objCollect = super.collect(iVar, cVar);
            if (objCollect == vg.a.f18663i) {
                return objCollect;
            }
        }
        return qg.o.f13926a;
    }

    @Override // sh.e
    public final Object e(qh.r rVar, ug.c cVar) throws Throwable {
        Object objL = w0.l(new sh.y(rVar), this.f14698t, this.f14699u, cVar);
        return objL == vg.a.f18663i ? objL : qg.o.f13926a;
    }

    @Override // sh.e
    public final sh.e f(ug.h hVar, int i10, int i11) {
        return new d(this.f14698t, this.f14699u, hVar, i10, i11);
    }

    @Override // sh.e
    public final h g() {
        return new d(this.f14698t, this.f14699u);
    }

    @Override // sh.e
    public final qh.t h(oh.w wVar) {
        if (!this.f14699u || f14697v.getAndSet(this, 1) == 0) {
            return this.f15802r == -3 ? this.f14698t : super.h(wVar);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public d(qh.t tVar, boolean z3, ug.h hVar, int i10, int i11) {
        super(hVar, i10, i11);
        this.f14698t = tVar;
        this.f14699u = z3;
        this.consumed = 0;
    }
}
