package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f16280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f16281s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16282i;

    static {
        int i10 = 0;
        f16280r = new e(i10, 0);
        f16281s = new e(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f16282i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16282i) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return new androidx.compose.ui.node.a(3);
        }
    }
}
