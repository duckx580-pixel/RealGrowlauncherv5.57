package pf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f13407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f13408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f13409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f13410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f13411g;

    public l(h hVar) {
        this.f13405a = hVar;
        this.f13406b = new a(hVar);
        c cVar = new c();
        cVar.f13385c = 0;
        cVar.f13384b = 0;
        cVar.f13383a = 0;
        this.f13407c = cVar;
        c cVar2 = new c();
        cVar2.f13385c = 0;
        cVar2.f13384b = 0;
        cVar2.f13383a = 0;
        this.f13408d = cVar2;
    }

    public final boolean a() {
        return this.f13407c.f13383a != this.f13408d.f13383a;
    }
}
