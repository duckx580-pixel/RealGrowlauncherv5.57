package q9;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i9.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13821i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f13822r;

    public /* synthetic */ j(p pVar, int i10) {
        this.f13821i = i10;
        this.f13822r = pVar;
    }

    @Override // i9.l, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.f13821i) {
            case 0:
                o oVar = (o) this.f13822r;
                EditText editText = oVar.f13840a.getEditText();
                if (!(editText instanceof AutoCompleteTextView)) {
                    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (oVar.f13837o.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !oVar.f13842c.hasFocus()) {
                    autoCompleteTextView.dismissDropDown();
                }
                autoCompleteTextView.post(new androidx.fragment.app.d(18, this, autoCompleteTextView));
                return;
            default:
                return;
        }
    }

    @Override // i9.l, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f13821i) {
            case 1:
                ((u) this.f13822r).f13842c.setChecked(!u.d(r1));
                break;
        }
    }
}
