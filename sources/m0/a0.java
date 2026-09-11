package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y.n0 f10344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y.n0 f10345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f10346c = 58;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f10347d = 40;

    static {
        float f9 = 24;
        float f10 = 8;
        f10344a = new y.n0(f9, f10, f9, f10);
        float f11 = 12;
        f10345b = new y.n0(f11, f10, f11, f10);
        float f12 = n0.k.f11993a;
    }

    public static z a(long j, o0.o oVar, int i10) {
        oVar.U(-339300779);
        if ((i10 & 1) != 0) {
            float f9 = n0.k.f11993a;
            j = g1.e(20, oVar);
        }
        z zVar = new z(j, g1.e(n0.k.f12000h, oVar), g1.t.b(g1.e(n0.k.f11995c, oVar), 0.12f), g1.t.b(g1.e(n0.k.f11997e, oVar), 0.38f));
        oVar.r(false);
        return zVar;
    }

    public static z b(long j, o0.o oVar, int i10) {
        oVar.U(1670757653);
        if ((i10 & 1) != 0) {
            float f9 = n0.n.f12011a;
            j = g1.e(24, oVar);
        }
        z zVar = new z(j, g1.e(n0.n.f12016f, oVar), g1.t.b(g1.e(n0.n.f12012b, oVar), 0.12f), g1.t.b(g1.e(n0.n.f12013c, oVar), 0.38f));
        oVar.r(false);
        return zVar;
    }

    public static z c(long j, o0.o oVar, int i10) {
        oVar.U(-1778526249);
        long j10 = g1.t.f6915m;
        if ((i10 & 2) != 0) {
            float f9 = n0.v.f12068a;
            j = g1.e(20, oVar);
        }
        long j11 = j;
        float f10 = n0.v.f12068a;
        z zVar = new z(j10, j11, j10, g1.t.b(g1.e(14, oVar), 0.38f));
        oVar.r(false);
        return zVar;
    }

    public static z d(long j, o0.o oVar, int i10) {
        oVar.U(-1402274782);
        long j10 = g1.t.f6915m;
        if ((i10 & 2) != 0) {
            j = g1.e(20, oVar);
        }
        z zVar = new z(j10, j, j10, g1.t.b(g1.e(14, oVar), 0.38f));
        oVar.r(false);
        return zVar;
    }
}
