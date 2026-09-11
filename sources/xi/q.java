package xi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19854i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d.j f19855r;

    public /* synthetic */ q(d.j jVar, int i10) {
        this.f19854i = i10;
        this.f19855r = jVar;
    }

    @Override // eh.a
    public final Object invoke() throws Exception {
        switch (this.f19854i) {
            case 0:
                this.f19855r.a("*/*");
                break;
            default:
                f.l lVar = new f.l();
                lVar.f5607a = g.d.f6797a;
                this.f19855r.a(lVar);
                break;
        }
        return qg.o.f13926a;
    }
}
