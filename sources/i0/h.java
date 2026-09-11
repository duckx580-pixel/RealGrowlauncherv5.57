package i0;

import g1.k0;
import m0.n6;
import m0.r6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7946i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f7947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7948s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7949t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7950u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7951v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(eh.a aVar, a1.n nVar, boolean z3, x.l lVar, w0.a aVar2, int i10) {
        super(2);
        this.f7949t = aVar;
        this.f7950u = nVar;
        this.f7947r = z3;
        this.f7951v = lVar;
        this.w = aVar2;
        this.f7948s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7946i) {
            case 0:
                ((Number) obj2).intValue();
                eh.a aVar = (eh.a) this.f7949t;
                a1.n nVar = (a1.n) this.f7950u;
                x.l lVar = (x.l) this.f7951v;
                w0.a aVar2 = (w0.a) this.w;
                i.a(aVar, nVar, this.f7947r, lVar, aVar2, (o0.o) obj, o0.p.S(this.f7948s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                r6 r6Var = (r6) this.f7949t;
                x.k kVar = (x.k) this.f7950u;
                n6 n6Var = (n6) this.f7951v;
                k0 k0Var = (k0) this.w;
                r6Var.a(this.f7947r, kVar, n6Var, k0Var, (o0.o) obj, o0.p.S(this.f7948s | 1));
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r6 r6Var, boolean z3, x.k kVar, n6 n6Var, k0 k0Var, int i10) {
        super(2);
        this.f7949t = r6Var;
        this.f7947r = z3;
        this.f7950u = kVar;
        this.f7951v = n6Var;
        this.w = k0Var;
        this.f7948s = i10;
    }
}
