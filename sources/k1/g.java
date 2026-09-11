package k1;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f9037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f9038s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9039i;

    static {
        int i10 = 0;
        f9037r = new g(i10, 0);
        f9038s = new g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        super(i10);
        this.f9039i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f9039i) {
            case 0:
                return new g1.j(new PathMeasure());
            default:
                return qg.o.f13926a;
        }
    }
}
