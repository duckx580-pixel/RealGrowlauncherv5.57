package i0;

import g1.k0;
import m0.k3;
import y.y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7975i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1.n f7976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f7977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f7978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f7979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w0.a f7980v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a1.n nVar, long j, long j10, float f9, y0 y0Var, w0.a aVar, int i10) {
        super(2);
        this.f7976r = nVar;
        this.f7977s = j;
        this.f7978t = j10;
        this.f7979u = f9;
        this.w = y0Var;
        this.f7980v = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7975i) {
            case 0:
                ((Number) obj2).intValue();
                k0 k0Var = (k0) this.w;
                xd.c.d(this.f7976r, k0Var, this.f7977s, this.f7978t, this.f7979u, this.f7980v, (o0.o) obj, o0.p.S(1769857));
                break;
            default:
                ((Number) obj2).intValue();
                y0 y0Var = (y0) this.w;
                k3.a(this.f7976r, this.f7977s, this.f7978t, this.f7979u, y0Var, this.f7980v, (o0.o) obj, o0.p.S(196609));
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a1.n nVar, k0 k0Var, long j, long j10, float f9, w0.a aVar, int i10) {
        super(2);
        this.f7976r = nVar;
        this.w = k0Var;
        this.f7977s = j;
        this.f7978t = j10;
        this.f7979u = f9;
        this.f7980v = aVar;
    }
}
