package w1;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ th.d f18881i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o0.b1 f18882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0.l1 f18883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f18884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f18885u;

    public o2(th.d dVar, o0.b1 b1Var, o0.l1 l1Var, kotlin.jvm.internal.x xVar, View view) {
        this.f18881i = dVar;
        this.f18882r = b1Var;
        this.f18883s = l1Var;
        this.f18884t = xVar;
        this.f18885u = view;
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        boolean z3;
        int i10 = n2.f18871a[nVar.ordinal()];
        oh.e eVarS = null;
        if (i10 == 1) {
            oh.x.s(this.f18881i, null, 4, new a4.h(this.f18884t, this.f18883s, vVar, this, this.f18885u, (ug.c) null), 1);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                this.f18883s.r();
                return;
            } else {
                o0.l1 l1Var = this.f18883s;
                synchronized (l1Var.f12478b) {
                    l1Var.f12492q = true;
                }
                return;
            }
        }
        o0.b1 b1Var = this.f18882r;
        if (b1Var != null) {
            c6.a aVar = (c6.a) b1Var.f12392s;
            synchronized (aVar.f3373b) {
                try {
                    synchronized (aVar.f3373b) {
                        z3 = aVar.f3372a;
                    }
                    if (!z3) {
                        ArrayList arrayList = (ArrayList) aVar.f3374c;
                        aVar.f3374c = (ArrayList) aVar.f3375d;
                        aVar.f3375d = arrayList;
                        aVar.f3372a = true;
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((ug.c) arrayList.get(i11)).resumeWith(qg.o.f13926a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        o0.l1 l1Var2 = this.f18883s;
        synchronized (l1Var2.f12478b) {
            if (l1Var2.f12492q) {
                l1Var2.f12492q = false;
                eVarS = l1Var2.s();
            }
        }
        if (eVarS != null) {
            ((oh.f) eVarS).resumeWith(qg.o.f13926a);
        }
    }
}
