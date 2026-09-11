package ya;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements va.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20237a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20238b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public va.c f20239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f20240d;

    public g(e eVar) {
        this.f20240d = eVar;
    }

    @Override // va.g
    public final va.g d(String str) {
        if (this.f20237a) {
            throw new va.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20237a = true;
        this.f20240d.e(this.f20239c, str, this.f20238b);
        return this;
    }

    @Override // va.g
    public final va.g e(boolean z3) {
        if (this.f20237a) {
            throw new va.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20237a = true;
        this.f20240d.d(this.f20239c, z3 ? 1 : 0, this.f20238b);
        return this;
    }
}
