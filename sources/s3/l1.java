package s3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f15077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f15078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f15079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f15081e;

    public l1(s1 s1Var, f2 f2Var, f2 f2Var2, int i10, View view) {
        this.f15077a = s1Var;
        this.f15078b = f2Var;
        this.f15079c = f2Var2;
        this.f15080d = i10;
        this.f15081e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        s1 s1Var = this.f15077a;
        r1 r1Var = s1Var.f15107a;
        r1Var.c(animatedFraction);
        f2 f2Var = this.f15078b;
        d2 d2Var = f2Var.f15063a;
        float fB = r1Var.b();
        PathInterpolator pathInterpolator = n1.f15087d;
        int i10 = Build.VERSION.SDK_INT;
        x1 w1Var = i10 >= 30 ? new w1(f2Var) : i10 >= 29 ? new v1(f2Var) : new u1(f2Var);
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((this.f15080d & i11) == 0) {
                w1Var.c(i11, d2Var.f(i11));
            } else {
                k3.c cVarF = d2Var.f(i11);
                k3.c cVarF2 = this.f15079c.f15063a.f(i11);
                float f9 = 1.0f - fB;
                w1Var.c(i11, f2.e(cVarF, (int) (((double) ((cVarF.f9224a - cVarF2.f9224a) * f9)) + 0.5d), (int) (((double) ((cVarF.f9225b - cVarF2.f9225b) * f9)) + 0.5d), (int) (((double) ((cVarF.f9226c - cVarF2.f9226c) * f9)) + 0.5d), (int) (((double) ((cVarF.f9227d - cVarF2.f9227d) * f9)) + 0.5d)));
            }
        }
        f2 f2VarB = w1Var.b();
        Collections.singletonList(s1Var);
        n1.f(this.f15081e, f2VarB);
    }
}
