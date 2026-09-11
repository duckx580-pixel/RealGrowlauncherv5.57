package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f17488i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kh.a f17489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17490s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(float f9, kh.a aVar, int i10) {
        super(1);
        this.f17488i = f9;
        this.f17489r = aVar;
        this.f17490s = i10;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        Float fValueOf = Float.valueOf(this.f17488i);
        kh.a aVar = this.f17489r;
        b2.f fVar = new b2.f(((Number) gh.a.g(fValueOf, aVar)).floatValue(), aVar, this.f17490s);
        lh.j[] jVarArr = b2.t.f2617a;
        b2.u uVar = b2.r.f2594c;
        lh.j jVar = b2.t.f2617a[1];
        uVar.a((b2.j) obj, fVar);
        return qg.o.f13926a;
    }
}
