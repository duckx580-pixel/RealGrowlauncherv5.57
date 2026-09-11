package t2;

import androidx.lifecycle.v;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f16390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f16391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f16392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f16393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f16394v;
    public static final k w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f16395x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16396i;

    static {
        int i10 = 2;
        f16390r = new k(i10, 0);
        f16391s = new k(i10, 1);
        f16392t = new k(i10, 2);
        f16393u = new k(i10, 3);
        f16394v = new k(i10, 4);
        w = new k(i10, 5);
        f16395x = new k(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f16396i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        switch (this.f16396i) {
            case 0:
                j.d((androidx.compose.ui.node.a) obj).setUpdateBlock((eh.c) obj2);
                return o.f13926a;
            case 1:
                j.d((androidx.compose.ui.node.a) obj).setReleaseBlock((eh.c) obj2);
                return o.f13926a;
            case 2:
                j.d((androidx.compose.ui.node.a) obj).setModifier((a1.n) obj2);
                return o.f13926a;
            case 3:
                j.d((androidx.compose.ui.node.a) obj).setDensity((q2.b) obj2);
                return o.f13926a;
            case 4:
                j.d((androidx.compose.ui.node.a) obj).setLifecycleOwner((v) obj2);
                return o.f13926a;
            case 5:
                j.d((androidx.compose.ui.node.a) obj).setSavedStateRegistryOwner((a5.h) obj2);
                return o.f13926a;
            default:
                n nVarD = j.d((androidx.compose.ui.node.a) obj);
                int iOrdinal = ((q2.l) obj2).ordinal();
                if (iOrdinal != 0) {
                    i10 = 1;
                    if (iOrdinal != 1) {
                        throw new a2.d();
                    }
                } else {
                    i10 = 0;
                }
                nVarD.setLayoutDirection(i10);
                return o.f13926a;
        }
    }
}
