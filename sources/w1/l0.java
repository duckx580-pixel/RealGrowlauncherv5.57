package w1;

import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements eh.a {
    public static final l0 A;
    public static final l0 B;
    public static final l0 C;
    public static final l0 D;
    public static final l0 E;
    public static final l0 F;
    public static final l0 G;
    public static final l0 H;
    public static final l0 I;
    public static final l0 J;
    public static final l0 K;
    public static final l0 L;
    public static final l0 M;
    public static final l0 N;
    public static final l0 O;
    public static final l0 P;
    public static final l0 Q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l0 f18838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l0 f18839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l0 f18840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l0 f18841u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l0 f18842v;
    public static final l0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l0 f18843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final l0 f18844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final l0 f18845z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18846i;

    static {
        int i10 = 0;
        f18838r = new l0(i10, 0);
        f18839s = new l0(i10, 1);
        f18840t = new l0(i10, 2);
        f18841u = new l0(i10, 3);
        f18842v = new l0(i10, 4);
        w = new l0(i10, 5);
        f18843x = new l0(i10, 6);
        f18844y = new l0(i10, 7);
        f18845z = new l0(i10, 8);
        A = new l0(i10, 9);
        B = new l0(i10, 10);
        C = new l0(i10, 11);
        D = new l0(i10, 12);
        E = new l0(i10, 13);
        F = new l0(i10, 14);
        G = new l0(i10, 15);
        H = new l0(i10, 16);
        I = new l0(i10, 17);
        J = new l0(i10, 18);
        K = new l0(i10, 19);
        L = new l0(i10, 20);
        M = new l0(i10, 21);
        N = new l0(i10, 22);
        O = new l0(i10, 23);
        P = new l0(i10, 24);
        Q = new l0(i10, 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i10, int i11) {
        super(i10);
        this.f18846i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        Choreographer choreographer;
        ug.c cVar = null;
        switch (this.f18846i) {
            case 0:
                n0.b("LocalConfiguration");
                throw null;
            case 1:
                n0.b("LocalContext");
                throw null;
            case 2:
                n0.b("LocalImageVectorCache");
                throw null;
            case 3:
                n0.b("LocalLifecycleOwner");
                throw null;
            case 4:
                n0.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                n0.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    vh.d dVar = oh.f0.f12869a;
                    choreographer = (Choreographer) oh.x.w(th.m.f17224a, new fe.f(2, cVar, 5));
                }
                q0 q0Var = new q0(choreographer, xd.c.k(Looper.getMainLooper()));
                return android.support.v4.media.session.b.s(q0Var, q0Var.B);
            case 7:
            case 8:
                return null;
            case 9:
                b1.b("LocalAutofillTree");
                throw null;
            case 10:
                b1.b("LocalClipboardManager");
                throw null;
            case 11:
                b1.b("LocalDensity");
                throw null;
            case 12:
                b1.b("LocalFocusManager");
                throw null;
            case 13:
                b1.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                b1.b("LocalFontLoader");
                throw null;
            case 15:
                b1.b("LocalHapticFeedback");
                throw null;
            case 16:
                b1.b("LocalInputManager");
                throw null;
            case 17:
                b1.b("LocalLayoutDirection");
                throw null;
            case 18:
            case 19:
            case 20:
                return null;
            case 21:
                b1.b("LocalTextToolbar");
                throw null;
            case 22:
                b1.b("LocalUriHandler");
                throw null;
            case 23:
                b1.b("LocalViewConfiguration");
                throw null;
            case 24:
                b1.b("LocalWindowInfo");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
