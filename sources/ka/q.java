package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements va.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f9482a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final va.c f9483b = va.c.a("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final va.c f9484c = va.c.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final va.c f9485d = va.c.a("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final va.c f9486e = va.c.a("orientation");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final va.c f9487f = va.c.a("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final va.c f9488g = va.c.a("diskUsed");

    @Override // va.a
    public final void a(Object obj, Object obj2) {
        va.e eVar = (va.e) obj2;
        o0 o0Var = (o0) ((k1) obj);
        eVar.f(f9483b, o0Var.f9469a);
        eVar.c(f9484c, o0Var.f9470b);
        eVar.a(f9485d, o0Var.f9471c);
        eVar.c(f9486e, o0Var.f9472d);
        eVar.b(f9487f, o0Var.f9473e);
        eVar.b(f9488g, o0Var.f9474f);
    }
}
