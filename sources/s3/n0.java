package s3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f2 f15084a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f15086c;

    public n0(View view, y yVar) {
        this.f15085b = view;
        this.f15086c = yVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        f2 f2VarG = f2.g(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        y yVar = this.f15086c;
        if (i10 < 30) {
            o0.a(windowInsets, this.f15085b);
            if (f2VarG.equals(this.f15084a)) {
                return yVar.onApplyWindowInsets(view, f2VarG).f();
            }
        }
        this.f15084a = f2VarG;
        f2 f2VarOnApplyWindowInsets = yVar.onApplyWindowInsets(view, f2VarG);
        if (i10 >= 30) {
            return f2VarOnApplyWindowInsets.f();
        }
        WeakHashMap weakHashMap = z0.f15140a;
        m0.c(view);
        return f2VarOnApplyWindowInsets.f();
    }
}
