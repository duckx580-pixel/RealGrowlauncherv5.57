package c0;

import android.graphics.Rect;
import android.view.View;
import qg.o;
import t1.p;
import t1.w0;
import w1.n0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f3278i;

    public k(a aVar) {
        this.f3278i = aVar;
    }

    @Override // c0.d
    public final Object j0(p pVar, eh.a aVar, wg.c cVar) {
        View view = (View) v1.f.p(this.f3278i, n0.f18862f);
        long jK = w0.k(pVar);
        f1.d dVar = (f1.d) aVar.invoke();
        f1.d dVarF = dVar != null ? dVar.f(jK) : null;
        if (dVarF != null) {
            view.requestRectangleOnScreen(new Rect((int) dVarF.f5979a, (int) dVarF.f5980b, (int) dVarF.f5981c, (int) dVarF.f5982d), false);
        }
        return o.f13926a;
    }
}
