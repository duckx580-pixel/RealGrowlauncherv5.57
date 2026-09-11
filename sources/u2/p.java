package u2;

import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import w1.f2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17599a;

    public /* synthetic */ p(int i10) {
        this.f17599a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f17599a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", view);
                Outline outlineB = ((f2) view).f18811u.b();
                kotlin.jvm.internal.l.c(outlineB);
                outline.set(outlineB);
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), TypedValue.applyDimension(1, 8.0f, view.getContext().getResources().getDisplayMetrics()));
                break;
        }
    }
}
