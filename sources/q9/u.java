package q9;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f13873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f13874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f13875g;

    public u(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f13873e = new j(this, 1);
        this.f13874f = new c(this, 2);
        this.f13875g = new d(this, 2);
    }

    public static boolean d(u uVar) {
        EditText editText = uVar.f13840a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // q9.p
    public final void a() {
        int i10 = this.f13843d;
        if (i10 == 0) {
            i10 = R.drawable.design_password_eye;
        }
        TextInputLayout textInputLayout = this.f13840a;
        textInputLayout.setEndIconDrawable(i10);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconVisible(true);
        textInputLayout.setEndIconCheckable(true);
        textInputLayout.setEndIconOnClickListener(new androidx.appcompat.widget.c(8, this));
        LinkedHashSet linkedHashSet = textInputLayout.f4271r0;
        c cVar = this.f13874f;
        linkedHashSet.add(cVar);
        if (textInputLayout.f4276u != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.f4279v0.add(this.f13875g);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
