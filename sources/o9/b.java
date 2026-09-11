package o9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i9.m;
import java.util.WeakHashMap;
import launcher.powerkuy.growlauncher.R;
import s3.i0;
import s3.m0;
import s3.o0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends FrameLayout {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f12796x = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12797i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f12798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f12799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f12801u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f12802v;
    public PorterDuff.Mode w;

    public b(Context context, AttributeSet attributeSet) {
        super(r9.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, w8.a.f19128x);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = z0.f15140a;
            o0.s(this, dimensionPixelSize);
        }
        this.f12797i = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f12798r = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(w9.a.o(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(m.g(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f12799s = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f12800t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f12801u = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f12796x);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(gh.a.q(gh.a.l(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), gh.a.l(this, R.attr.colorOnSurface)));
            ColorStateList colorStateList = this.f12802v;
            if (colorStateList != null) {
                l3.b.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = z0.f15140a;
            i0.q(this, gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f12799s;
    }

    public int getAnimationMode() {
        return this.f12797i;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f12798r;
    }

    public int getMaxInlineActionWidth() {
        return this.f12801u;
    }

    public int getMaxWidth() {
        return this.f12800t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = z0.f15140a;
        m0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i10, int i11, int i12, int i13) {
        super.onLayout(z3, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f12800t;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f12797i = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f12802v != null) {
            drawable = drawable.mutate();
            l3.b.h(drawable, this.f12802v);
            l3.b.i(drawable, this.w);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f12802v = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            l3.b.h(drawableMutate, colorStateList);
            l3.b.i(drawableMutate, this.w);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.w = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            l3.b.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f12796x);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(c cVar) {
    }
}
