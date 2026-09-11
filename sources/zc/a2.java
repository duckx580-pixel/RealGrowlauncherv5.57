package zc;

/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.h f20705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile l2 f20706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile l2 f20708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile l2 f20709e;

    public final void a(int i10) {
        int i11;
        synchronized (this) {
            l2 l2Var = this.f20706b;
            if (l2Var != null && (i11 = this.f20707c) < i10) {
                int i12 = i10 | i11;
                this.f20707c = i12;
                l2Var.f20976b.put("state", Integer.valueOf(i12));
                l2Var.b();
                l2Var.d();
            }
        }
    }

    public final void b() {
        a(16);
        l2 l2Var = this.f20708d;
        if (l2Var != null) {
            this.f20708d = null;
            l2Var.b();
            l2Var.d();
        }
    }
}
