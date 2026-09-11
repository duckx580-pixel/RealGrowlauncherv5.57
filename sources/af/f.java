package af;

import android.view.View;
import androidx.recyclerview.widget.f1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f615b;

    public /* synthetic */ f(int i10, int i11) {
        this.f614a = i10;
        this.f615b = i11;
    }

    public void a(f1 f1Var) {
        View view = f1Var.itemView;
        this.f614a = view.getLeft();
        this.f615b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
