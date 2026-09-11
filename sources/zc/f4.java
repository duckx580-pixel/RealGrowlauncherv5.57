package zc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f4 extends View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20828i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f20829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rect f20830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Rect f20831t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Rect f20832u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rect f20833v;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect = this.f20833v;
        if (this.f20832u == null || this.f20829r == null) {
            return;
        }
        getDrawingRect(rect);
        canvas.drawBitmap(this.f20829r, this.f20832u, rect, (Paint) null);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.f20829r = bitmap;
        int width = bitmap.getWidth();
        int height = this.f20829r.getHeight();
        int i10 = width / 2;
        this.f20831t = new Rect(0, 0, i10, height);
        Rect rect = new Rect(i10, 0, width, height);
        this.f20830s = rect;
        if (this.f20828i) {
            this.f20832u = rect;
        } else {
            this.f20832u = this.f20831t;
        }
    }
}
