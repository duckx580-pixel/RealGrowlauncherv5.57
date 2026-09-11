package s3;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r1 f15107a;

    public s1(int i10, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f15107a = new q1(o1.b(i10, interpolator, j));
        } else {
            this.f15107a = new n1(interpolator, j);
        }
    }
}
