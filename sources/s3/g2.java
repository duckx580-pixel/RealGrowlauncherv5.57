package s3;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class g2 extends gh.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Window f15071f;

    public g2(Window window) {
        this.f15071f = window;
    }

    @Override // gh.a
    public final void B(boolean z3) {
        Window window = this.f15071f;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }

    @Override // gh.a
    public final boolean p() {
        return (this.f15071f.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
