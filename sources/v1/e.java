package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements eh.c {
    public static final e A;
    public static final e B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f18376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f18377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f18378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f18379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f18380v;
    public static final e w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f18381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f18382y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f18383z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18384i;

    static {
        int i10 = 1;
        f18376r = new e(i10, 0);
        f18377s = new e(i10, 1);
        f18378t = new e(i10, 2);
        f18379u = new e(i10, 3);
        f18380v = new e(i10, 4);
        w = new e(i10, 5);
        f18381x = new e(i10, 6);
        f18382y = new e(i10, 7);
        f18383z = new e(i10, 8);
        A = new e(i10, 9);
        B = new e(i10, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f18384i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f18384i) {
            case 0:
                ((c) obj).I0();
                break;
            case 1:
                x0 x0Var = ((t0) obj).Q;
                if (x0Var != null) {
                    x0Var.invalidate();
                }
                break;
            case 2:
                t0 t0Var = (t0) obj;
                if (t0Var.w()) {
                    u uVar = t0Var.M;
                    if (uVar == null) {
                        t0Var.c1(true);
                    } else {
                        u uVar2 = t0.S;
                        uVar2.getClass();
                        uVar2.f18491a = uVar.f18491a;
                        uVar2.f18492b = uVar.f18492b;
                        uVar2.f18493c = uVar.f18493c;
                        uVar2.f18494d = uVar.f18494d;
                        uVar2.f18495e = uVar.f18495e;
                        t0Var.c1(true);
                        if (uVar2.f18491a != uVar.f18491a || uVar2.f18492b != uVar.f18492b || uVar2.f18493c != uVar.f18493c || uVar2.f18494d != uVar.f18494d || uVar2.f18495e != uVar.f18495e) {
                            androidx.compose.ui.node.a aVar = t0Var.f18489y;
                            i0 i0Var = aVar.N;
                            if (i0Var.f18433n > 0) {
                                if (i0Var.f18432m || i0Var.f18431l) {
                                    aVar.O(false);
                                }
                                i0Var.f18434o.q0();
                            }
                            y0 y0Var = aVar.f1250y;
                            if (y0Var != null) {
                                w1.t tVar = (w1.t) y0Var;
                                ((q0.f) tVar.U.f18457d.f17648r).b(aVar);
                                aVar.U = true;
                                tVar.A(null);
                            }
                        }
                    }
                }
                break;
            case 3:
                v0 v0Var = (v0) obj;
                if (v0Var.w()) {
                    v0Var.f18496i.d0();
                }
                break;
            case 4:
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj;
                if (aVar2.C()) {
                    aVar2.O(false);
                }
                break;
            case 5:
                androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) obj;
                if (aVar3.C()) {
                    aVar3.O(false);
                }
                break;
            case 6:
                androidx.compose.ui.node.a aVar4 = (androidx.compose.ui.node.a) obj;
                if (aVar4.C()) {
                    aVar4.M(false);
                }
                break;
            case 7:
                androidx.compose.ui.node.a aVar5 = (androidx.compose.ui.node.a) obj;
                if (aVar5.C()) {
                    aVar5.M(false);
                }
                break;
            case 8:
                androidx.compose.ui.node.a aVar6 = (androidx.compose.ui.node.a) obj;
                if (aVar6.C()) {
                    androidx.compose.ui.node.a.N(aVar6, false, 3);
                }
                break;
            case 9:
                androidx.compose.ui.node.a aVar7 = (androidx.compose.ui.node.a) obj;
                if (aVar7.C()) {
                    androidx.compose.ui.node.a.P(aVar7, false, 3);
                }
                break;
            default:
                androidx.compose.ui.node.a aVar8 = (androidx.compose.ui.node.a) obj;
                if (aVar8.C()) {
                    aVar8.A();
                }
                break;
        }
        return qg.o.f13926a;
    }
}
