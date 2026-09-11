package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements v0, g1.k0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f1 f17443r = new f1(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17444i;

    public /* synthetic */ f1(int i10) {
        this.f17444i = i10;
    }

    @Override // g1.k0
    public g1.f0 b(long j, q2.l lVar, q2.b bVar) {
        switch (this.f17444i) {
            case 1:
                float fE0 = bVar.e0(y.f17540a);
                return new g1.c0(new f1.d(0.0f, -fE0, f1.f.d(j), f1.f.b(j) + fE0));
            default:
                float fE02 = bVar.e0(y.f17540a);
                return new g1.c0(new f1.d(-fE02, 0.0f, f1.f.d(j) + fE02, f1.f.b(j)));
        }
    }

    @Override // u.v0
    public void g(v1.e0 e0Var) {
        e0Var.b();
    }
}
