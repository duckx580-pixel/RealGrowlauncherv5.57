package q9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.h1;
import com.google.android.material.textfield.TextInputLayout;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;
import java.util.WeakHashMap;
import launcher.powerkuy.growlauncher.R;
import s3.j0;
import s3.l0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f13851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f13852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f13854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AnimatorSet f13855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13858i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h1 f13860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f13861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f13863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f13864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h1 f13866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f13868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f13869u;

    public s(TextInputLayout textInputLayout) {
        this.f13850a = textInputLayout.getContext();
        this.f13851b = textInputLayout;
        this.f13856g = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(h1 h1Var, int i10) {
        if (this.f13852c == null && this.f13854e == null) {
            Context context = this.f13850a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f13852c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f13852c;
            TextInputLayout textInputLayout = this.f13851b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f13854e = new FrameLayout(context);
            this.f13852c.addView(this.f13854e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f13854e.setVisibility(0);
            this.f13854e.addView(h1Var);
        } else {
            this.f13852c.addView(h1Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f13852c.setVisibility(0);
        this.f13853d++;
    }

    public final void b() {
        if (this.f13852c != null) {
            TextInputLayout textInputLayout = this.f13851b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f13850a;
                boolean zW = w9.a.w(context);
                LinearLayout linearLayout = this.f13852c;
                WeakHashMap weakHashMap = z0.f15140a;
                int iF = j0.f(editText);
                if (zW) {
                    iF = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zW) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int iE = j0.e(editText);
                if (zW) {
                    iE = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                j0.k(linearLayout, iF, dimensionPixelSize, iE, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f13855f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, h1 h1Var, int i10, int i11, int i12) {
        if (h1Var == null || !z3) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(h1Var, (Property<h1, Float>) View.ALPHA, i12 == i10 ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(x8.a.f19491a);
            arrayList.add(objectAnimatorOfFloat);
            if (i12 == i10) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(h1Var, (Property<h1, Float>) View.TRANSLATION_Y, -this.f13856g, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(x8.a.f19494d);
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.f13858i != 1 || this.f13860l == null || TextUtils.isEmpty(this.j)) ? false : true;
    }

    public final TextView f(int i10) {
        if (i10 == 1) {
            return this.f13860l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f13866r;
    }

    public final void g() {
        this.j = null;
        c();
        if (this.f13857h == 1) {
            if (!this.f13865q || TextUtils.isEmpty(this.f13864p)) {
                this.f13858i = 0;
            } else {
                this.f13858i = 2;
            }
        }
        j(this.f13857h, this.f13858i, i(this.f13860l, PredefinedUICustomizationFont.defaultFamily));
    }

    public final void h(h1 h1Var, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f13852c;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f13854e) != null) {
            frameLayout.removeView(h1Var);
        } else {
            linearLayout.removeView(h1Var);
        }
        int i11 = this.f13853d - 1;
        this.f13853d = i11;
        LinearLayout linearLayout2 = this.f13852c;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(h1 h1Var, CharSequence charSequence) {
        WeakHashMap weakHashMap = z0.f15140a;
        TextInputLayout textInputLayout = this.f13851b;
        if (l0.c(textInputLayout) && textInputLayout.isEnabled()) {
            return (this.f13858i == this.f13857h && h1Var != null && TextUtils.equals(h1Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void j(int i10, int i11, boolean z3) {
        TextView textViewF;
        TextView textViewF2;
        s sVar = this;
        if (i10 == i11) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            sVar.f13855f = animatorSet;
            ArrayList arrayList = new ArrayList();
            sVar.d(arrayList, sVar.f13865q, sVar.f13866r, 2, i10, i11);
            sVar.d(arrayList, sVar.f13859k, sVar.f13860l, 1, i10, i11);
            int size = arrayList.size();
            long jMax = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Animator animator = (Animator) arrayList.get(i12);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            q qVar = new q(this, i11, f(i10), i10, sVar.f(i11));
            sVar = this;
            animatorSet.addListener(qVar);
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewF2 = sVar.f(i11)) != null) {
                textViewF2.setVisibility(0);
                textViewF2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewF = f(i10)) != null) {
                textViewF.setVisibility(4);
                if (i10 == 1) {
                    textViewF.setText((CharSequence) null);
                }
            }
            sVar.f13857h = i11;
        }
        TextInputLayout textInputLayout = sVar.f13851b;
        textInputLayout.p();
        textInputLayout.t(z3, false);
        textInputLayout.y();
    }
}
