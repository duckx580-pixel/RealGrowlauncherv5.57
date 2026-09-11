package ll;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends bj.f0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bj.s f10193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10194s;

    public r(bj.s sVar, long j) {
        this.f10193r = sVar;
        this.f10194s = j;
    }

    @Override // bj.f0
    public final long c() {
        return this.f10194s;
    }

    @Override // bj.f0
    public final bj.s e() {
        return this.f10193r;
    }

    @Override // bj.f0
    public final oj.i g() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
