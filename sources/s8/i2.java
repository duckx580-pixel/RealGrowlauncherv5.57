package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15423i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f15424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k2 f15425s;

    public /* synthetic */ i2(k2 k2Var, b0 b0Var, int i10) {
        this.f15423i = i10;
        this.f15425s = k2Var;
        this.f15424r = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15423i) {
            case 0:
                synchronized (this.f15425s) {
                    try {
                        this.f15425s.f15457i = false;
                        if (!this.f15425s.f15459s.z()) {
                            i0 i0Var = ((y0) this.f15425s.f15459s.f3470r).f15665y;
                            y0.k(i0Var);
                            i0Var.E.b("Connected to service");
                            l2 l2Var = this.f15425s.f15459s;
                            b0 b0Var = this.f15424r;
                            l2Var.t();
                            l2Var.f15468u = b0Var;
                            l2Var.E();
                            l2Var.D();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f15425s) {
                    try {
                        this.f15425s.f15457i = false;
                        if (!this.f15425s.f15459s.z()) {
                            i0 i0Var2 = ((y0) this.f15425s.f15459s.f3470r).f15665y;
                            y0.k(i0Var2);
                            i0Var2.D.b("Connected to remote service");
                            l2 l2Var2 = this.f15425s.f15459s;
                            b0 b0Var2 = this.f15424r;
                            l2Var2.t();
                            l2Var2.f15468u = b0Var2;
                            l2Var2.E();
                            l2Var2.D();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }
}
