package k4;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9251b;

    public b(float[] fArr) {
        this.f9250a = fArr;
        this.f9251b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9250a;
        int iMin = Math.min((int) ((fArr.length - 1) * f9), fArr.length - 2);
        float f10 = this.f9251b;
        float f11 = (f9 - (iMin * f10)) / f10;
        float f12 = fArr[iMin];
        return ((fArr[iMin + 1] - f12) * f11) + f12;
    }
}
