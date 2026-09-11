package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16106i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f1 f16107r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(f1 f1Var, int i10) {
        super(1);
        this.f16106i = i10;
        this.f16107r = f1Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f16106i) {
            case 0:
                return new g1(this.f16107r, 0);
            default:
                return new g1(this.f16107r, 1);
        }
    }
}
