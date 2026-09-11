package q3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f13773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f13774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13776d;

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f13773a = textPaint;
        this.f13774b = textDirectionHeuristic;
        this.f13775c = i10;
        this.f13776d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13775c != eVar.f13775c || this.f13776d != eVar.f13776d) {
            return false;
        }
        TextPaint textPaint = this.f13773a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = eVar.f13773a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f13774b == eVar.f13774b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f13773a;
        return r3.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f13774b, Integer.valueOf(this.f13775c), Integer.valueOf(this.f13776d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f13773a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f13774b);
        sb2.append(", breakStrategy=" + this.f13775c);
        sb2.append(", hyphenationFrequency=" + this.f13776d);
        sb2.append("}");
        return sb2.toString();
    }

    public e(PrecomputedText.Params params) {
        this.f13773a = params.getTextPaint();
        this.f13774b = params.getTextDirection();
        this.f13775c = params.getBreakStrategy();
        this.f13776d = params.getHyphenationFrequency();
    }
}
