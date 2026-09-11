package g1;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f6888a;

    public j(PathMeasure pathMeasure) {
        this.f6888a = pathMeasure;
    }

    public final void a(float f9, float f10, e0 e0Var) {
        if (!(e0Var instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f6888a.getSegment(f9, f10, ((i) e0Var).f6883a, true);
    }
}
