package b0;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o0.d2;
import t.c1;
import t.f1;
import t.y0;
import t.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements o0.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2479c;

    public /* synthetic */ p0(int i10, Object obj, Object obj2) {
        this.f2477a = i10;
        this.f2478b = obj;
        this.f2479c = obj2;
    }

    @Override // o0.c0
    public final void dispose() {
        int i10 = this.f2477a;
        Object obj = this.f2479c;
        Object obj2 = this.f2478b;
        switch (i10) {
            case 0:
                ((r0) obj2).f2495c.add(obj);
                break;
            case 1:
                o0.s0 s0Var = (o0.s0) obj2;
                x.n nVar = (x.n) s0Var.getValue();
                if (nVar != null) {
                    x.m mVar = new x.m(nVar);
                    x.l lVar = (x.l) obj;
                    if (lVar != null) {
                        lVar.c(mVar);
                    }
                    s0Var.setValue(null);
                }
                break;
            case 2:
                ((r4.k) obj2).f14522x.c((s4.j) obj);
                break;
            case 3:
                Iterator it = ((List) ((d2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((s4.i) obj).b().b((r4.k) it.next());
                }
                break;
            case 4:
                ((t.f0) obj2).f16072a.n((t.d0) obj);
                break;
            case 5:
                ((f1) obj2).f16084i.remove((f1) obj);
                break;
            case 6:
                f1 f1Var = (f1) obj2;
                y0 y0Var = (y0) ((z0) obj).f16227b.getValue();
                if (y0Var != null) {
                    f1Var.f16083h.remove(y0Var.f16222i);
                }
                break;
            case 7:
                ((f1) obj2).f16083h.remove((c1) obj);
                break;
            case 8:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((w1.m0) obj);
                break;
            default:
                y.z0 z0Var = (y.z0) obj2;
                View view = (View) obj;
                int i11 = z0Var.f20027s - 1;
                z0Var.f20027s = i11;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = s3.z0.f15140a;
                    s3.o0.u(view, null);
                    s3.z0.m(view, null);
                    view.removeOnAttachStateChangeListener(z0Var.f20028t);
                }
                break;
        }
    }
}
