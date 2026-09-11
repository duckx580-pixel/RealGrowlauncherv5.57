package y;

import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.m implements eh.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e0 f19933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e0 f19934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e0 f19935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e0 f19936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e0 f19937v;
    public static final e0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e0 f19938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e0 f19939y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19940i;

    static {
        int i10 = 3;
        f19933r = new e0(i10, 0);
        f19934s = new e0(i10, 1);
        f19935t = new e0(i10, 2);
        f19936u = new e0(i10, 3);
        f19937v = new e0(i10, 4);
        w = new e0(i10, 5);
        f19938x = new e0(i10, 6);
        f19939y = new e0(i10, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i10, int i11) {
        super(i10);
        this.f19940i = i11;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19940i) {
            case 0:
                return Integer.valueOf(u5.f.h((List) obj, h.f19944s, h.f19945t, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 1, 2));
            case 1:
                return Integer.valueOf(u5.f.h((List) obj, h.f19946u, h.f19947v, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 1, 1));
            case 2:
                return Integer.valueOf(u5.f.h((List) obj, h.w, h.f19948x, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 1, 2));
            case 3:
                return Integer.valueOf(u5.f.h((List) obj, h.f19949y, h.f19950z, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 1, 1));
            case 4:
                return Integer.valueOf(u5.f.h((List) obj, h.A, h.B, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 2, 2));
            case 5:
                return Integer.valueOf(u5.f.h((List) obj, h.C, h.D, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 2, 1));
            case 6:
                return Integer.valueOf(u5.f.h((List) obj, h.E, h.F, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 2, 2));
            case 7:
                return Integer.valueOf(u5.f.h((List) obj, h.G, h.H, ((Number) obj2).intValue(), ((Number) obj3).intValue(), 2, 1));
            default:
                o0.o oVar = (o0.o) obj2;
                ((Number) obj3).intValue();
                oVar.U(359872873);
                WeakHashMap weakHashMap = z0.f20009u;
                z0 z0VarE = b.e(oVar);
                oVar.U(1157296644);
                boolean zF = oVar.f(z0VarE);
                Object objL = oVar.L();
                if (zF || objL == o0.k.f12458a) {
                    objL = new a0(z0VarE.f20012c);
                    oVar.g0(objL);
                }
                oVar.r(false);
                a0 a0Var = (a0) objL;
                oVar.r(false);
                return a0Var;
        }
    }
}
