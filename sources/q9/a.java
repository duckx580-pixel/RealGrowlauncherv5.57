package q9;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13803i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13804r;

    public /* synthetic */ a(int i10, Object obj) {
        this.f13803i = i10;
        this.f13804r = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f13803i) {
            case 0:
                g gVar = (g) this.f13804r;
                if (gVar.f13840a.getSuffixText() == null) {
                    gVar.e(g.d(gVar));
                    break;
                }
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f13804r;
                textInputLayout.t(!textInputLayout.X0, false);
                if (textInputLayout.B) {
                    textInputLayout.m(editable.length());
                }
                if (textInputLayout.I) {
                    textInputLayout.u(editable.length());
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f13803i;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f13803i;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
