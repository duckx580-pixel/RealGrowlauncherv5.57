package g4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f6967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f6968b;

    public d(TextView textView) {
        this.f6967a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f6967a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = e4.j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return e4.j.a().f(0, charSequence.length(), charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        e4.j jVarA = e4.j.a();
        if (this.f6968b == null) {
            this.f6968b = new c(textView, this);
        }
        jVarA.g(this.f6968b);
        return charSequence;
    }
}
