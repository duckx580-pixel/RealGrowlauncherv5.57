package w1;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0.e2 f18755a = new o0.e2(l0.f18844y);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0.e2 f18756b = new o0.e2(l0.f18845z);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0.e2 f18757c = new o0.e2(l0.A);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0.e2 f18758d = new o0.e2(l0.B);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0.e2 f18759e = new o0.e2(l0.C);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o0.e2 f18760f = new o0.e2(l0.D);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o0.e2 f18761g = new o0.e2(l0.F);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o0.e2 f18762h = new o0.e2(l0.E);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o0.e2 f18763i = new o0.e2(l0.G);
    public static final o0.e2 j = new o0.e2(l0.H);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o0.e2 f18764k = new o0.e2(l0.I);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o0.e2 f18765l = new o0.e2(l0.L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o0.e2 f18766m = new o0.e2(l0.K);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o0.e2 f18767n = new o0.e2(l0.M);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o0.e2 f18768o = new o0.e2(l0.N);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o0.e2 f18769p = new o0.e2(l0.O);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o0.e2 f18770q = new o0.e2(l0.P);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o0.e2 f18771r = new o0.e2(l0.J);

    public static final void a(v1.y0 y0Var, r0 r0Var, eh.e eVar, o0.o oVar, int i10) {
        oVar.V(874662829);
        int i11 = i10 | (oVar.h(eVar) ? 256 : 128);
        if ((i11 & 731) == 146 && oVar.D()) {
            oVar.P();
        } else {
            t tVar = (t) y0Var;
            o0.g1 g1VarA = f18755a.a(tVar.getAccessibilityManager());
            o0.g1 g1VarA2 = f18756b.a(tVar.getAutofill());
            o0.g1 g1VarA3 = f18757c.a(tVar.getAutofillTree());
            o0.g1 g1VarA4 = f18758d.a(tVar.m115getClipboardManager());
            o0.g1 g1VarA5 = f18759e.a(tVar.getDensity());
            o0.g1 g1VarA6 = f18760f.a(tVar.getFocusOwner());
            i2.m fontLoader = tVar.getFontLoader();
            o0.e2 e2Var = f18761g;
            e2Var.getClass();
            o0.g1 g1Var = new o0.g1(e2Var, fontLoader, false);
            i2.n fontFamilyResolver = tVar.getFontFamilyResolver();
            o0.e2 e2Var2 = f18762h;
            e2Var2.getClass();
            o0.p.b(new o0.g1[]{g1VarA, g1VarA2, g1VarA3, g1VarA4, g1VarA5, g1VarA6, g1Var, new o0.g1(e2Var2, fontFamilyResolver, false), f18763i.a(tVar.getHapticFeedBack()), j.a(tVar.getInputModeManager()), f18764k.a(tVar.getLayoutDirection()), f18765l.a(tVar.getTextInputService()), f18766m.a(tVar.getSoftwareKeyboardController()), f18767n.a(tVar.getTextToolbar()), f18768o.a(r0Var), f18769p.a(tVar.getViewConfiguration()), f18770q.a(tVar.getWindowInfo()), f18771r.a(tVar.getPointerIconService())}, eVar, oVar, ((i11 >> 3) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 8);
        }
        o0.h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new b0.f0(y0Var, r0Var, eVar, i10, 8);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final o0.e2 c() {
        return f18759e;
    }
}
