package oh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends y0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12926v = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final eh.c f12927u;

    public v0(eh.c cVar) {
        this.f12927u = cVar;
    }

    @Override // eh.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return qg.o.f13926a;
    }

    @Override // oh.a1
    public final void m(Throwable th2) {
        if (f12926v.compareAndSet(this, 0, 1)) {
            this.f12927u.invoke(th2);
        }
    }
}
