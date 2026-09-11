package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14906i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f14907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f14908s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(d0 d0Var, long j, int i10) {
        super(1);
        this.f14906i = i10;
        this.f14907r = d0Var;
        this.f14908s = j;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [eh.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v32, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // eh.c
    public final Object invoke(Object obj) {
        int iOrdinal;
        long jB;
        int i10 = this.f14906i;
        long j = this.f14908s;
        d0 d0Var = this.f14907r;
        switch (i10) {
            case 0:
                int iOrdinal2 = ((v) obj).ordinal();
                if (iOrdinal2 == 0) {
                    t tVar = d0Var.H.f14931a.f14981c;
                    if (tVar != null) {
                        j = ((q2.k) tVar.f14987b.invoke(new q2.k(j))).f13751a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new a2.d();
                    }
                    t tVar2 = d0Var.I.f14940a.f14981c;
                    if (tVar2 != null) {
                        j = ((q2.k) tVar2.f14987b.invoke(new q2.k(j))).f13751a;
                    }
                }
                return new q2.k(j);
            case 1:
                v vVar = (v) obj;
                if (d0Var.L == null || d0Var.G0() == null || kotlin.jvm.internal.l.a(d0Var.L, d0Var.G0()) || (iOrdinal = vVar.ordinal()) == 0 || iOrdinal == 1) {
                    jB = q2.i.f13744b;
                } else {
                    if (iOrdinal != 2) {
                        throw new a2.d();
                    }
                    t tVar3 = d0Var.I.f14940a.f14981c;
                    if (tVar3 != null) {
                        eh.c cVar = tVar3.f14987b;
                        long j10 = this.f14908s;
                        long j11 = ((q2.k) cVar.invoke(new q2.k(j10))).f13751a;
                        a1.d dVarG0 = d0Var.G0();
                        kotlin.jvm.internal.l.c(dVarG0);
                        q2.l lVar = q2.l.f13752i;
                        long jA = dVarG0.a(j10, j11, lVar);
                        a1.d dVar = d0Var.L;
                        kotlin.jvm.internal.l.c(dVar);
                        long jA2 = dVar.a(j10, j11, lVar);
                        int i11 = q2.i.f13745c;
                        jB = t6.k.b(((int) (jA >> 32)) - ((int) (jA2 >> 32)), ((int) (jA & 4294967295L)) - ((int) (jA2 & 4294967295L)));
                    } else {
                        jB = q2.i.f13744b;
                    }
                }
                return new q2.i(jB);
            default:
                v vVar2 = (v) obj;
                n0 n0Var = d0Var.H.f14931a.f14980b;
                long j12 = n0Var != null ? ((q2.i) n0Var.f14964a.invoke(new q2.k(j))).f13746a : q2.i.f13744b;
                n0 n0Var2 = d0Var.I.f14940a.f14980b;
                long j13 = n0Var2 != null ? ((q2.i) n0Var2.f14964a.invoke(new q2.k(j))).f13746a : q2.i.f13744b;
                int iOrdinal3 = vVar2.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        j12 = q2.i.f13744b;
                    } else {
                        if (iOrdinal3 != 2) {
                            throw new a2.d();
                        }
                        j12 = j13;
                    }
                }
                return new q2.i(j12);
        }
    }
}
