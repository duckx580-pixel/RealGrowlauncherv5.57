package u2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17562i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f17563r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(q qVar, int i10) {
        super(1);
        this.f17562i = i10;
        this.f17563r = qVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f17562i) {
            case 0:
                q qVar = this.f17563r;
                qVar.show();
                return new b0.p(5, qVar);
            default:
                q qVar2 = this.f17563r;
                if (qVar2.f17601u.f17594a) {
                    qVar2.f17600t.invoke();
                }
                return qg.o.f13926a;
        }
    }
}
