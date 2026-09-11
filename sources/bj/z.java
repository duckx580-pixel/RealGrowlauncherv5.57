package bj;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f3245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f3246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3247c;

    public z(byte[] bArr, s sVar, int i10) {
        this.f3245a = bArr;
        this.f3246b = sVar;
        this.f3247c = i10;
    }

    @Override // bj.a0
    public final long a() {
        return this.f3247c;
    }

    @Override // bj.a0
    public final s b() {
        return this.f3246b;
    }

    @Override // bj.a0
    public final void c(oj.h hVar) {
        hVar.A(this.f3247c, this.f3245a);
    }
}
