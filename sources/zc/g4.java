package zc;

import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g4 implements View.OnTouchListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c4 f20846i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BitmapDrawable f20847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c4 f20848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BitmapDrawable f20849t;

    public g4(c4 c4Var, BitmapDrawable bitmapDrawable, c4 c4Var2, BitmapDrawable bitmapDrawable2) {
        this.f20846i = c4Var;
        this.f20847r = bitmapDrawable;
        this.f20848s = c4Var2;
        this.f20849t = bitmapDrawable2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        c4 c4Var = this.f20848s;
        BitmapDrawable bitmapDrawable = this.f20847r;
        c4 c4Var2 = this.f20846i;
        if (action == 0) {
            if (c4Var2 != null || bitmapDrawable != null) {
                if (c4Var != null) {
                    c4Var.b();
                    c4Var.setVisibility(4);
                }
                view.setBackground(null);
            }
            if (bitmapDrawable != null) {
                view.setBackground(bitmapDrawable);
                return false;
            }
            if (c4Var2 != null) {
                c4Var2.setVisibility(0);
                c4Var2.f20745t = true;
                c4Var2.e();
                return false;
            }
        } else if (motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z3 = x10 < 0.0f || x10 >= ((float) view.getWidth()) || y10 < 0.0f || y10 >= ((float) view.getHeight());
            if (z3) {
                BitmapDrawable bitmapDrawable2 = this.f20849t;
                if (bitmapDrawable2 != null) {
                    view.setBackground(bitmapDrawable2);
                } else if (bitmapDrawable != null) {
                    view.setBackground(null);
                }
            }
            if (c4Var2 != null) {
                c4Var2.b();
                c4Var2.setVisibility(4);
            }
            if ((c4Var2 != null || bitmapDrawable != null) && c4Var != null && z3) {
                c4Var.setVisibility(0);
                c4Var.f20745t = true;
                c4Var.e();
            }
        }
        return false;
    }
}
