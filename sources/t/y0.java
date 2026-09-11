package t;

import o0.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements d2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c1 f16222i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public eh.c f16223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.m f16224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z0 f16225t;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(z0 z0Var, c1 c1Var, eh.c cVar, eh.c cVar2) {
        this.f16225t = z0Var;
        this.f16222i = c1Var;
        this.f16223r = cVar;
        this.f16224s = (kotlin.jvm.internal.m) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [eh.c, kotlin.jvm.internal.m] */
    public final void b(a1 a1Var) {
        Object objInvoke = this.f16224s.invoke(a1Var.c());
        boolean zD = this.f16225t.f16228c.d();
        c1 c1Var = this.f16222i;
        if (zD) {
            c1Var.f(this.f16224s.invoke(a1Var.a()), objInvoke, (y) this.f16223r.invoke(a1Var));
        } else {
            c1Var.g(objInvoke, (y) this.f16223r.invoke(a1Var));
        }
    }

    @Override // o0.d2
    public final Object getValue() {
        b(this.f16225t.f16228c.c());
        return this.f16222i.f16042x.getValue();
    }
}
