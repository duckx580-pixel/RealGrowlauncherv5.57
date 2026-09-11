package g2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6953b;

    public k(boolean z3, boolean z10) {
        this.f6952a = z3;
        this.f6953b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f6952a);
        textPaint.setStrikeThruText(this.f6953b);
    }
}
