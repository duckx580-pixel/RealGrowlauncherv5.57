package d;

import kotlin.jvm.internal.l;
import o0.s0;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4798a;

    public j(a aVar, s0 s0Var) {
        l.f("launcher", aVar);
        this.f4798a = aVar;
    }

    @Override // f.d
    public final void a(Object obj) throws Exception {
        o oVar;
        f.f fVar = this.f4798a.f4776a;
        if (fVar != null) {
            fVar.a(obj);
            oVar = o.f13926a;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
