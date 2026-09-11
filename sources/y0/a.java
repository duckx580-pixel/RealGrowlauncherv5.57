package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20029i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f20030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.c f20031s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(eh.c cVar, eh.c cVar2, int i10) {
        super(1);
        this.f20029i = i10;
        this.f20030r = cVar;
        this.f20031s = cVar2;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f20029i) {
            case 0:
                k kVar = (k) obj;
                synchronized (m.f20078b) {
                    i10 = m.f20080d;
                    m.f20080d = i10 + 1;
                }
                return new c(i10, kVar, this.f20030r, this.f20031s);
            case 1:
                this.f20030r.invoke(obj);
                this.f20031s.invoke(obj);
                return qg.o.f13926a;
            case 2:
                this.f20030r.invoke(obj);
                this.f20031s.invoke(obj);
                return qg.o.f13926a;
            default:
                this.f20030r.invoke(obj);
                this.f20031s.invoke(obj);
                return qg.o.f13926a;
        }
    }
}
