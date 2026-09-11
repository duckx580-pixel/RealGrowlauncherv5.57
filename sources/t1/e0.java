package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16284b;

    public /* synthetic */ e0(int i10, Object obj) {
        this.f16283a = i10;
        this.f16284b = obj;
    }

    @Override // t1.p0
    public final q2.l a() {
        switch (this.f16283a) {
            case 0:
                return ((v1.k0) this.f16284b).getLayoutDirection();
            default:
                return ((w1.t) this.f16284b).getLayoutDirection();
        }
    }

    @Override // t1.p0
    public final int b() {
        switch (this.f16283a) {
            case 0:
                return ((v1.k0) this.f16284b).a0();
            default:
                return ((w1.t) this.f16284b).getRoot().N.f18434o.f16308i;
        }
    }
}
