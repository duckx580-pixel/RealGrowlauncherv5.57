package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.m implements eh.c {
    public static final v0 A;
    public static final v0 B;
    public static final v0 C;
    public static final v0 D;
    public static final v0 E;
    public static final v0 F;
    public static final v0 G;
    public static final v0 H;
    public static final v0 I;
    public static final v0 J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v0 f16198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v0 f16199s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v0 f16200t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v0 f16201u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v0 f16202v;
    public static final v0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v0 f16203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v0 f16204y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final v0 f16205z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16206i;

    static {
        int i10 = 1;
        f16198r = new v0(i10, 0);
        f16199s = new v0(i10, 1);
        f16200t = new v0(i10, 2);
        f16201u = new v0(i10, 3);
        f16202v = new v0(i10, 4);
        w = new v0(i10, 5);
        f16203x = new v0(i10, 6);
        f16204y = new v0(i10, 7);
        f16205z = new v0(i10, 8);
        A = new v0(i10, 9);
        B = new v0(i10, 10);
        C = new v0(i10, 11);
        D = new v0(i10, 12);
        E = new v0(i10, 13);
        F = new v0(i10, 14);
        G = new v0(i10, 15);
        H = new v0(i10, 16);
        I = new v0(i10, 17);
        J = new v0(i10, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i10, int i11) {
        super(i10);
        this.f16206i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f16206i) {
            case 0:
                return qg.o.f13926a;
            case 1:
                long j = ((q2.f) obj).f13738a;
                return new l(q2.f.a(j), q2.f.b(j));
            case 2:
                l lVar = (l) obj;
                return new q2.f(sb.c.b(lVar.f16135a, lVar.f16136b));
            case 3:
                return new k(((q2.e) obj).f13735i);
            case 4:
                return new q2.e(((k) obj).f16122a);
            case 5:
                return new k(((Number) obj).floatValue());
            case 6:
                return Float.valueOf(((k) obj).f16122a);
            case 7:
                long j10 = ((q2.i) obj).f13746a;
                int i10 = q2.i.f13745c;
                return new l((int) (j10 >> 32), (int) (4294967295L & j10));
            case 8:
                l lVar2 = (l) obj;
                return new q2.i(t6.k.b(gh.a.z(lVar2.f16135a), gh.a.z(lVar2.f16136b)));
            case 9:
                long j11 = ((q2.k) obj).f13751a;
                return new l((int) (j11 >> 32), (int) (4294967295L & j11));
            case 10:
                l lVar3 = (l) obj;
                return new q2.k(te.a.c(gh.a.z(lVar3.f16135a), gh.a.z(lVar3.f16136b)));
            case 11:
                return new k(((Number) obj).intValue());
            case 12:
                return Integer.valueOf((int) ((k) obj).f16122a);
            case 13:
                long j12 = ((f1.c) obj).f5977a;
                return new l(f1.c.d(j12), f1.c.e(j12));
            case 14:
                l lVar4 = (l) obj;
                return new f1.c(vd.a.b(lVar4.f16135a, lVar4.f16136b));
            case 15:
                f1.d dVar = (f1.d) obj;
                return new n(dVar.f5979a, dVar.f5980b, dVar.f5981c, dVar.f5982d);
            case 16:
                n nVar = (n) obj;
                return new f1.d(nVar.f16144a, nVar.f16145b, nVar.f16146c, nVar.f16147d);
            case 17:
                long j13 = ((f1.f) obj).f5994a;
                return new l(f1.f.d(j13), f1.f.b(j13));
            default:
                l lVar5 = (l) obj;
                return new f1.f(a.a.h(lVar5.f16135a, lVar5.f16136b));
        }
    }
}
