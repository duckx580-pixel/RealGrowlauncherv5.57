package o4;

import kotlin.jvm.internal.l;
import oh.t;
import oh.w;
import oh.w0;
import ug.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f12659i;

    public a(h hVar) {
        l.f("coroutineContext", hVar);
        this.f12659i = hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        w0 w0Var = (w0) this.f12659i.i(t.f12918r);
        if (w0Var != null) {
            w0Var.c(null);
        }
    }

    @Override // oh.w
    public final h h() {
        return this.f12659i;
    }
}
