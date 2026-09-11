package y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import s3.d2;
import s3.f2;
import s3.s1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable, s3.y, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WindowInsets f20003i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z0 f20005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f2 f20008v;

    public z(z0 z0Var) {
        this.f20004r = !z0Var.f20026r ? 1 : 0;
        this.f20005s = z0Var;
    }

    public final void a(s1 s1Var) {
        this.f20006t = false;
        this.f20007u = false;
        f2 f2Var = this.f20008v;
        if (s1Var.f15107a.a() != 0 && f2Var != null) {
            d2 d2Var = f2Var.f15063a;
            z0 z0Var = this.f20005s;
            z0Var.f20025q.f(w9.a.C(d2Var.f(8)));
            z0Var.f20024p.f(w9.a.C(d2Var.f(8)));
            z0.a(z0Var, f2Var);
        }
        this.f20008v = null;
    }

    @Override // s3.y
    public final f2 onApplyWindowInsets(View view, f2 f2Var) {
        this.f20008v = f2Var;
        z0 z0Var = this.f20005s;
        w0 w0Var = z0Var.f20024p;
        d2 d2Var = f2Var.f15063a;
        w0Var.f(w9.a.C(d2Var.f(8)));
        if (this.f20006t) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f20007u) {
            z0Var.f20025q.f(w9.a.C(d2Var.f(8)));
            z0.a(z0Var, f2Var);
        }
        return z0Var.f20026r ? f2.f15062b : f2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20006t) {
            this.f20006t = false;
            this.f20007u = false;
            f2 f2Var = this.f20008v;
            if (f2Var != null) {
                z0 z0Var = this.f20005s;
                z0Var.f20025q.f(w9.a.C(f2Var.f15063a.f(8)));
                z0.a(z0Var, f2Var);
                this.f20008v = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
