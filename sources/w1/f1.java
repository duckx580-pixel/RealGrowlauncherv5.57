package w1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f18804i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a5.f f18805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f18806s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(boolean z3, a5.f fVar, String str) {
        super(0);
        this.f18804i = z3;
        this.f18805r = fVar;
        this.f18806s = str;
    }

    @Override // eh.a
    public final Object invoke() {
        if (this.f18804i) {
            a5.f fVar = this.f18805r;
            fVar.getClass();
            String str = this.f18806s;
            kotlin.jvm.internal.l.f("key", str);
            fVar.f360a.d(str);
        }
        return qg.o.f13926a;
    }
}
