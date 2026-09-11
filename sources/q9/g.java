package q9;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f13815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f13816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f13817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f13818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimatorSet f13819i;
    public ValueAnimator j;

    public g(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        int i11 = 0;
        this.f13815e = new a(0, this);
        this.f13816f = new b(this, i11);
        this.f13817g = new c(this, i11);
        this.f13818h = new d(this, 0);
    }

    public static boolean d(g gVar) {
        EditText editText = gVar.f13840a.getEditText();
        if (editText != null) {
            return (editText.hasFocus() || gVar.f13842c.hasFocus()) && editText.getText().length() > 0;
        }
        return false;
    }

    @Override // q9.p
    public final void a() {
        int i10 = this.f13843d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_ic_cancel;
        }
        TextInputLayout textInputLayout = this.f13840a;
        textInputLayout.setEndIconDrawable(i10);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        int i11 = 0;
        textInputLayout.setEndIconCheckable(false);
        textInputLayout.setEndIconOnClickListener(new androidx.appcompat.widget.c(6, this));
        LinkedHashSet linkedHashSet = textInputLayout.f4271r0;
        c cVar = this.f13817g;
        linkedHashSet.add(cVar);
        if (textInputLayout.f4276u != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.f4279v0.add(this.f13818h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(x8.a.f19494d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new f(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = x8.a.f19491a;
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new f(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13819i = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f13819i.addListener(new e(this, i11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new f(this, 0));
        this.j = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new e(this, 1));
    }

    @Override // q9.p
    public final void c(boolean z3) {
        if (this.f13840a.getSuffixText() == null) {
            return;
        }
        e(z3);
    }

    public final void e(boolean z3) {
        boolean z10 = this.f13840a.g() == z3;
        if (z3 && !this.f13819i.isRunning()) {
            this.j.cancel();
            this.f13819i.start();
            if (z10) {
                this.f13819i.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f13819i.cancel();
        this.j.start();
        if (z10) {
            this.j.end();
        }
    }
}
