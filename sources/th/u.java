package th;

import oh.o1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f17231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f17232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f17233t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17234i;

    static {
        int i10 = 2;
        f17231r = new u(i10, 0);
        f17232s = new u(i10, 1);
        f17233t = new u(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, int i11) {
        super(i10);
        this.f17234i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17234i) {
            case 0:
                ug.f fVar = (ug.f) obj2;
                if (!(fVar instanceof o1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar : Integer.valueOf(iIntValue + 1);
            case 1:
                o1 o1Var = (o1) obj;
                ug.f fVar2 = (ug.f) obj2;
                if (o1Var != null) {
                    return o1Var;
                }
                if (fVar2 instanceof o1) {
                    return (o1) fVar2;
                }
                return null;
            default:
                return (w) obj;
        }
    }
}
