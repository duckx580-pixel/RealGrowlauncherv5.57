package s3;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class z1 extends y1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k3.c f15146m;

    public z1(f2 f2Var, WindowInsets windowInsets) {
        super(f2Var, windowInsets);
        this.f15146m = null;
    }

    @Override // s3.d2
    public f2 b() {
        return f2.g(null, this.f15135c.consumeStableInsets());
    }

    @Override // s3.d2
    public f2 c() {
        return f2.g(null, this.f15135c.consumeSystemWindowInsets());
    }

    @Override // s3.d2
    public final k3.c i() {
        if (this.f15146m == null) {
            WindowInsets windowInsets = this.f15135c;
            this.f15146m = k3.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f15146m;
    }

    @Override // s3.d2
    public boolean n() {
        return this.f15135c.isConsumed();
    }

    @Override // s3.d2
    public void s(k3.c cVar) {
        this.f15146m = cVar;
    }
}
