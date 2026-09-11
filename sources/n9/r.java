package n9;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12258c;

    @Override // n9.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12259a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f12257b, this.f12258c);
        path.transform(matrix);
    }
}
