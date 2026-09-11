package d;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.n;
import androidx.lifecycle.p0;
import kotlin.jvm.internal.l;
import w1.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f4795a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(n nVar, w0.a aVar) {
        l.f("<this>", nVar);
        View childAt = ((ViewGroup) nVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        a1 a1Var = childAt instanceof a1 ? (a1) childAt : null;
        if (a1Var != null) {
            a1Var.setParentCompositionContext(null);
            a1Var.setContent(aVar);
            return;
        }
        a1 a1Var2 = new a1(nVar);
        a1Var2.setParentCompositionContext(null);
        a1Var2.setContent(aVar);
        View decorView = nVar.getWindow().getDecorView();
        l.e("window.decorView", decorView);
        if (p0.f(decorView) == null) {
            p0.k(decorView, nVar);
        }
        if (p0.g(decorView) == null) {
            p0.l(decorView, nVar);
        }
        if (k8.g.n(decorView) == null) {
            k8.g.w(decorView, nVar);
        }
        nVar.setContentView(a1Var2, f4795a);
    }
}
