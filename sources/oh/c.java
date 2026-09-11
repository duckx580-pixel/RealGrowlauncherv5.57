package oh;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Thread f12849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p0 f12850u;

    public c(ug.h hVar, Thread thread, p0 p0Var) {
        super(hVar, true);
        this.f12849t = thread;
        this.f12850u = p0Var;
    }

    @Override // oh.f1
    public final void s(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f12849t;
        if (kotlin.jvm.internal.l.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
