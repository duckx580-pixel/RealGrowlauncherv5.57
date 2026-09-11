package s3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f15062b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f15063a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f15062b = c2.f15052q;
        } else {
            f15062b = d2.f15055b;
        }
    }

    public f2(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f15063a = new c2(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f15063a = new b2(this, windowInsets);
        } else if (i10 >= 28) {
            this.f15063a = new a2(this, windowInsets);
        } else {
            this.f15063a = new z1(this, windowInsets);
        }
    }

    public static k3.c e(k3.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f9224a - i10);
        int iMax2 = Math.max(0, cVar.f9225b - i11);
        int iMax3 = Math.max(0, cVar.f9226c - i12);
        int iMax4 = Math.max(0, cVar.f9227d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : k3.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static f2 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        f2 f2Var = new f2(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = z0.f15140a;
            if (l0.b(view)) {
                f2 f2VarA = p0.a(view);
                d2 d2Var = f2Var.f15063a;
                d2Var.r(f2VarA);
                d2Var.d(view.getRootView());
            }
        }
        return f2Var;
    }

    public final int a() {
        return this.f15063a.k().f9227d;
    }

    public final int b() {
        return this.f15063a.k().f9224a;
    }

    public final int c() {
        return this.f15063a.k().f9226c;
    }

    public final int d() {
        return this.f15063a.k().f9225b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f2) {
            return r3.b.a(this.f15063a, ((f2) obj).f15063a);
        }
        return false;
    }

    public final WindowInsets f() {
        d2 d2Var = this.f15063a;
        if (d2Var instanceof y1) {
            return ((y1) d2Var).f15135c;
        }
        return null;
    }

    public final int hashCode() {
        d2 d2Var = this.f15063a;
        if (d2Var == null) {
            return 0;
        }
        return d2Var.hashCode();
    }

    public f2() {
        this.f15063a = new d2(this);
    }
}
