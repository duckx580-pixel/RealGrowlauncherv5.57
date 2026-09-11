package n9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f12250h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f12255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12256g;

    public q(float f9, float f10, float f11, float f12) {
        this.f12251b = f9;
        this.f12252c = f10;
        this.f12253d = f11;
        this.f12254e = f12;
    }

    @Override // n9.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12259a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f9 = this.f12253d;
        float f10 = this.f12254e;
        RectF rectF = f12250h;
        rectF.set(this.f12251b, this.f12252c, f9, f10);
        path.arcTo(rectF, this.f12255f, this.f12256g, false);
        path.transform(matrix);
    }
}
