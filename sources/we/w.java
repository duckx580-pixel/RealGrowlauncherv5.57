package we;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.google.protobuf.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pf.c f19195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pf.c f19196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19197e;

    public w(uf.c cVar, int i10) {
        super(cVar);
        pf.l lVarM = cVar.getText().m();
        this.f19195c = lVarM.f13407c.a();
        this.f19196d = lVarM.f13408d.a();
        this.f19197e = i10;
    }

    public final boolean B() {
        return this.f19195c.f13383a != this.f19196d.f13383a;
    }
}
