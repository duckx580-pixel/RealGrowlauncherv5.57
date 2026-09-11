package i;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l3;
import androidx.appcompat.widget.r3;
import androidx.appcompat.widget.s1;
import androidx.appcompat.widget.s3;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s3.g1;
import s3.h1;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends a implements androidx.appcompat.widget.f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f7883y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f7884z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f7885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f7886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f7887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f7888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s1 f7889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f7890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f7891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o0 f7893i;
    public o0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x7.h f7894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f7896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l.k f7902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n0 f7905v;
    public final n0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l5.o f7906x;

    public p0(Activity activity, boolean z3) {
        new ArrayList();
        this.f7896m = new ArrayList();
        this.f7897n = 0;
        this.f7898o = true;
        this.f7901r = true;
        this.f7905v = new n0(this, 0);
        this.w = new n0(this, 1);
        this.f7906x = new l5.o(this);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z3) {
            return;
        }
        this.f7891g = decorView.findViewById(R.id.content);
    }

    @Override // i.a
    public final boolean b() {
        l3 l3Var;
        s1 s1Var = this.f7889e;
        if (s1Var == null || (l3Var = ((s3) s1Var).f1000a.f807f0) == null || l3Var.f923r == null) {
            return false;
        }
        l3 l3Var2 = ((s3) s1Var).f1000a.f807f0;
        m.l lVar = l3Var2 == null ? null : l3Var2.f923r;
        if (lVar == null) {
            return true;
        }
        lVar.collapseActionView();
        return true;
    }

    @Override // i.a
    public final void c(boolean z3) {
        if (z3 == this.f7895l) {
            return;
        }
        this.f7895l = z3;
        ArrayList arrayList = this.f7896m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // i.a
    public final int d() {
        return ((s3) this.f7889e).f1001b;
    }

    @Override // i.a
    public final Context e() {
        if (this.f7886b == null) {
            TypedValue typedValue = new TypedValue();
            this.f7885a.getTheme().resolveAttribute(launcher.powerkuy.growlauncher.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f7886b = new ContextThemeWrapper(this.f7885a, i10);
            } else {
                this.f7886b = this.f7885a;
            }
        }
        return this.f7886b;
    }

    @Override // i.a
    public final void g() {
        r(this.f7885a.getResources().getBoolean(launcher.powerkuy.growlauncher.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // i.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        m.j jVar;
        o0 o0Var = this.f7893i;
        if (o0Var == null || (jVar = o0Var.f7878t) == null) {
            return false;
        }
        jVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return jVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // i.a
    public final void l(boolean z3) {
        if (this.f7892h) {
            return;
        }
        int i10 = z3 ? 4 : 0;
        s3 s3Var = (s3) this.f7889e;
        int i11 = s3Var.f1001b;
        this.f7892h = true;
        s3Var.a((i10 & 4) | (i11 & (-5)));
    }

    @Override // i.a
    public final void m(boolean z3) {
        l.k kVar;
        this.f7903t = z3;
        if (z3 || (kVar = this.f7902s) == null) {
            return;
        }
        kVar.a();
    }

    @Override // i.a
    public final void n(CharSequence charSequence) {
        s3 s3Var = (s3) this.f7889e;
        if (s3Var.f1006g) {
            return;
        }
        Toolbar toolbar = s3Var.f1000a;
        s3Var.f1007h = charSequence;
        if ((s3Var.f1001b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s3Var.f1006g) {
                z0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // i.a
    public final l.b o(x7.h hVar) {
        o0 o0Var = this.f7893i;
        if (o0Var != null) {
            o0Var.a();
        }
        this.f7887c.setHideOnContentScrollEnabled(false);
        this.f7890f.e();
        o0 o0Var2 = new o0(this, this.f7890f.getContext(), hVar);
        m.j jVar = o0Var2.f7878t;
        jVar.w();
        try {
            if (!((l.a) o0Var2.f7879u.f19488r).a(o0Var2, jVar)) {
                return null;
            }
            this.f7893i = o0Var2;
            o0Var2.h();
            this.f7890f.c(o0Var2);
            p(true);
            return o0Var2;
        } finally {
            jVar.v();
        }
    }

    public final void p(boolean z3) {
        h1 h1VarI;
        h1 h1VarI2;
        if (z3) {
            if (!this.f7900q) {
                this.f7900q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7887c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.f7900q) {
            this.f7900q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7887c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        ActionBarContainer actionBarContainer = this.f7888d;
        WeakHashMap weakHashMap = z0.f15140a;
        if (!s3.l0.c(actionBarContainer)) {
            if (z3) {
                ((s3) this.f7889e).f1000a.setVisibility(4);
                this.f7890f.setVisibility(0);
                return;
            } else {
                ((s3) this.f7889e).f1000a.setVisibility(0);
                this.f7890f.setVisibility(8);
                return;
            }
        }
        if (z3) {
            s3 s3Var = (s3) this.f7889e;
            h1VarI = z0.a(s3Var.f1000a);
            h1VarI.a(0.0f);
            h1VarI.c(100L);
            h1VarI.d(new r3(s3Var, 4));
            h1VarI2 = this.f7890f.i(200L, 0);
        } else {
            s3 s3Var2 = (s3) this.f7889e;
            h1 h1VarA = z0.a(s3Var2.f1000a);
            h1VarA.a(1.0f);
            h1VarA.c(200L);
            h1VarA.d(new r3(s3Var2, 0));
            h1VarI = this.f7890f.i(100L, 8);
            h1VarI2 = h1VarA;
        }
        l.k kVar = new l.k();
        ArrayList arrayList = kVar.f9717a;
        arrayList.add(h1VarI);
        View view = (View) h1VarI.f15072a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) h1VarI2.f15072a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(h1VarI2);
        kVar.b();
    }

    public final void q(View view) {
        s1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(launcher.powerkuy.growlauncher.R.id.decor_content_parent);
        this.f7887c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(launcher.powerkuy.growlauncher.R.id.action_bar);
        if (callbackFindViewById instanceof s1) {
            wrapper = (s1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f7889e = wrapper;
        this.f7890f = (ActionBarContextView) view.findViewById(launcher.powerkuy.growlauncher.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(launcher.powerkuy.growlauncher.R.id.action_bar_container);
        this.f7888d = actionBarContainer;
        s1 s1Var = this.f7889e;
        if (s1Var == null || this.f7890f == null || actionBarContainer == null) {
            throw new IllegalStateException(p0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((s3) s1Var).f1000a.getContext();
        this.f7885a = context;
        if ((((s3) this.f7889e).f1001b & 4) != 0) {
            this.f7892h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f7889e.getClass();
        r(context.getResources().getBoolean(launcher.powerkuy.growlauncher.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f7885a.obtainStyledAttributes(null, h.a.f7245a, launcher.powerkuy.growlauncher.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7887c;
            if (!actionBarOverlayLayout2.f777x) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f7904u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f7888d;
            WeakHashMap weakHashMap = z0.f15140a;
            s3.o0.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void r(boolean z3) {
        if (z3) {
            this.f7888d.setTabContainer(null);
            ((s3) this.f7889e).getClass();
        } else {
            ((s3) this.f7889e).getClass();
            this.f7888d.setTabContainer(null);
        }
        this.f7889e.getClass();
        ((s3) this.f7889e).f1000a.setCollapsible(false);
        this.f7887c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z3) {
        boolean z10 = this.f7899p;
        boolean z11 = this.f7900q;
        final l5.o oVar = this.f7906x;
        View view = this.f7891g;
        if (!z11 && z10) {
            if (this.f7901r) {
                this.f7901r = false;
                l.k kVar = this.f7902s;
                if (kVar != null) {
                    kVar.a();
                }
                int i10 = this.f7897n;
                n0 n0Var = this.f7905v;
                if (i10 != 0 || (!this.f7903t && !z3)) {
                    n0Var.c();
                    return;
                }
                this.f7888d.setAlpha(1.0f);
                this.f7888d.setTransitioning(true);
                l.k kVar2 = new l.k();
                float f9 = -this.f7888d.getHeight();
                if (z3) {
                    this.f7888d.getLocationInWindow(new int[]{0, 0});
                    f9 -= r12[1];
                }
                h1 h1VarA = z0.a(this.f7888d);
                h1VarA.e(f9);
                final View view2 = (View) h1VarA.f15072a.get();
                if (view2 != null) {
                    g1.a(view2.animate(), oVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: s3.f1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((i.p0) oVar.f9810i).f7888d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z12 = kVar2.f9721e;
                ArrayList arrayList = kVar2.f9717a;
                if (!z12) {
                    arrayList.add(h1VarA);
                }
                if (this.f7898o && view != null) {
                    h1 h1VarA2 = z0.a(view);
                    h1VarA2.e(f9);
                    if (!kVar2.f9721e) {
                        arrayList.add(h1VarA2);
                    }
                }
                boolean z13 = kVar2.f9721e;
                if (!z13) {
                    kVar2.f9719c = f7883y;
                }
                if (!z13) {
                    kVar2.f9718b = 250L;
                }
                if (!z13) {
                    kVar2.f9720d = n0Var;
                }
                this.f7902s = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f7901r) {
            return;
        }
        this.f7901r = true;
        l.k kVar3 = this.f7902s;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f7888d.setVisibility(0);
        int i11 = this.f7897n;
        n0 n0Var2 = this.w;
        if (i11 == 0 && (this.f7903t || z3)) {
            this.f7888d.setTranslationY(0.0f);
            float f10 = -this.f7888d.getHeight();
            if (z3) {
                this.f7888d.getLocationInWindow(new int[]{0, 0});
                f10 -= r12[1];
            }
            this.f7888d.setTranslationY(f10);
            l.k kVar4 = new l.k();
            h1 h1VarA3 = z0.a(this.f7888d);
            h1VarA3.e(0.0f);
            final View view3 = (View) h1VarA3.f15072a.get();
            if (view3 != null) {
                g1.a(view3.animate(), oVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: s3.f1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((i.p0) oVar.f9810i).f7888d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z14 = kVar4.f9721e;
            ArrayList arrayList2 = kVar4.f9717a;
            if (!z14) {
                arrayList2.add(h1VarA3);
            }
            if (this.f7898o && view != null) {
                view.setTranslationY(f10);
                h1 h1VarA4 = z0.a(view);
                h1VarA4.e(0.0f);
                if (!kVar4.f9721e) {
                    arrayList2.add(h1VarA4);
                }
            }
            boolean z15 = kVar4.f9721e;
            if (!z15) {
                kVar4.f9719c = f7884z;
            }
            if (!z15) {
                kVar4.f9718b = 250L;
            }
            if (!z15) {
                kVar4.f9720d = n0Var2;
            }
            this.f7902s = kVar4;
            kVar4.b();
        } else {
            this.f7888d.setAlpha(1.0f);
            this.f7888d.setTranslationY(0.0f);
            if (this.f7898o && view != null) {
                view.setTranslationY(0.0f);
            }
            n0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7887c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = z0.f15140a;
            s3.m0.c(actionBarOverlayLayout);
        }
    }

    public p0(Dialog dialog) {
        new ArrayList();
        this.f7896m = new ArrayList();
        this.f7897n = 0;
        this.f7898o = true;
        this.f7901r = true;
        this.f7905v = new n0(this, 0);
        this.w = new n0(this, 1);
        this.f7906x = new l5.o(this);
        q(dialog.getWindow().getDecorView());
    }
}
