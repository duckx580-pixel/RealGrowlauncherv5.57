package s3;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f15102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15103c;

    public r1(Interpolator interpolator, long j) {
        this.f15102b = interpolator;
        this.f15103c = j;
    }

    public long a() {
        return this.f15103c;
    }

    public float b() {
        Interpolator interpolator = this.f15102b;
        return interpolator != null ? interpolator.getInterpolation(this.f15101a) : this.f15101a;
    }

    public void c(float f9) {
        this.f15101a = f9;
    }
}
