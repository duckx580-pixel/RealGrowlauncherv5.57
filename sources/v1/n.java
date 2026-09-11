package v1;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f18451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n f18452s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18453i;

    static {
        int i10 = 0;
        f18451r = new n(i10, 0);
        f18452s = new n(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, int i11) {
        super(i10);
        this.f18453i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f18453i) {
            case 0:
                return new LinkedHashMap();
            default:
                return new androidx.compose.ui.node.a(3);
        }
    }
}
