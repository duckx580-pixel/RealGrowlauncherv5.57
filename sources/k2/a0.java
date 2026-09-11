package k2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f9142b;

    public a0(v vVar, x xVar) {
        this.f9141a = vVar;
        this.f9142b = xVar;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, qg.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qg.d] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, qg.d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, qg.d] */
    public final void a(u uVar, u uVar2) {
        if (kotlin.jvm.internal.l.a((a0) this.f9141a.f9200b.get(), this)) {
            x xVar = this.f9142b;
            mf.e eVar = xVar.f9207b;
            ArrayList arrayList = xVar.f9214i;
            long j = xVar.f9212g.f9197b;
            long j10 = uVar2.f9197b;
            d2.w wVar = uVar2.f9198c;
            boolean z3 = (d2.w.a(j, j10) && kotlin.jvm.internal.l.a(xVar.f9212g.f9198c, wVar)) ? false : true;
            xVar.f9212g = uVar2;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((WeakReference) arrayList.get(i10)).get();
                if (qVar != null) {
                    qVar.f9185c = uVar2;
                }
            }
            e eVar2 = xVar.f9216l;
            eVar2.f9160i = null;
            eVar2.f9161k = null;
            eVar2.j = null;
            eVar2.f9162l = d.f9146r;
            eVar2.f9163m = null;
            eVar2.f9164n = null;
            if (kotlin.jvm.internal.l.a(uVar, uVar2)) {
                if (z3) {
                    int iE = d2.w.e(j10);
                    int iD = d2.w.d(j10);
                    d2.w wVar2 = xVar.f9212g.f9198c;
                    int iE2 = wVar2 != null ? d2.w.e(wVar2.f4918a) : -1;
                    d2.w wVar3 = xVar.f9212g.f9198c;
                    ((InputMethodManager) eVar.f11710s.getValue()).updateSelection((View) eVar.f11709r, iE, iD, iE2, wVar3 != null ? d2.w.d(wVar3.f4918a) : -1);
                    return;
                }
                return;
            }
            if (uVar != null && (!kotlin.jvm.internal.l.a(uVar.f9196a.f4836i, uVar2.f9196a.f4836i) || (d2.w.a(uVar.f9197b, j10) && !kotlin.jvm.internal.l.a(uVar.f9198c, wVar)))) {
                ((InputMethodManager) eVar.f11710s.getValue()).restartInput((View) eVar.f11709r);
                return;
            }
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                q qVar2 = (q) ((WeakReference) arrayList.get(i11)).get();
                if (qVar2 != null) {
                    u uVar3 = xVar.f9212g;
                    if (qVar2.f9189g) {
                        qVar2.f9185c = uVar3;
                        if (qVar2.f9187e) {
                            ((InputMethodManager) eVar.f11710s.getValue()).updateExtractedText((View) eVar.f11709r, qVar2.f9186d, qj.b.s(uVar3));
                        }
                        d2.w wVar4 = uVar3.f9198c;
                        long j11 = uVar3.f9197b;
                        int iE3 = wVar4 != null ? d2.w.e(wVar4.f4918a) : -1;
                        d2.w wVar5 = uVar3.f9198c;
                        ((InputMethodManager) eVar.f11710s.getValue()).updateSelection((View) eVar.f11709r, d2.w.e(j11), d2.w.d(j11), iE3, wVar5 != null ? d2.w.d(wVar5.f4918a) : -1);
                    }
                }
            }
        }
    }
}
