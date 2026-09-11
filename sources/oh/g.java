package oh;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12873c = AtomicIntegerFieldUpdater.newUpdater(g.class, "_resumed");
    private volatile int _resumed;

    public g(f fVar, Throwable th2, boolean z3) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + fVar + " was cancelled normally");
        }
        super(th2, z3);
        this._resumed = 0;
    }
}
