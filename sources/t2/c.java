package t2;

import java.util.WeakHashMap;
import qg.o;
import s3.i0;
import s3.z0;
import v1.y0;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16365i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f16366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.node.a f16367s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(n nVar, androidx.compose.ui.node.a aVar, int i10) {
        super(1);
        this.f16365i = i10;
        this.f16366r = nVar;
        this.f16367s = aVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10 = this.f16365i;
        o oVar = o.f13926a;
        androidx.compose.ui.node.a aVar = this.f16367s;
        n nVar = this.f16366r;
        switch (i10) {
            case 0:
                y0 y0Var = (y0) obj;
                t tVar = y0Var instanceof t ? (t) y0Var : null;
                if (tVar != null) {
                    tVar.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(nVar, aVar);
                    tVar.getAndroidViewsHandler$ui_release().addView(nVar);
                    tVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(aVar, nVar);
                    WeakHashMap weakHashMap = z0.f15140a;
                    i0.s(nVar, 1);
                    z0.k(nVar, new w1.n(tVar, aVar, tVar));
                }
                if (nVar.getView().getParent() != nVar) {
                    nVar.addView(nVar.getView());
                }
                break;
            case 1:
                j.c(nVar, aVar);
                break;
            default:
                j.c(nVar, aVar);
                break;
        }
        return oVar;
    }
}
