package y;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import launcher.powerkuy.growlauncher.R;
import s3.f2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f20009u = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20010a = b.c(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f20011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f20013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f20014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f20015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f20016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f20017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f20018i;
    public final w0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w0 f20019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w0 f20020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w0 f20021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w0 f20022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w0 f20023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w0 f20024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w0 f20025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f20026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f20028t;

    public z0(View view) {
        a aVarC = b.c(128, "displayCutout");
        this.f20011b = aVarC;
        a aVarC2 = b.c(8, "ime");
        this.f20012c = aVarC2;
        a aVarC3 = b.c(32, "mandatorySystemGestures");
        this.f20013d = aVarC3;
        this.f20014e = b.c(2, "navigationBars");
        this.f20015f = b.c(1, "statusBars");
        a aVarC4 = b.c(7, "systemBars");
        this.f20016g = aVarC4;
        a aVarC5 = b.c(16, "systemGestures");
        this.f20017h = aVarC5;
        a aVarC6 = b.c(64, "tappableElement");
        this.f20018i = aVarC6;
        w0 w0Var = new w0(new c0(0, 0, 0, 0), "waterfall");
        this.j = w0Var;
        new u0(new u0(aVarC4, aVarC2), aVarC);
        new u0(new u0(new u0(aVarC6, aVarC3), aVarC5), w0Var);
        this.f20019k = b.d(4, "captionBarIgnoringVisibility");
        this.f20020l = b.d(2, "navigationBarsIgnoringVisibility");
        this.f20021m = b.d(1, "statusBarsIgnoringVisibility");
        this.f20022n = b.d(7, "systemBarsIgnoringVisibility");
        this.f20023o = b.d(64, "tappableElementIgnoringVisibility");
        this.f20024p = b.d(8, "imeAnimationTarget");
        this.f20025q = b.d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f20026r = bool != null ? bool.booleanValue() : true;
        this.f20028t = new z(this);
    }

    public static void a(z0 z0Var, f2 f2Var) {
        boolean z3 = false;
        z0Var.f20010a.f(f2Var, 0);
        z0Var.f20012c.f(f2Var, 0);
        z0Var.f20011b.f(f2Var, 0);
        z0Var.f20014e.f(f2Var, 0);
        z0Var.f20015f.f(f2Var, 0);
        z0Var.f20016g.f(f2Var, 0);
        z0Var.f20017h.f(f2Var, 0);
        z0Var.f20018i.f(f2Var, 0);
        z0Var.f20013d.f(f2Var, 0);
        z0Var.f20019k.f(w9.a.C(f2Var.f15063a.g(4)));
        z0Var.f20020l.f(w9.a.C(f2Var.f15063a.g(2)));
        z0Var.f20021m.f(w9.a.C(f2Var.f15063a.g(1)));
        z0Var.f20022n.f(w9.a.C(f2Var.f15063a.g(7)));
        z0Var.f20023o.f(w9.a.C(f2Var.f15063a.g(64)));
        s3.l lVarE = f2Var.f15063a.e();
        if (lVarE != null) {
            z0Var.j.f(w9.a.C(Build.VERSION.SDK_INT >= 30 ? k3.c.c(s3.k.b(lVarE.f15076a)) : k3.c.f9223e));
        }
        synchronized (y0.m.f20078b) {
            q0.b bVar = ((y0.b) y0.m.f20085i.get()).f20042h;
            if (bVar != null) {
                if (bVar.k()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            y0.m.a();
        }
    }
}
