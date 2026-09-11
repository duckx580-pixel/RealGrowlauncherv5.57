package th;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oh.e0;
import oh.p0;
import oh.p1;
import oh.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e0 implements wg.d, ug.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17203x = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oh.s f17204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final wg.c f17205u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f17206v;
    public final Object w;

    public g(oh.s sVar, wg.c cVar) {
        super(-1);
        this.f17204t = sVar;
        this.f17205u = cVar;
        this.f17206v = a.f17193c;
        this.w = a.l(cVar.getContext());
    }

    @Override // oh.e0
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof oh.o) {
            throw null;
        }
    }

    @Override // wg.d
    public final wg.d getCallerFrame() {
        wg.c cVar = this.f17205u;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // ug.c
    public final ug.h getContext() {
        return this.f17205u.getContext();
    }

    @Override // oh.e0
    public final Object h() {
        Object obj = this.f17206v;
        this.f17206v = a.f17193c;
        return obj;
    }

    @Override // ug.c
    public final void resumeWith(Object obj) {
        wg.c cVar = this.f17205u;
        ug.h context = cVar.getContext();
        Throwable thA = qg.i.a(obj);
        Object nVar = thA == null ? obj : new oh.n(thA, false);
        oh.s sVar = this.f17204t;
        if (sVar.K()) {
            this.f17206v = nVar;
            this.f12860s = 0;
            sVar.C(context, this);
            return;
        }
        p0 p0VarA = p1.a();
        if (p0VarA.f12902s >= 4294967296L) {
            this.f17206v = nVar;
            this.f12860s = 0;
            p0VarA.d0(this);
            return;
        }
        p0VarA.f0(true);
        try {
            ug.h context2 = cVar.getContext();
            Object objM = a.m(context2, this.w);
            try {
                cVar.resumeWith(obj);
                while (p0VarA.h0()) {
                }
            } finally {
                a.g(context2, objM);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f17204t + ", " + x.y(this.f17205u) + ']';
    }

    @Override // oh.e0
    public final ug.c d() {
        return this;
    }
}
