package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements l1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1 f16159i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f16161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f16162t;

    public p1(n1 n1Var, int i10, long j) {
        this.f16159i = n1Var;
        this.f16160r = i10;
        this.f16161s = ((long) (n1Var.x() + n1Var.w())) * 1000000;
        this.f16162t = j * 1000000;
    }

    @Override // t.l1
    public final boolean a() {
        return true;
    }

    @Override // t.l1
    public final long b(o oVar, o oVar2, o oVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j10 = j + this.f16162t;
        if (j10 <= 0) {
            return 0L;
        }
        long j11 = this.f16161s;
        long j12 = j10 / j11;
        return (this.f16160r == 1 || j12 % ((long) 2) == 0) ? j10 - (j12 * j11) : ((j12 + 1) * j11) - j10;
    }

    @Override // t.l1
    public final o d(long j, o oVar, o oVar2, o oVar3) {
        return this.f16159i.d(c(j), oVar, oVar2, e(j, oVar, oVar3, oVar2));
    }

    public final o e(long j, o oVar, o oVar2, o oVar3) {
        long j10 = this.f16162t;
        long j11 = j + j10;
        long j12 = this.f16161s;
        return j11 > j12 ? this.f16159i.r(j12 - j10, oVar, oVar3, oVar2) : oVar2;
    }

    @Override // t.l1
    public final o r(long j, o oVar, o oVar2, o oVar3) {
        return this.f16159i.r(c(j), oVar, oVar2, e(j, oVar, oVar3, oVar2));
    }
}
