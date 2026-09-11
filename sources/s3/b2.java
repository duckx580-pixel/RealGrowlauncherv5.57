package s3;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class b2 extends a2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k3.c f15044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k3.c f15045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k3.c f15046p;

    public b2(f2 f2Var, WindowInsets windowInsets) {
        super(f2Var, windowInsets);
        this.f15044n = null;
        this.f15045o = null;
        this.f15046p = null;
    }

    @Override // s3.d2
    public k3.c h() {
        if (this.f15045o == null) {
            this.f15045o = k3.c.c(this.f15135c.getMandatorySystemGestureInsets());
        }
        return this.f15045o;
    }

    @Override // s3.d2
    public k3.c j() {
        if (this.f15044n == null) {
            this.f15044n = k3.c.c(this.f15135c.getSystemGestureInsets());
        }
        return this.f15044n;
    }

    @Override // s3.d2
    public k3.c l() {
        if (this.f15046p == null) {
            this.f15046p = k3.c.c(this.f15135c.getTappableElementInsets());
        }
        return this.f15046p;
    }

    @Override // s3.y1, s3.d2
    public f2 m(int i10, int i11, int i12, int i13) {
        return f2.g(null, this.f15135c.inset(i10, i11, i12, i13));
    }

    @Override // s3.z1, s3.d2
    public void s(k3.c cVar) {
    }
}
