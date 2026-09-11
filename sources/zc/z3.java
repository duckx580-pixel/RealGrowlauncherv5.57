package zc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class z3 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21311i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c4 f21312r;

    public /* synthetic */ z3(c4 c4Var, int i10) {
        this.f21311i = i10;
        this.f21312r = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21311i) {
            case 0:
                c4 c4Var = this.f21312r;
                Bitmap bitmap = c4Var.f20743r;
                if (bitmap != null && !bitmap.isRecycled()) {
                    c4Var.setImageBitmap(c4Var.f20743r);
                    break;
                }
                break;
            default:
                c4 c4Var2 = this.f21312r;
                c4Var2.f20743r = null;
                c4Var2.f20742i = null;
                c4Var2.w = null;
                c4Var2.f20747v = false;
                break;
        }
    }
}
