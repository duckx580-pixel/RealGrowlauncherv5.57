package n9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12249d;

    public p(r rVar, float f9, float f10) {
        this.f12247b = rVar;
        this.f12248c = f9;
        this.f12249d = f10;
    }

    @Override // n9.t
    public final void a(Matrix matrix, m9.a aVar, int i10, Canvas canvas) {
        r rVar = this.f12247b;
        float f9 = rVar.f12258c;
        float f10 = this.f12249d;
        float f11 = rVar.f12257b;
        float f12 = this.f12248c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f9 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int i11 = aVar.f11638f;
        int[] iArr = m9.a.f11630i;
        iArr[0] = i11;
        iArr[1] = aVar.f11637e;
        iArr[2] = aVar.f11636d;
        Paint paint = aVar.f11635c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, m9.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f12247b;
        return (float) Math.toDegrees(Math.atan((rVar.f12258c - this.f12249d) / (rVar.f12257b - this.f12248c)));
    }
}
