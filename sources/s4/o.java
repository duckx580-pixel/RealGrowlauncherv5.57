package s4;

import s.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f15162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f15163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f15164t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15165i;

    static {
        int i10 = 1;
        f15162r = new o(i10, 0);
        f15163s = new o(i10, 1);
        f15164t = new o(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11) {
        super(i10);
        this.f15165i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f15165i) {
            case 0:
                return ((r4.k) obj).f14521v;
            case 1:
                return z.c(t.d.n(700, 0, null, 6), 2);
            default:
                return z.d(t.d.n(700, 0, null, 6), 2);
        }
    }
}
