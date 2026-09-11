package x0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f19351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f19352s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19353i;

    static {
        int i10 = 1;
        f19351r = new e(i10, 0);
        f19352s = new e(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f19353i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f19353i) {
            case 0:
                return new g((Map) obj);
            default:
                return obj;
        }
    }
}
