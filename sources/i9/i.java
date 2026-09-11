package i9;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f8151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f8152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8154d;
    public boolean j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f8155e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8156f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f8157g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8158h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8159i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f8160k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f8151a = charSequence;
        this.f8152b = textPaint;
        this.f8153c = i10;
        this.f8154d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f8151a == null) {
            this.f8151a = PredefinedUICustomizationFont.defaultFamily;
        }
        int iMax = Math.max(0, this.f8153c);
        CharSequence charSequenceEllipsize = this.f8151a;
        int i10 = this.f8156f;
        TextPaint textPaint = this.f8152b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f8160k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f8154d);
        this.f8154d = iMin;
        if (this.j && this.f8156f == 1) {
            this.f8155e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f8155e);
        builderObtain.setIncludePad(this.f8159i);
        builderObtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f8160k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f8156f);
        float f9 = this.f8157g;
        if (f9 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f9);
        }
        if (this.f8156f > 1) {
            builderObtain.setHyphenationFrequency(this.f8158h);
        }
        return builderObtain.build();
    }
}
