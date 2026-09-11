package n9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f12246b;

    public o(q qVar) {
        this.f12246b = qVar;
    }

    @Override // n9.t
    public final void a(Matrix matrix, m9.a aVar, int i10, Canvas canvas) {
        float f9;
        q qVar = this.f12246b;
        float f10 = qVar.f12255f;
        float f11 = qVar.f12256g;
        RectF rectF = new RectF(qVar.f12251b, qVar.f12252c, qVar.f12253d, qVar.f12254e);
        Paint paint = aVar.f11634b;
        boolean z3 = f11 < 0.0f;
        Path path = aVar.f11639g;
        int[] iArr = m9.a.f11631k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f11638f;
            iArr[2] = aVar.f11637e;
            iArr[3] = aVar.f11636d;
            f9 = 0.0f;
        } else {
            path.rewind();
            f9 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f11636d;
            iArr[2] = aVar.f11637e;
            iArr[3] = aVar.f11638f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f9) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = m9.a.f11632l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f11640h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
