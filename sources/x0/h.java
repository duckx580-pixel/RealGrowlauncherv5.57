package x0;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f19361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f19362s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19363i;

    static {
        int i10 = 0;
        f19361r = new h(i10, 0);
        f19362s = new h(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f19363i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f19363i) {
            case 0:
                return new g(new LinkedHashMap());
            default:
                return null;
        }
    }
}
