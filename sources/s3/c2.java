package s3;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends b2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f2 f15052q = f2.g(null, WindowInsets.CONSUMED);

    public c2(f2 f2Var, WindowInsets windowInsets) {
        super(f2Var, windowInsets);
    }

    @Override // s3.y1, s3.d2
    public k3.c f(int i10) {
        return k3.c.c(this.f15135c.getInsets(e2.a(i10)));
    }

    @Override // s3.y1, s3.d2
    public k3.c g(int i10) {
        return k3.c.c(this.f15135c.getInsetsIgnoringVisibility(e2.a(i10)));
    }

    @Override // s3.y1, s3.d2
    public boolean p(int i10) {
        return this.f15135c.isVisible(e2.a(i10));
    }

    @Override // s3.y1, s3.d2
    public final void d(View view) {
    }
}
