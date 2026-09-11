package vh;

import java.util.concurrent.Executor;
import oh.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends q0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f18694s;

    @Override // oh.s
    public final void C(ug.h hVar, Runnable runnable) {
        b.e(this.f18694s, runnable, 6);
    }

    @Override // oh.s
    public final void F(ug.h hVar, Runnable runnable) {
        b.e(this.f18694s, runnable, 2);
    }

    @Override // oh.q0
    public final Executor c0() {
        return this.f18694s;
    }
}
