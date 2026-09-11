package lc;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f9929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f9930s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9931i;

    static {
        int i10 = 1;
        f9929r = new u(i10, 0);
        f9930s = new u(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, int i11) {
        super(i10);
        this.f9931i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f9931i) {
            case 0:
                break;
            default:
                kotlin.jvm.internal.l.f("it", (String) obj);
                break;
        }
        return qg.o.f13926a;
    }
}
