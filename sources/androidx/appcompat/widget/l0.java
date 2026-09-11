package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f919i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f920r;

    public /* synthetic */ l0(int i10, Object obj) {
        this.f919i = i10;
        this.f920r = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f919i;
        Object obj = this.f920r;
        switch (i10) {
            case 0:
                w0 w0Var = (w0) obj;
                if (!w0Var.getInternalPopup().b()) {
                    w0Var.f1053v.o(n0.b(w0Var), n0.a(w0Var));
                }
                ViewTreeObserver viewTreeObserver = w0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    m0.a(viewTreeObserver, this);
                }
                break;
            case 1:
                t0 t0Var = (t0) obj;
                w0 w0Var2 = t0Var.V;
                t0Var.getClass();
                WeakHashMap weakHashMap = s3.z0.f15140a;
                if (s3.l0.b(w0Var2) && w0Var2.getGlobalVisibleRect(t0Var.T)) {
                    t0Var.s();
                    t0Var.g();
                } else {
                    t0Var.dismiss();
                }
                break;
            case 2:
                m.d dVar = (m.d) obj;
                ArrayList arrayList = dVar.f10254x;
                if (dVar.b() && arrayList.size() > 0 && !((m.c) arrayList.get(0)).f10245a.N) {
                    View view = dVar.E;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((m.c) it.next()).f10245a.g();
                        }
                    } else {
                        dVar.dismiss();
                    }
                    break;
                }
                break;
            default:
                m.b0 b0Var = (m.b0) obj;
                u2 u2Var = b0Var.f10242x;
                if (b0Var.b() && !u2Var.N) {
                    View view2 = b0Var.C;
                    if (view2 != null && view2.isShown()) {
                        u2Var.g();
                    } else {
                        b0Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
