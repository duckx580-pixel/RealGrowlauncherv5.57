package xe;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f19664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f19665f;

    public final void a() {
        if (this.f19660a) {
            return;
        }
        if (!this.f19665f.a(this.f19661b, this.f19662c)) {
            this.f19664e.f19645c = 0.0f;
        }
        this.f19660a = true;
        this.f19663d = false;
    }

    public final void b(float f9, float f10) {
        if (this.f19660a) {
            if (!this.f19663d || Math.abs(f9 - 0.0f) > 1.0E-6f) {
                this.f19661b = f9;
            } else {
                this.f19661b = 0.0f;
            }
            this.f19662c = f10;
            this.f19660a = false;
            this.f19663d = false;
            return;
        }
        if (!this.f19663d && Math.abs(f9 - this.f19662c) <= 1.0E-6f) {
            this.f19662c = f10;
            return;
        }
        if (this.f19663d && Math.abs(f9 - 0.0f) <= 1.0E-6f) {
            this.f19662c = f10;
            this.f19663d = false;
        } else {
            a();
            this.f19660a = false;
            this.f19661b = f9;
            this.f19662c = f10;
        }
    }
}
