package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l5 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10923i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o5 f10924r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(o5 o5Var, int i10) {
        super(0);
        this.f10923i = i10;
        this.f10924r = o5Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f10923i) {
            case 0:
                oh.f fVar = this.f10924r.f11089b;
                if (fVar.x()) {
                    fVar.resumeWith(z5.f11540i);
                }
                return Boolean.TRUE;
            default:
                oh.f fVar2 = this.f10924r.f11089b;
                if (fVar2.x()) {
                    fVar2.resumeWith(z5.f11541r);
                }
                return qg.o.f13926a;
        }
    }
}
