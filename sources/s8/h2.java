package s8;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15392i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15395t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15396u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15397v;

    public /* synthetic */ h2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f15392i = i10;
        this.f15396u = obj;
        this.f15397v = obj2;
        this.f15393r = obj3;
        this.f15394s = obj4;
        this.f15395t = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        l2 l2Var;
        b0 b0Var;
        switch (this.f15392i) {
            case 0:
                synchronized (((AtomicReference) this.f15397v)) {
                    try {
                        try {
                            l2Var = (l2) this.f15396u;
                            b0Var = l2Var.f15468u;
                        } catch (RemoteException e8) {
                            i0 i0Var = ((y0) ((l2) this.f15396u).f3470r).f15665y;
                            y0.k(i0Var);
                            i0Var.w.e("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f15393r, e8);
                            ((AtomicReference) this.f15397v).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f15397v;
                        }
                        if (b0Var == null) {
                            i0 i0Var2 = ((y0) l2Var.f3470r).f15665y;
                            y0.k(i0Var2);
                            i0Var2.w.e("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f15393r, (String) this.f15394s);
                            ((AtomicReference) this.f15397v).set(Collections.EMPTY_LIST);
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.f15397v).set(b0Var.k((String) this.f15393r, (String) this.f15394s, (g3) this.f15395t));
                        } else {
                            ((AtomicReference) this.f15397v).set(b0Var.l(null, (String) this.f15393r, (String) this.f15394s));
                        }
                        ((l2) this.f15396u).E();
                        atomicReference = (AtomicReference) this.f15397v;
                        atomicReference.notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f15397v).notify();
                    }
                }
            case 1:
                g3 g3Var = (g3) this.f15395t;
                String str = (String) this.f15394s;
                String str2 = (String) this.f15393r;
                com.google.android.gms.internal.measurement.m0 m0Var = (com.google.android.gms.internal.measurement.m0) this.f15397v;
                l2 l2Var2 = (l2) this.f15396u;
                y0 y0Var = (y0) l2Var2.f3470r;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        b0 b0Var2 = l2Var2.f15468u;
                        if (b0Var2 == null) {
                            i0 i0Var3 = y0Var.f15665y;
                            y0.k(i0Var3);
                            i0Var3.w.d(str2, str, "Failed to get conditional properties; not connected to service");
                        } else {
                            arrayList = e3.C(b0Var2.k(str2, str, g3Var));
                            l2Var2.E();
                        }
                        break;
                    } catch (RemoteException e10) {
                        i0 i0Var4 = y0Var.f15665y;
                        y0.k(i0Var4);
                        i0Var4.w.e("Failed to get conditional properties; remote exception", str2, str, e10);
                        break;
                    }
                    return;
                } finally {
                    e3 e3Var = y0Var.B;
                    y0.h(e3Var);
                    e3Var.L(m0Var, arrayList);
                }
            default:
                try {
                    if (!(((w5.k) this.f15397v).f19093i instanceof w5.a)) {
                        String string = ((UUID) this.f15393r).toString();
                        u5.p pVarH = ((v5.p) this.f15396u).f18609c.h(string);
                        if (pVarH == null || android.support.v4.media.session.a.d(pVarH.f17682b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((m5.g) ((v5.p) this.f15396u).f18608b).g(string, (androidx.work.h) this.f15394s);
                        ((Context) this.f15395t).startService(t5.b.a((Context) this.f15395t, vd.a.o(pVarH), (androidx.work.h) this.f15394s));
                    }
                    ((w5.k) this.f15397v).i(null);
                    return;
                } catch (Throwable th2) {
                    ((w5.k) this.f15397v).j(th2);
                    return;
                }
        }
    }

    public h2(l2 l2Var, String str, String str2, g3 g3Var, com.google.android.gms.internal.measurement.m0 m0Var) {
        this.f15392i = 1;
        this.f15396u = l2Var;
        this.f15393r = str;
        this.f15394s = str2;
        this.f15395t = g3Var;
        this.f15397v = m0Var;
    }
}
