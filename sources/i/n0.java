package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f7868b;

    public /* synthetic */ n0(p0 p0Var, int i10) {
        this.f7867a = i10;
        this.f7868b = p0Var;
    }

    @Override // s3.i1
    public final void c() {
        View view;
        int i10 = this.f7867a;
        p0 p0Var = this.f7868b;
        switch (i10) {
            case 0:
                if (p0Var.f7898o && (view = p0Var.f7891g) != null) {
                    view.setTranslationY(0.0f);
                    p0Var.f7888d.setTranslationY(0.0f);
                }
                p0Var.f7888d.setVisibility(8);
                p0Var.f7888d.setTransitioning(false);
                p0Var.f7902s = null;
                x7.h hVar = p0Var.f7894k;
                if (hVar != null) {
                    hVar.d(p0Var.j);
                    p0Var.j = null;
                    p0Var.f7894k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = p0Var.f7887c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = z0.f15140a;
                    s3.m0.c(actionBarOverlayLayout);
                }
                break;
            default:
                p0Var.f7902s = null;
                p0Var.f7888d.requestLayout();
                break;
        }
    }
}
