package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements va.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f9428a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final va.c f9429b = va.c.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final va.c f9430c = va.c.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final va.c f9431d = va.c.a("name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final va.c f9432e = va.c.a("uuid");

    @Override // va.a
    public final void a(Object obj, Object obj2) {
        va.e eVar = (va.e) obj2;
        j0 j0Var = (j0) ((d1) obj);
        eVar.b(f9429b, j0Var.f9424a);
        eVar.b(f9430c, j0Var.f9425b);
        eVar.f(f9431d, j0Var.f9426c);
        String str = j0Var.f9427d;
        eVar.f(f9432e, str != null ? str.getBytes(q1.f9493a) : null);
    }
}
