package p2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13280i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f13281r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(0);
        this.f13280i = i10;
        this.f13281r = oVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f13280i) {
            case 0:
                return Float.valueOf(this.f13281r.c());
            default:
                return this.f13281r;
        }
    }
}
