package i;

import android.view.ViewGroup;
import com.rtsoft.growtopia.R;
import java.util.WeakHashMap;
import s3.h1;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7881i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f7882r;

    public /* synthetic */ p(b0 b0Var, int i10) {
        this.f7881i = i10;
        this.f7882r = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f7881i;
        b0 b0Var = this.f7882r;
        switch (i10) {
            case 0:
                if ((b0Var.f7780p0 & 1) != 0) {
                    b0Var.w(0);
                }
                if ((b0Var.f7780p0 & 4096) != 0) {
                    b0Var.w(R.styleable.AppCompatTheme_tooltipForegroundColor);
                }
                b0Var.f7779o0 = false;
                b0Var.f7780p0 = 0;
                break;
            default:
                b0Var.M.showAtLocation(b0Var.L, 55, 0, 0);
                h1 h1Var = b0Var.O;
                if (h1Var != null) {
                    h1Var.b();
                }
                if (b0Var.P && (viewGroup = b0Var.Q) != null) {
                    WeakHashMap weakHashMap = z0.f15140a;
                    if (s3.l0.c(viewGroup)) {
                        b0Var.L.setAlpha(0.0f);
                        h1 h1VarA = z0.a(b0Var.L);
                        h1VarA.a(1.0f);
                        b0Var.O = h1VarA;
                        h1VarA.d(new q(0, this));
                    }
                }
                b0Var.L.setAlpha(1.0f);
                b0Var.L.setVisibility(0);
                break;
        }
    }
}
