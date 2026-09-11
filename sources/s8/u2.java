package s8;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends p0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.f0 f15610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u5.l f15611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t2 f15612v;
    public final u5.e w;

    public u2(y0 y0Var) {
        super(y0Var);
        this.f15611u = new u5.l(this);
        this.f15612v = new t2(this);
        this.w = new u5.e(this);
    }

    @Override // s8.p0
    public final boolean w() {
        return false;
    }

    public final void x() {
        t();
        if (this.f15610t == null) {
            this.f15610t = new com.google.android.gms.internal.measurement.f0(Looper.getMainLooper(), 0);
        }
    }
}
