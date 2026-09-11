package th;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17198i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17199r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public c(r rVar) {
        this._prev = rVar;
    }

    public final void a() {
        f17199r.lazySet(this, null);
    }

    public final c b() {
        Object obj = f17198i.get(this);
        if (obj == a.f17192b) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean c();

    public final void d() {
        c cVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17199r;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.c()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c cVarB2 = b();
            kotlin.jvm.internal.l.c(cVarB2);
            while (cVarB2.c() && (cVarB = cVarB2.b()) != null) {
                cVarB2 = cVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cVarB2);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVarB2, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(cVarB2) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f17198i.set(cVar, cVarB2);
            }
            if (!cVarB2.c() || cVarB2.b() == null) {
                if (cVar == null || !cVar.c()) {
                    return;
                }
            }
        }
    }
}
