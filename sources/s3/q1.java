package s3;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f15098d;

    public q1(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f15098d = windowInsetsAnimation;
    }

    public static k3.c d(WindowInsetsAnimation.Bounds bounds) {
        return k3.c.c(bounds.getUpperBound());
    }

    public static k3.c e(WindowInsetsAnimation.Bounds bounds) {
        return k3.c.c(bounds.getLowerBound());
    }

    public static void f(View view, y.z zVar) {
        view.setWindowInsetsAnimationCallback(zVar != null ? new p1(zVar) : null);
    }

    @Override // s3.r1
    public final long a() {
        return this.f15098d.getDurationMillis();
    }

    @Override // s3.r1
    public final float b() {
        return this.f15098d.getInterpolatedFraction();
    }

    @Override // s3.r1
    public final void c(float f9) {
        this.f15098d.setFraction(f9);
    }
}
