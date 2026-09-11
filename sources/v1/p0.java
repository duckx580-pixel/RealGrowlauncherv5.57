package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1.m f18462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0.f f18464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0.f f18465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ka.v f18467f;

    public p0(ka.v vVar, a1.m mVar, int i10, q0.f fVar, q0.f fVar2, boolean z3) {
        this.f18467f = vVar;
        this.f18462a = mVar;
        this.f18463b = i10;
        this.f18464c = fVar;
        this.f18465d = fVar2;
        this.f18466e = z3;
    }

    public final boolean a(int i10, int i11) {
        q0.f fVar = this.f18464c;
        int i12 = this.f18463b;
        return androidx.compose.ui.node.b.a((a1.l) fVar.f13644i[i10 + i12], (a1.l) this.f18465d.f13644i[i12 + i11]) != 0;
    }
}
