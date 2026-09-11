package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17391i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f17392r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i10) {
        super(1);
        this.f17391i = i10;
        this.f17392r = b0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f17391i) {
            case 0:
                long j = ((f1.c) obj).f5977a;
                eh.a aVar = this.f17392r.L;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                long j10 = ((f1.c) obj).f5977a;
                b0 b0Var = this.f17392r;
                if (b0Var.F) {
                    b0Var.H.invoke();
                }
                break;
        }
        return qg.o.f13926a;
    }
}
