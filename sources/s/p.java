package s;

import t.f1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1 f14973i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f14974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f14975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f14976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w0.a f14977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f14978v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(f1 f1Var, eh.c cVar, e0 e0Var, f0 f0Var, w0.a aVar, int i10) {
        super(2);
        this.f14973i = f1Var;
        this.f14974r = (kotlin.jvm.internal.m) cVar;
        this.f14975s = e0Var;
        this.f14976t = f0Var;
        this.f14977u = aVar;
        this.f14978v = i10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.animation.a.e(this.f14973i, this.f14974r, this.f14975s, this.f14976t, this.f14977u, (o0.o) obj, o0.p.S(this.f14978v | 1));
        return qg.o.f13926a;
    }
}
