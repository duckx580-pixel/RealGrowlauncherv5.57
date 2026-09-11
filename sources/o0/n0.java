package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements ug.g, z1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ n0 f12507r = new n0(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n0 f12508s = new n0(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n0 f12509t = new n0(2);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n0 f12510u = new n0(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12511i;

    public /* synthetic */ n0(int i10) {
        this.f12511i = i10;
    }

    public static final void b(n0 n0Var) {
        rh.h1 h1Var;
        r0.e eVar;
        u0.b bVar;
        rh.h1 h1Var2 = l1.f12476v;
        do {
            h1Var = l1.f12476v;
            eVar = (r0.e) h1Var.getValue();
            bVar = (u0.b) eVar;
            t0.c cVarB = bVar.f17550s;
            u0.a aVar = (u0.a) cVarB.get(n0Var);
            if (aVar != null) {
                Object obj = aVar.f17545a;
                Object obj2 = aVar.f17546b;
                t0.k kVar = cVarB.f16234i;
                t0.k kVarV = kVar.v(n0Var != null ? n0Var.hashCode() : 0, 0, n0Var);
                if (kVar != kVarV) {
                    cVarB = kVarV == null ? t0.c.f16233s : new t0.c(kVarV, cVarB.f16235r - 1);
                }
                v0.b bVar2 = v0.b.f18353a;
                if (obj != bVar2) {
                    Object obj3 = cVarB.get(obj);
                    kotlin.jvm.internal.l.c(obj3);
                    cVarB = cVarB.b(obj, new u0.a(((u0.a) obj3).f17545a, obj2));
                }
                if (obj2 != bVar2) {
                    Object obj4 = cVarB.get(obj2);
                    kotlin.jvm.internal.l.c(obj4);
                    cVarB = cVarB.b(obj2, new u0.a(obj, ((u0.a) obj4).f17546b));
                }
                Object obj5 = obj != bVar2 ? bVar.f17548i : obj2;
                if (obj2 != bVar2) {
                    obj = bVar.f17549r;
                }
                bVar = new u0.b(obj5, obj, cVarB);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!h1Var.i(eVar, bVar));
    }

    @Override // o0.z1
    public boolean a(Object obj, Object obj2) {
        switch (this.f12511i) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f12511i) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
                return "StructuralEqualityPolicy";
            case 4:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
