package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12878u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f12879v;

    public /* synthetic */ i0(int i10, Object obj) {
        this.f12878u = i10;
        this.f12879v = obj;
    }

    @Override // eh.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f12878u) {
            case 0:
                m((Throwable) obj);
                break;
            case 1:
                m((Throwable) obj);
                break;
            case 2:
                m((Throwable) obj);
                break;
            default:
                m((Throwable) obj);
                break;
        }
        return qg.o.f13926a;
    }

    @Override // oh.a1
    public final void m(Throwable th2) {
        switch (this.f12878u) {
            case 0:
                ((g0) this.f12879v).dispose();
                break;
            case 1:
                ((eh.c) this.f12879v).invoke(th2);
                break;
            case 2:
                b1 b1Var = (b1) this.f12879v;
                Object objM = l().M();
                if (!(objM instanceof n)) {
                    b1Var.resumeWith(x.z(objM));
                } else {
                    b1Var.resumeWith(androidx.work.v.i(((n) objM).f12894a));
                }
                break;
            default:
                ((f) this.f12879v).resumeWith(qg.o.f13926a);
                break;
        }
    }
}
