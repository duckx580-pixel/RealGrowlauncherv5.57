package s3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f15087d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k4.a f15088e = new k4.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f15089f = new DecelerateInterpolator();

    public static void d(View view, s1 s1Var) {
        y.z zVarI = i(view);
        if (zVarI != null) {
            zVarI.a(s1Var);
            if (zVarI.f20004r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                d(viewGroup.getChildAt(i10), s1Var);
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z3) {
        y.z zVarI = i(view);
        if (zVarI != null) {
            zVarI.f20003i = windowInsets;
            if (!z3) {
                z3 = true;
                zVarI.f20006t = true;
                zVarI.f20007u = true;
                if (zVarI.f20004r != 0) {
                    z3 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), windowInsets, z3);
            }
        }
    }

    public static void f(View view, f2 f2Var) {
        y.z zVarI = i(view);
        if (zVarI != null) {
            y.z0 z0Var = zVarI.f20005s;
            y.z0.a(z0Var, f2Var);
            if (z0Var.f20026r) {
                f2Var = f2.f15062b;
            }
            if (zVarI.f20004r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), f2Var);
            }
        }
    }

    public static void g(View view) {
        y.z zVarI = i(view);
        if (zVarI != null) {
            zVarI.f20006t = false;
            if (zVarI.f20004r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static y.z i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof m1) {
            return ((m1) tag).f15082a;
        }
        return null;
    }
}
