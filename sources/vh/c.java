package vh;

import java.util.concurrent.Executor;
import oh.q0;
import oh.s;
import th.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q0 implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f18690s = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f18691t;

    static {
        k kVar = k.f18706s;
        int i10 = t.f17230a;
        if (64 >= i10) {
            i10 = 64;
        }
        f18691t = kVar.W(th.a.k(i10, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // oh.s
    public final void C(ug.h hVar, Runnable runnable) {
        f18691t.C(hVar, runnable);
    }

    @Override // oh.s
    public final void F(ug.h hVar, Runnable runnable) {
        f18691t.F(hVar, runnable);
    }

    @Override // oh.s
    public final s W(int i10) {
        return k.f18706s.W(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C(ug.i.f17989i, runnable);
    }

    @Override // oh.s
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // oh.q0
    public final Executor c0() {
        return this;
    }
}
