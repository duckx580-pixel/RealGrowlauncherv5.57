package r4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import rh.h1;
import rh.r0;
import rh.v0;
import rh.w0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public int A;
    public final ArrayList B;
    public final v0 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f14456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f14457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f14458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable[] f14459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rg.j f14461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f14462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f14463i;
    public final r0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f14464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f14465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f14466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f14467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.v f14468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f14469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f14470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.o f14471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a5.c f14472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.activity.x f14473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j0 f14475v;
    public final LinkedHashMap w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public kotlin.jvm.internal.m f14476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f0.c0 f14477y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f14478z;

    public a0(Context context) {
        Object next;
        kotlin.jvm.internal.l.f("context", context);
        this.f14455a = context;
        Iterator it = mh.k.v(context, b.f14480s).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f14456b = (Activity) next;
        this.f14461g = new rg.j();
        rg.s sVar = rg.s.f14664i;
        this.f14462h = w0.c(sVar);
        h1 h1VarC = w0.c(sVar);
        this.f14463i = h1VarC;
        this.j = new r0(h1VarC);
        this.f14464k = new LinkedHashMap();
        this.f14465l = new LinkedHashMap();
        this.f14466m = new LinkedHashMap();
        this.f14467n = new LinkedHashMap();
        this.f14470q = new CopyOnWriteArrayList();
        this.f14471r = androidx.lifecycle.o.f1907r;
        this.f14472s = new a5.c(1, this);
        this.f14473t = new androidx.activity.x(2, this);
        this.f14474u = true;
        j0 j0Var = new j0();
        this.f14475v = j0Var;
        this.w = new LinkedHashMap();
        this.f14478z = new LinkedHashMap();
        j0Var.a(new z(j0Var));
        j0Var.a(new c(this.f14455a));
        this.B = new ArrayList();
        android.support.v4.media.session.b.q(new o(this, 0));
        this.C = w0.a((1 & 1) != 0 ? 0 : 1, (1 & 2) == 0 ? 16 : 0, (1 & 4) == 0 ? 2 : 1);
    }

    public static void h(a0 a0Var, String str) {
        a0Var.getClass();
        kotlin.jvm.internal.l.f("route", str);
        int i10 = v.f14567x;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        kotlin.jvm.internal.l.b("Uri.parse(this)", uri);
        Object obj = null;
        n7.e eVar = new n7.e(uri, obj, obj, 6);
        x xVar = a0Var.f14457c;
        if (xVar == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + eVar + ". Navigation graph has not been set for NavController " + a0Var + '.').toString());
        }
        u uVarK = xVar.k(eVar);
        if (uVarK == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + eVar + " cannot be found in the navigation graph " + a0Var.f14457c);
        }
        v vVar = uVarK.f14562i;
        Bundle bundleJ = vVar.j(uVarK.f14563r);
        if (bundleJ == null) {
            bundleJ = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleJ.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        a0Var.g(vVar, bundleJ, null);
    }

    public static /* synthetic */ void l(a0 a0Var, k kVar) {
        a0Var.k(kVar, false, new rg.j());
    }

    public final void a(v vVar, Bundle bundle, k kVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        v vVar2 = kVar.f14517r;
        boolean z3 = vVar2 instanceof d;
        boolean z10 = true;
        rg.j jVar = this.f14461g;
        if (!z3) {
            while (!jVar.isEmpty() && (((k) jVar.last()).f14517r instanceof d) && j(((k) jVar.last()).f14517r.f14573v, true, false)) {
            }
        }
        rg.j<k> jVar2 = new rg.j();
        boolean z11 = vVar instanceof x;
        Context context = this.f14455a;
        Object obj = null;
        if (z11) {
            v vVar3 = vVar2;
            do {
                kotlin.jvm.internal.l.c(vVar3);
                vVar3 = vVar3.f14569r;
                if (vVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (kotlin.jvm.internal.l.a(((k) objPrevious2).f14517r, vVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    k kVarL = (k) objPrevious2;
                    if (kVarL == null) {
                        kVarL = hd.d0.l(context, vVar3, bundle, e(), this.f14469p);
                    }
                    jVar2.addFirst(kVarL);
                    if (!jVar.isEmpty() && ((k) jVar.last()).f14517r == vVar3) {
                        l(this, (k) jVar.last());
                    }
                }
                if (vVar3 == null) {
                    break;
                }
            } while (vVar3 != vVar);
        }
        v vVar4 = jVar2.isEmpty() ? vVar2 : ((k) jVar2.first()).f14517r;
        while (vVar4 != null && c(vVar4.f14573v) != vVar4) {
            vVar4 = vVar4.f14569r;
            if (vVar4 != null) {
                Bundle bundle2 = (bundle == null || bundle.isEmpty() != z10) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (kotlin.jvm.internal.l.a(((k) objPrevious).f14517r, vVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                k kVarL2 = (k) objPrevious;
                if (kVarL2 == null) {
                    kVarL2 = hd.d0.l(context, vVar4, vVar4.j(bundle2), e(), this.f14469p);
                }
                jVar2.addFirst(kVarL2);
            }
            z10 = true;
        }
        if (!jVar2.isEmpty()) {
            vVar2 = ((k) jVar2.first()).f14517r;
        }
        while (!jVar.isEmpty() && (((k) jVar.last()).f14517r instanceof x)) {
            v vVar5 = ((k) jVar.last()).f14517r;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", vVar5);
            if (((x) vVar5).l(vVar2.f14573v, false) != null) {
                break;
            } else {
                l(this, (k) jVar.last());
            }
        }
        k kVar2 = (k) (jVar.isEmpty() ? null : jVar.f14661r[jVar.f14660i]);
        if (kVar2 == null) {
            kVar2 = (k) (jVar2.isEmpty() ? null : jVar2.f14661r[jVar2.f14660i]);
        }
        if (!kotlin.jvm.internal.l.a(kVar2 != null ? kVar2.f14517r : null, this.f14457c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                v vVar6 = ((k) objPrevious3).f14517r;
                x xVar = this.f14457c;
                kotlin.jvm.internal.l.c(xVar);
                if (kotlin.jvm.internal.l.a(vVar6, xVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            k kVarL3 = (k) obj;
            if (kVarL3 == null) {
                x xVar2 = this.f14457c;
                kotlin.jvm.internal.l.c(xVar2);
                x xVar3 = this.f14457c;
                kotlin.jvm.internal.l.c(xVar3);
                kVarL3 = hd.d0.l(context, xVar2, xVar3.j(bundle), e(), this.f14469p);
            }
            jVar2.addFirst(kVarL3);
        }
        for (k kVar3 : jVar2) {
            Object obj2 = this.w.get(this.f14475v.b(kVar3.f14517r.f14568i));
            if (obj2 == null) {
                throw new IllegalStateException(k0.g.l(new StringBuilder("NavigatorBackStack for "), vVar.f14568i, " should already be created").toString());
            }
            ((m) obj2).a(kVar3);
        }
        jVar.addAll(jVar2);
        jVar.addLast(kVar);
        for (k kVar4 : rg.l.p0(jVar2, kVar)) {
            x xVar4 = kVar4.f14517r.f14569r;
            if (xVar4 != null) {
                f(kVar4, d(xVar4.f14573v));
            }
        }
    }

    public final boolean b() {
        rg.j jVar;
        while (true) {
            jVar = this.f14461g;
            if (jVar.isEmpty() || !(((k) jVar.last()).f14517r instanceof x)) {
                break;
            }
            l(this, (k) jVar.last());
        }
        k kVar = (k) jVar.p();
        ArrayList arrayList = this.B;
        if (kVar != null) {
            arrayList.add(kVar);
        }
        this.A++;
        p();
        int i10 = this.A - 1;
        this.A = i10;
        if (i10 == 0) {
            ArrayList<k> arrayListY0 = rg.l.y0(arrayList);
            arrayList.clear();
            for (k kVar2 : arrayListY0) {
                Iterator it = this.f14470q.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    v vVar = kVar2.f14517r;
                    kVar2.a();
                    throw null;
                }
                this.C.d(kVar2);
            }
            ArrayList arrayListY02 = rg.l.y0(jVar);
            h1 h1Var = this.f14462h;
            h1Var.getClass();
            h1Var.k(null, arrayListY02);
            ArrayList arrayListM = m();
            h1 h1Var2 = this.f14463i;
            h1Var2.getClass();
            h1Var2.k(null, arrayListM);
        }
        return kVar != null;
    }

    public final v c(int i10) {
        v vVar;
        x xVar;
        x xVar2 = this.f14457c;
        if (xVar2 == null) {
            return null;
        }
        if (xVar2.f14573v == i10) {
            return xVar2;
        }
        k kVar = (k) this.f14461g.p();
        if (kVar == null || (vVar = kVar.f14517r) == null) {
            vVar = this.f14457c;
            kotlin.jvm.internal.l.c(vVar);
        }
        if (vVar.f14573v == i10) {
            return vVar;
        }
        if (vVar instanceof x) {
            xVar = (x) vVar;
        } else {
            xVar = vVar.f14569r;
            kotlin.jvm.internal.l.c(xVar);
        }
        return xVar.l(i10, true);
    }

    public final k d(int i10) {
        Object objPrevious;
        rg.j jVar = this.f14461g;
        ListIterator listIterator = jVar.listIterator(jVar.b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((k) objPrevious).f14517r.f14573v == i10) {
                break;
            }
        }
        k kVar = (k) objPrevious;
        if (kVar != null) {
            return kVar;
        }
        StringBuilder sbN = android.support.v4.media.session.a.n(i10, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        k kVar2 = (k) jVar.p();
        sbN.append(kVar2 != null ? kVar2.f14517r : null);
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    public final androidx.lifecycle.o e() {
        return this.f14468o == null ? androidx.lifecycle.o.f1908s : this.f14471r;
    }

    public final void f(k kVar, k kVar2) {
        this.f14464k.put(kVar, kVar2);
        LinkedHashMap linkedHashMap = this.f14465l;
        if (linkedHashMap.get(kVar2) == null) {
            linkedHashMap.put(kVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(kVar2);
        kotlin.jvm.internal.l.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(r4.v r26, android.os.Bundle r27, r4.c0 r28) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.a0.g(r4.v, android.os.Bundle, r4.c0):void");
    }

    public final void i() {
        rg.j jVar = this.f14461g;
        if (jVar.isEmpty()) {
            return;
        }
        k kVar = (k) jVar.p();
        v vVar = kVar != null ? kVar.f14517r : null;
        kotlin.jvm.internal.l.c(vVar);
        if (j(vVar.f14573v, true, false)) {
            b();
        }
    }

    public final boolean j(int i10, boolean z3, boolean z10) {
        v vVar;
        a0 a0Var;
        boolean z11;
        rg.j jVar = this.f14461g;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = rg.l.q0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            vVar = ((k) it.next()).f14517r;
            i0 i0VarB = this.f14475v.b(vVar.f14568i);
            if (z3 || vVar.f14573v != i10) {
                arrayList.add(i0VarB);
            }
            if (vVar.f14573v == i10) {
                break;
            }
        }
        if (vVar == null) {
            int i11 = v.f14567x;
            Log.i("NavController", "Ignoring popBackStack to destination " + g.b(this.f14455a, i10) + " as it was not found on the current back stack");
            return false;
        }
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        rg.j jVar2 = new rg.j();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                a0Var = this;
                z11 = z10;
                break;
            }
            i0 i0Var = (i0) it2.next();
            kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
            k kVar = (k) jVar.last();
            a0Var = this;
            z11 = z10;
            a0Var.f14477y = new f0.c0(sVar2, sVar, a0Var, z11, jVar2);
            i0Var.e(kVar, z11);
            a0Var.f14477y = null;
            if (!sVar2.f9662i) {
                break;
            }
            z10 = z11;
        }
        if (z11) {
            LinkedHashMap linkedHashMap = a0Var.f14466m;
            if (!z3) {
                bh.h hVar = new bh.h(new mh.h(mh.k.v(vVar, b.f14481t), new n(this, 0), 1));
                while (hVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((v) hVar.next()).f14573v);
                    l lVar = (l) (jVar2.isEmpty() ? null : jVar2.f14661r[jVar2.f14660i]);
                    linkedHashMap.put(numValueOf, lVar != null ? lVar.f14525i : null);
                }
            }
            if (!jVar2.isEmpty()) {
                l lVar2 = (l) jVar2.first();
                int i12 = lVar2.f14526r;
                String str = lVar2.f14525i;
                bh.h hVar2 = new bh.h(new mh.h(mh.k.v(c(i12), b.f14482u), new n(this, 1), 1));
                while (hVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((v) hVar2.next()).f14573v), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    a0Var.f14467n.put(str, jVar2);
                }
            }
        }
        q();
        return sVar.f9662i;
    }

    public final void k(k kVar, boolean z3, rg.j jVar) {
        p pVar;
        r0 r0Var;
        Set set;
        rg.j jVar2 = this.f14461g;
        k kVar2 = (k) jVar2.last();
        if (!kotlin.jvm.internal.l.a(kVar2, kVar)) {
            throw new IllegalStateException(("Attempted to pop " + kVar.f14517r + ", which is not the top of the back stack (" + kVar2.f14517r + ')').toString());
        }
        jVar2.removeLast();
        m mVar = (m) this.w.get(this.f14475v.b(kVar2.f14517r.f14568i));
        boolean z10 = true;
        if ((mVar == null || (r0Var = mVar.f14534f) == null || (set = (Set) r0Var.f14808i.getValue()) == null || !set.contains(kVar2)) && !this.f14465l.containsKey(kVar2)) {
            z10 = false;
        }
        androidx.lifecycle.o oVar = kVar2.f14522x.f1943d;
        androidx.lifecycle.o oVar2 = androidx.lifecycle.o.f1908s;
        if (oVar.compareTo(oVar2) >= 0) {
            if (z3) {
                kVar2.b(oVar2);
                jVar.addFirst(new l(kVar2));
            }
            if (z10) {
                kVar2.b(oVar2);
            } else {
                kVar2.b(androidx.lifecycle.o.f1906i);
                o(kVar2);
            }
        }
        if (z3 || z10 || (pVar = this.f14469p) == null) {
            return;
        }
        String str = kVar2.f14521v;
        kotlin.jvm.internal.l.f("backStackEntryId", str);
        z0 z0Var = (z0) pVar.f14542b.remove(str);
        if (z0Var != null) {
            z0Var.a();
        }
    }

    public final ArrayList m() {
        androidx.lifecycle.o oVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oVar = androidx.lifecycle.o.f1909t;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((m) it.next()).f14534f.f14808i.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                k kVar = (k) obj;
                if (!arrayList.contains(kVar) && kVar.A.compareTo(oVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            rg.q.S(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f14461g) {
            k kVar2 = (k) obj2;
            if (!arrayList.contains(kVar2) && kVar2.A.compareTo(oVar) >= 0) {
                arrayList3.add(obj2);
            }
        }
        rg.q.S(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((k) obj3).f14517r instanceof x)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean n(int i10, Bundle bundle, c0 c0Var) {
        v vVar;
        k kVar;
        v vVar2;
        x xVar;
        v vVarL;
        Integer numValueOf = Integer.valueOf(i10);
        LinkedHashMap linkedHashMap = this.f14466m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        b2.m mVar = new b2.m(str, 4);
        kotlin.jvm.internal.l.f("<this>", collectionValues);
        rg.q.U(collectionValues, mVar);
        rg.j<l> jVar = (rg.j) kotlin.jvm.internal.a0.b(this.f14467n).remove(str);
        ArrayList arrayList = new ArrayList();
        k kVar2 = (k) this.f14461g.p();
        if ((kVar2 == null || (vVar = kVar2.f14517r) == null) && (vVar = this.f14457c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (jVar != null) {
            for (l lVar : jVar) {
                int i11 = lVar.f14526r;
                if (vVar.f14573v == i11) {
                    vVarL = vVar;
                } else {
                    if (vVar instanceof x) {
                        xVar = (x) vVar;
                    } else {
                        xVar = vVar.f14569r;
                        kotlin.jvm.internal.l.c(xVar);
                    }
                    vVarL = xVar.l(i11, true);
                }
                Context context = this.f14455a;
                if (vVarL == null) {
                    int i12 = v.f14567x;
                    throw new IllegalStateException(("Restore State failed: destination " + g.b(context, lVar.f14526r) + " cannot be found from the current destination " + vVar).toString());
                }
                arrayList.add(lVar.a(context, vVarL, e(), this.f14469p));
                vVar = vVarL;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((k) obj).f14517r instanceof x)) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            k kVar3 = (k) it.next();
            List list = (List) rg.l.l0(arrayList2);
            if (list != null && (kVar = (k) rg.l.k0(list)) != null && (vVar2 = kVar.f14517r) != null) {
                str2 = vVar2.f14568i;
            }
            if (kotlin.jvm.internal.l.a(str2, kVar3.f14517r.f14568i)) {
                list.add(kVar3);
            } else {
                arrayList2.add(sb.c.E(kVar3));
            }
        }
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        for (List list2 : arrayList2) {
            i0 i0VarB = this.f14475v.b(((k) rg.l.c0(list2)).f14517r.f14568i);
            this.f14476x = new d.b(sVar, arrayList, new kotlin.jvm.internal.v(), this, bundle, 2);
            i0VarB.d(list2, c0Var);
            this.f14476x = null;
        }
        return sVar.f9662i;
    }

    public final void o(k kVar) {
        kotlin.jvm.internal.l.f("child", kVar);
        k kVar2 = (k) this.f14464k.remove(kVar);
        if (kVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f14465l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(kVar2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            m mVar = (m) this.w.get(this.f14475v.b(kVar2.f14517r.f14568i));
            if (mVar != null) {
                mVar.b(kVar2);
            }
            linkedHashMap.remove(kVar2);
        }
    }

    public final void p() {
        AtomicInteger atomicInteger;
        r0 r0Var;
        Set set;
        ArrayList<k> arrayListY0 = rg.l.y0(this.f14461g);
        if (arrayListY0.isEmpty()) {
            return;
        }
        v vVar = ((k) rg.l.k0(arrayListY0)).f14517r;
        ArrayList arrayList = new ArrayList();
        if (vVar instanceof d) {
            Iterator it = rg.l.q0(arrayListY0).iterator();
            while (it.hasNext()) {
                v vVar2 = ((k) it.next()).f14517r;
                arrayList.add(vVar2);
                if (!(vVar2 instanceof d) && !(vVar2 instanceof x)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (k kVar : rg.l.q0(arrayListY0)) {
            androidx.lifecycle.o oVar = kVar.A;
            v vVar3 = kVar.f14517r;
            androidx.lifecycle.o oVar2 = androidx.lifecycle.o.f1910u;
            androidx.lifecycle.o oVar3 = androidx.lifecycle.o.f1909t;
            if (vVar != null && vVar3.f14573v == vVar.f14573v) {
                if (oVar != oVar2) {
                    m mVar = (m) this.w.get(this.f14475v.b(vVar3.f14568i));
                    if (kotlin.jvm.internal.l.a((mVar == null || (r0Var = mVar.f14534f) == null || (set = (Set) r0Var.f14808i.getValue()) == null) ? null : Boolean.valueOf(set.contains(kVar)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f14465l.get(kVar)) != null && atomicInteger.get() == 0)) {
                        map.put(kVar, oVar3);
                    } else {
                        map.put(kVar, oVar2);
                    }
                }
                v vVar4 = (v) rg.l.e0(arrayList);
                if (vVar4 != null && vVar4.f14573v == vVar3.f14573v) {
                    rg.q.W(arrayList);
                }
                vVar = vVar.f14569r;
            } else if (arrayList.isEmpty() || vVar3.f14573v != ((v) rg.l.c0(arrayList)).f14573v) {
                kVar.b(androidx.lifecycle.o.f1908s);
            } else {
                v vVar5 = (v) rg.q.W(arrayList);
                if (oVar == oVar2) {
                    kVar.b(oVar3);
                } else if (oVar != oVar3) {
                    map.put(kVar, oVar3);
                }
                x xVar = vVar5.f14569r;
                if (xVar != null && !arrayList.contains(xVar)) {
                    arrayList.add(xVar);
                }
            }
        }
        for (k kVar2 : arrayListY0) {
            androidx.lifecycle.o oVar4 = (androidx.lifecycle.o) map.get(kVar2);
            if (oVar4 != null) {
                kVar2.b(oVar4);
            } else {
                kVar2.c();
            }
        }
    }

    public final void q() {
        int i10;
        boolean z3 = false;
        if (this.f14474u) {
            rg.j jVar = this.f14461g;
            if (jVar == null || !jVar.isEmpty()) {
                Iterator it = jVar.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (!(((k) it.next()).f14517r instanceof x) && (i10 = i10 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 > 1) {
                z3 = true;
            }
        }
        androidx.activity.x xVar = this.f14473t;
        xVar.f707a = z3;
        androidx.activity.r rVar = xVar.f709c;
        if (rVar != null) {
            rVar.invoke();
        }
    }
}
