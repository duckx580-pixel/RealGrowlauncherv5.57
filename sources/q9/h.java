package q9;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TextInputLayout textInputLayout, int i10, int i11) {
        super(textInputLayout, i10);
        this.f13820e = i11;
    }

    @Override // q9.p
    public final void a() {
        switch (this.f13820e) {
            case 0:
                int i10 = this.f13843d;
                TextInputLayout textInputLayout = this.f13840a;
                textInputLayout.setEndIconDrawable(i10);
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                break;
            default:
                TextInputLayout textInputLayout2 = this.f13840a;
                textInputLayout2.setEndIconOnClickListener(null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
                break;
        }
    }
}
