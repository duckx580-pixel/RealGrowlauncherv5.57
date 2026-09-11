package fi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6598i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ li.m f6599r;

    public /* synthetic */ u(li.m mVar) {
        this.f6599r = mVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        Integer num = (Integer) obj2;
        switch (this.f6598i) {
            case 0:
                if ((num.intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    pi.c.g(this.f6599r, null, oVar, 0, 2);
                }
                break;
            default:
                num.getClass();
                pi.c.i(this.f6599r, oVar, o0.p.S(1));
                break;
        }
        return qg.o.f13926a;
    }
}
