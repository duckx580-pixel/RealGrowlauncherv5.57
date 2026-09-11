package v1;

import w1.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f18401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f18402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f18403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f18404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f18405v;
    public static final h w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f18406x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18407i;

    static {
        int i10 = 2;
        f18401r = new h(i10, 0);
        f18402s = new h(i10, 1);
        f18403t = new h(i10, 2);
        f18404u = new h(i10, 3);
        f18405v = new h(i10, 4);
        w = new h(i10, 5);
        f18406x = new h(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f18407i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18407i) {
            case 0:
                ((Number) obj2).intValue();
                ((j) obj).getClass();
                break;
            case 1:
                ((androidx.compose.ui.node.a) ((j) obj)).U((q2.b) obj2);
                break;
            case 2:
                q2.l lVar = (q2.l) obj2;
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) ((j) obj);
                if (aVar.I != lVar) {
                    aVar.I = lVar;
                    aVar.z();
                    androidx.compose.ui.node.a aVarQ = aVar.q();
                    if (aVarQ != null) {
                        aVarQ.x();
                    }
                    aVar.y();
                }
                break;
            case 3:
                ((androidx.compose.ui.node.a) ((j) obj)).W((t1.h0) obj2);
                break;
            case 4:
                ((androidx.compose.ui.node.a) ((j) obj)).X((a1.n) obj2);
                break;
            case 5:
                ((androidx.compose.ui.node.a) ((j) obj)).T((o0.v) obj2);
                break;
            default:
                ((androidx.compose.ui.node.a) ((j) obj)).Y((d2) obj2);
                break;
        }
        return qg.o.f13926a;
    }
}
