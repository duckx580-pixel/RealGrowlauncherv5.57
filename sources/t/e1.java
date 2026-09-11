package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16068i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f1 f16069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16071t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(f1 f1Var, Object obj, int i10, int i11) {
        super(2);
        this.f16068i = i11;
        this.f16069r = f1Var;
        this.f16070s = obj;
        this.f16071t = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16068i;
        o0.o oVar = (o0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                this.f16069r.a(this.f16070s, oVar, o0.p.S(this.f16071t | 1));
                break;
            default:
                this.f16069r.h(this.f16070s, oVar, o0.p.S(this.f16071t | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
