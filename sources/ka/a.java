package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements va.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9311a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final va.c f9312b = va.c.a("pid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final va.c f9313c = va.c.a("processName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final va.c f9314d = va.c.a("reasonCode");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final va.c f9315e = va.c.a("importance");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final va.c f9316f = va.c.a("pss");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final va.c f9317g = va.c.a("rss");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final va.c f9318h = va.c.a("timestamp");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final va.c f9319i = va.c.a("traceFile");

    @Override // va.a
    public final void a(Object obj, Object obj2) {
        va.e eVar = (va.e) obj2;
        x xVar = (x) ((w0) obj);
        eVar.c(f9312b, xVar.f9544a);
        eVar.f(f9313c, xVar.f9545b);
        eVar.c(f9314d, xVar.f9546c);
        eVar.c(f9315e, xVar.f9547d);
        eVar.b(f9316f, xVar.f9548e);
        eVar.b(f9317g, xVar.f9549f);
        eVar.b(f9318h, xVar.f9550g);
        eVar.f(f9319i, xVar.f9551h);
    }
}
