package t2;

import o0.o;
import o0.p;
import u2.v;
import u2.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16397i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qg.a f16401u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16402v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(eh.c cVar, a1.n nVar, eh.c cVar2, eh.c cVar3, int i10, int i11) {
        super(2);
        this.f16400t = cVar;
        this.w = nVar;
        this.f16401u = cVar2;
        this.f16402v = cVar3;
        this.f16398r = i10;
        this.f16399s = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16397i) {
            case 0:
                ((Number) obj2).intValue();
                j.a((eh.c) this.f16400t, (a1.n) this.w, (eh.c) this.f16401u, (eh.c) this.f16402v, (o) obj, p.S(this.f16398r | 1), this.f16399s);
                break;
            default:
                ((Number) obj2).intValue();
                u2.i.a((v) this.f16400t, (eh.a) this.f16401u, (w) this.f16402v, (w0.a) this.w, (o) obj, p.S(this.f16398r | 1), this.f16399s);
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, eh.a aVar, w wVar, w0.a aVar2, int i10, int i11) {
        super(2);
        this.f16400t = vVar;
        this.f16401u = aVar;
        this.f16402v = wVar;
        this.w = aVar2;
        this.f16398r = i10;
        this.f16399s = i11;
    }
}
