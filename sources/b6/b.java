package b6;

import java.io.IOException;
import oj.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends oj.n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2714r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2715s;

    public /* synthetic */ b(f0 f0Var) {
        super(f0Var);
    }

    @Override // oj.n, oj.f0
    public final long q(oj.g gVar, long j) throws Exception {
        switch (this.f2714r) {
            case 0:
                try {
                    return super.q(gVar, j);
                } catch (Exception e8) {
                    this.f2715s = e8;
                    throw e8;
                }
            default:
                try {
                    return super.q(gVar, j);
                } catch (IOException e10) {
                    ((ll.q) this.f2715s).f10190t = e10;
                    throw e10;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ll.q qVar, oj.i iVar) {
        super(iVar);
        this.f2715s = qVar;
    }
}
