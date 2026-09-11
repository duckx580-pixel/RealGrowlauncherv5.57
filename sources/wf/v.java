package wf;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowId;
import android.widget.ImageView;
import android.widget.PopupWindow;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf.c f19246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PopupWindow f19247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f19248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f19249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uf.c f19253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19254i;

    public v(uf.c cVar) {
        this.f19246a = cVar;
        we.p pVar = new we.p(cVar.f17845y);
        this.f19253h = cVar;
        PopupWindow popupWindow = new PopupWindow();
        this.f19247b = popupWindow;
        popupWindow.setElevation(cVar.getDpUnit() * 4.0f);
        View viewInflate = LayoutInflater.from(cVar.getContext()).inflate(R.layout.magnifier_popup, (ViewGroup) null);
        this.f19248c = (ImageView) viewInflate.findViewById(R.id.magnifier_image_view);
        popupWindow.setHeight((int) (cVar.getDpUnit() * 70.0f));
        popupWindow.setWidth((int) (cVar.getDpUnit() * 100.0f));
        popupWindow.setContentView(viewInflate);
        this.f19250e = TypedValue.applyDimension(2, 28.0f, viewInflate.getResources().getDisplayMetrics());
        this.f19254i = 1.25f;
        this.f19249d = new Paint();
        Drawable background = popupWindow.getContentView().getBackground();
        if (background != null) {
            background.setTint(cVar.getColorScheme().e(4));
        }
        pVar.e(we.c.class, new com.google.gson.internal.b(21, this));
    }

    public final void a() {
        this.f19247b.dismiss();
    }

    public final void b(int i10, int i11) {
        if (Math.abs(i10 - this.f19251f) >= 2 || Math.abs(i11 - this.f19252g) >= 2) {
            uf.c cVar = this.f19246a;
            float textSizePx = cVar.getTextSizePx();
            float f9 = this.f19250e;
            PopupWindow popupWindow = this.f19247b;
            if (textSizePx > f9) {
                if (popupWindow.isShowing()) {
                    a();
                    return;
                }
                return;
            }
            popupWindow.setWidth(Math.min((cVar.getWidth() * 3) / 5, (int) cVar.getDpUnit()) * 250);
            this.f19251f = i10;
            this.f19252g = i11;
            int[] iArr = new int[2];
            cVar.getLocationInWindow(iArr);
            int iMax = Math.max((iArr[0] + i10) - (popupWindow.getWidth() / 2), 0);
            if (popupWindow.getWidth() + iMax > cVar.getWidth() + iArr[0]) {
                iMax = Math.max(0, (cVar.getWidth() + iArr[0]) - popupWindow.getWidth());
            }
            int iMax2 = Math.max(((iArr[1] + i11) - popupWindow.getHeight()) - cVar.getRowHeight(), 0);
            if (popupWindow.isShowing()) {
                popupWindow.update(iMax, iMax2, popupWindow.getWidth(), popupWindow.getHeight());
            } else {
                popupWindow.showAtLocation(this.f19253h, 8388659, iMax, iMax2);
            }
            c();
        }
    }

    public final void c() {
        int i10;
        PopupWindow popupWindow = this.f19247b;
        if (popupWindow.isShowing()) {
            int i11 = Build.VERSION.SDK_INT;
            float f9 = this.f19254i;
            uf.c cVar = this.f19246a;
            if (i11 >= 26) {
                Context context = cVar.getContext();
                if (context instanceof Activity) {
                    WindowId windowId = cVar.getWindowId();
                    Window window = ((Activity) context).getWindow();
                    if (window != null) {
                        WindowId windowId2 = window.getDecorView().getWindowId();
                        if (windowId != null && windowId.equals(windowId2)) {
                            Activity activity = (Activity) cVar.getContext();
                            int width = (int) (popupWindow.getWidth() / f9);
                            int height = (int) (popupWindow.getHeight() / f9);
                            int iMax = Math.max(this.f19251f - (width / 2), 0);
                            int iMax2 = Math.max(this.f19252g - (height / 2), 0);
                            int iMin = Math.min(iMax + width, cVar.getWidth());
                            int iMin2 = Math.min(iMax2 + height, cVar.getHeight());
                            if (iMin - iMax < width) {
                                iMax = Math.max(0, iMin - width);
                            }
                            if (iMin2 - iMax2 < height) {
                                iMax2 = Math.max(0, iMin2 - height);
                            }
                            int i12 = iMin - iMax;
                            if (i12 <= 0 || (i10 = iMin2 - iMax2) <= 0) {
                                a();
                                return;
                            }
                            int[] iArr = new int[2];
                            cVar.getLocationInWindow(iArr);
                            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i10, Bitmap.Config.ARGB_8888);
                            try {
                                Window window2 = activity.getWindow();
                                int i13 = iArr[0];
                                int i14 = iArr[1];
                                PixelCopy.request(window2, new Rect(iMax + i13, iMax2 + i14, i13 + iMin, i14 + iMin2), bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: wf.u
                                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                    public final void onPixelCopyFinished(int i15) {
                                        v vVar = this.f19244a;
                                        uf.c cVar2 = vVar.f19246a;
                                        Paint paint = vVar.f19249d;
                                        PopupWindow popupWindow2 = vVar.f19247b;
                                        if (i15 != 0) {
                                            Log.w("Magnifier", "Failed to copy pixels, error = " + i15);
                                            return;
                                        }
                                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(popupWindow2.getWidth(), popupWindow2.getHeight(), Bitmap.Config.ARGB_8888);
                                        int width2 = popupWindow2.getWidth();
                                        int height2 = popupWindow2.getHeight();
                                        Bitmap bitmap = bitmapCreateBitmap;
                                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width2, height2, true);
                                        bitmap.recycle();
                                        Canvas canvas = new Canvas(bitmapCreateBitmap2);
                                        paint.reset();
                                        paint.setAntiAlias(true);
                                        canvas.drawARGB(0, 0, 0, 0);
                                        canvas.drawRoundRect(0.0f, 0.0f, popupWindow2.getWidth(), popupWindow2.getHeight(), cVar2.getDpUnit() * 6.0f, cVar2.getDpUnit() * 6.0f, paint);
                                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
                                        bitmapCreateScaledBitmap.recycle();
                                        vVar.f19248c.setImageBitmap(bitmapCreateBitmap2);
                                    }
                                }, cVar.getHandler());
                                return;
                            } catch (IllegalArgumentException unused) {
                                a();
                                if (bitmapCreateBitmap.isRecycled()) {
                                    return;
                                }
                                bitmapCreateBitmap.recycle();
                                return;
                            }
                        }
                    }
                }
            }
            if (popupWindow.getWidth() <= 0 || popupWindow.getHeight() <= 0) {
                a();
                return;
            }
            int width2 = popupWindow.getWidth();
            int height2 = popupWindow.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width2, height2, config);
            int width3 = (int) (popupWindow.getWidth() / f9);
            int height3 = (int) (popupWindow.getHeight() / f9);
            int iMax3 = Math.max(this.f19251f - (width3 / 2), 0);
            int iMax4 = Math.max(this.f19252g - (height3 / 2), 0);
            int iMin3 = Math.min(iMax3 + width3, cVar.getWidth());
            int iMin4 = Math.min(iMax4 + height3, cVar.getHeight());
            if (iMin3 - iMax3 < width3) {
                iMax3 = Math.max(0, iMin3 - width3);
            }
            if (iMin4 - iMax4 < height3) {
                iMax4 = Math.max(0, iMin4 - height3);
            }
            if (iMin3 - iMax3 <= 0 || iMin4 - iMax4 <= 0) {
                a();
                bitmapCreateBitmap2.recycle();
                return;
            }
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(width3, height3, config);
            Canvas canvas = new Canvas(bitmapCreateBitmap3);
            canvas.translate((-iMax3) - cVar.getOffsetX(), (-iMax4) - cVar.getOffsetY());
            cVar.draw(canvas);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap3, popupWindow.getWidth(), popupWindow.getHeight(), true);
            bitmapCreateBitmap3.recycle();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            Paint paint = this.f19249d;
            paint.reset();
            paint.setAntiAlias(true);
            canvas2.drawARGB(0, 0, 0, 0);
            canvas2.drawRoundRect(0.0f, 0.0f, popupWindow.getWidth(), popupWindow.getHeight(), cVar.getDpUnit() * 6.0f, cVar.getDpUnit() * 6.0f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
            bitmapCreateScaledBitmap.recycle();
            this.f19248c.setImageBitmap(bitmapCreateBitmap2);
        }
    }
}
