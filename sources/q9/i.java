package q9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n9.g {
    public final RectF N;

    public i(n9.k kVar) {
        super(kVar == null ? new n9.k() : kVar);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.N = new RectF();
    }

    @Override // n9.g
    public final void e(Canvas canvas) {
        RectF rectF = this.N;
        if (rectF.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(rectF);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    public final void n(float f9, float f10, float f11, float f12) {
        RectF rectF = this.N;
        if (f9 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f9, f10, f11, f12);
        invalidateSelf();
    }
}
