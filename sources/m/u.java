package m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import launcher.powerkuy.growlauncher.R;
import s3.j0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f10336e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f10339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f10340i;
    public PopupWindow.OnDismissListener j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10337f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f10341k = new s(this);

    public u(Context context, j jVar, View view, boolean z3, int i10, int i11) {
        this.f10332a = context;
        this.f10333b = jVar;
        this.f10336e = view;
        this.f10334c = z3;
        this.f10335d = i10;
    }

    public final r a() {
        r b0Var;
        if (this.f10340i == null) {
            Context context = this.f10332a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            t.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                b0Var = new d(context, this.f10336e, this.f10335d, this.f10334c);
            } else {
                b0Var = new b0(this.f10332a, this.f10333b, this.f10336e, this.f10335d, this.f10334c);
            }
            b0Var.l(this.f10333b);
            b0Var.r(this.f10341k);
            b0Var.n(this.f10336e);
            b0Var.e(this.f10339h);
            b0Var.o(this.f10338g);
            b0Var.p(this.f10337f);
            this.f10340i = b0Var;
        }
        return this.f10340i;
    }

    public final boolean b() {
        r rVar = this.f10340i;
        return rVar != null && rVar.b();
    }

    public void c() {
        this.f10340i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z3, boolean z10) {
        r rVarA = a();
        rVarA.s(z10);
        if (z3) {
            int i12 = this.f10337f;
            View view = this.f10336e;
            WeakHashMap weakHashMap = z0.f15140a;
            if ((Gravity.getAbsoluteGravity(i12, j0.d(view)) & 7) == 5) {
                i10 -= this.f10336e.getWidth();
            }
            rVarA.q(i10);
            rVarA.t(i11);
            int i13 = (int) ((this.f10332a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            rVarA.f10330i = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        rVarA.g();
    }
}
