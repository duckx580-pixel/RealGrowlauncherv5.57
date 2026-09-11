package ti;

import g1.a0;
import v1.e0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17249i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f17250r;

    public /* synthetic */ c(a0 a0Var, int i10) {
        this.f17249i = i10;
        this.f17250r = a0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f17249i) {
            case 0:
                d1.c cVar = (d1.c) obj;
                kotlin.jvm.internal.l.f("$this$drawWithCache", cVar);
                return cVar.b(new c(this.f17250r, 1));
            default:
                e0 e0Var = (e0) obj;
                kotlin.jvm.internal.l.f("$this$onDrawWithContent", e0Var);
                e0Var.b();
                i1.d.y(e0Var, this.f17250r, 0L, 0L, 0.0f, null, 62);
                return qg.o.f13926a;
        }
    }
}
