package g2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6927i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f6928r;

    public /* synthetic */ a(float f9, int i10) {
        this.f6927i = i10;
        this.f6928r = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f6927i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f6928r);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f6928r);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f6927i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f6928r);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f6928r);
                break;
        }
    }
}
