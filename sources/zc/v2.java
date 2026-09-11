package zc;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21197i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w2 f21198r;

    public /* synthetic */ v2(w2 w2Var, int i10) {
        this.f21197i = i10;
        this.f21198r = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21197i) {
            case 0:
                w2.f(this.f21198r);
                break;
            default:
                w2.f(this.f21198r);
                break;
        }
    }
}
