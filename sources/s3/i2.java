package s3;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends gh.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WindowInsetsController f15074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Window f15075g;

    public i2(Window window) {
        this.f15074f = window.getInsetsController();
        this.f15075g = window;
    }

    @Override // gh.a
    public final void A(boolean z3) {
        Window window = this.f15075g;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f15074f.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f15074f.setSystemBarsAppearance(0, 16);
    }

    @Override // gh.a
    public final void B(boolean z3) {
        Window window = this.f15075g;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f15074f.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f15074f.setSystemBarsAppearance(0, 8);
    }

    @Override // gh.a
    public final boolean p() {
        return (this.f15074f.getSystemBarsAppearance() & 8) != 0;
    }
}
