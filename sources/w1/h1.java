package w1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class h1 extends ViewGroup {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18823i;

    public h1(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(g1.r rVar, f2 f2Var, long j) {
        super.drawChild(g1.e.a(rVar), f2Var, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", childAt);
            if (((f2) childAt).f18813x) {
                this.f18823i = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f18823i = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f18823i) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i10, int i11, int i12, int i13) {
    }
}
