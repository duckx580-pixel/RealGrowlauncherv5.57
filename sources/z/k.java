package z;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f20513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f20514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f20515t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20516i;

    static {
        int i10 = 1;
        f20513r = new k(i10, 0);
        f20514s = new k(i10, 1);
        f20515t = new k(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f20516i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f20516i) {
            case 0:
                return qg.o.f13926a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new q(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
