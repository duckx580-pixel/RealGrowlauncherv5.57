package i9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.g2;
import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends g2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f8145i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f8146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f8147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8150v;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8146r = new Rect();
        this.f8147s = new Rect();
        this.f8148t = R.styleable.AppCompatTheme_windowMinWidthMinor;
        this.f8149u = true;
        this.f8150v = false;
        m.a(context, attributeSet, 0, 0);
        int[] iArr = w8.a.f19115i;
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f8148t = typedArrayObtainStyledAttributes.getInt(1, this.f8148t);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8149u = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8145i;
        if (drawable != null) {
            if (this.f8150v) {
                this.f8150v = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f8149u;
                Rect rect = this.f8146r;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f8148t;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f8147s;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f8145i;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8145i;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f8145i.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f8145i;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f8148t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8145i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.g2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i10, int i11, int i12, int i13) {
        super.onLayout(z3, i10, i11, i12, i13);
        this.f8150v = z3 | this.f8150v;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8150v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8145i;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f8145i);
            }
            this.f8145i = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8148t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f8148t != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
                i10 |= 48;
            }
            this.f8148t = i10;
            if (i10 == 119 && this.f8145i != null) {
                this.f8145i.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8145i;
    }
}
