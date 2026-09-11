package z;

import b0.y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f20502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f20504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f20505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1.b f20508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.c f20509i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f20511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f20512m;

    public j(long j, boolean z3, h hVar, y yVar, int i10, int i11, a1.b bVar, a1.c cVar, int i12, int i13, long j10, q qVar) {
        this.f20504d = z3;
        this.f20505e = yVar;
        this.f20506f = i10;
        this.f20507g = i11;
        this.f20508h = bVar;
        this.f20509i = cVar;
        this.j = i12;
        this.f20510k = i13;
        this.f20511l = j10;
        this.f20512m = qVar;
        this.f20501a = hVar;
        this.f20502b = yVar;
        this.f20503c = rk.a.G(z3 ? q2.a.h(j) : Integer.MAX_VALUE, z3 ? Integer.MAX_VALUE : q2.a.g(j), 5);
    }

    public final m a(int i10) {
        h hVar = this.f20501a;
        Object objC = hVar.c(i10);
        Object objP = hVar.f20489b.p(i10);
        return new m(i10, this.f20502b.b(this.f20503c, i10), this.f20504d, this.f20508h, this.f20509i, this.f20505e.f2521r.getLayoutDirection(), this.j, this.f20510k, i10 == this.f20506f + (-1) ? 0 : this.f20507g, this.f20511l, objC, objP, this.f20512m.f20569p);
    }
}
