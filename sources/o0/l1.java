package o0;

import android.util.Log;
import com.usercentrics.sdk.extensions.TimeExtensionsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends r {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final rh.h1 f12476v = rh.w0.c(u0.b.f17547t);
    public static final AtomicReference w = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oh.w0 f12479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f12480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0.b f12483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f12484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f12485i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f12486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f12487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f12488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedHashSet f12489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public oh.f f12490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u5.l f12491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rh.h1 f12493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oh.z0 f12494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ug.h f12495t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n0 f12496u;

    public l1(ug.h hVar) {
        f fVar = new f(new a4.v(27, this));
        this.f12477a = fVar;
        this.f12478b = new Object();
        this.f12481e = new ArrayList();
        this.f12483g = new q0.b();
        this.f12484h = new ArrayList();
        this.f12485i = new ArrayList();
        this.j = new ArrayList();
        this.f12486k = new LinkedHashMap();
        this.f12487l = new LinkedHashMap();
        this.f12493r = rh.w0.c(i1.f12444s);
        oh.z0 z0Var = new oh.z0((oh.w0) hVar.i(oh.t.f12918r));
        z0Var.Q(new a0.k0(19, this));
        this.f12494s = z0Var;
        this.f12495t = hVar.e(fVar).e(z0Var);
        this.f12496u = new n0(7);
    }

    public static final t o(l1 l1Var, t tVar, q0.b bVar) {
        LinkedHashSet linkedHashSet;
        y0.c cVarA;
        if (!tVar.F.E && !tVar.G && ((linkedHashSet = l1Var.f12489n) == null || !linkedHashSet.contains(tVar))) {
            a0.k0 k0Var = new a0.k0(20, tVar);
            a0.u uVar = new a0.u(20, tVar, bVar);
            y0.g gVarJ = y0.m.j();
            y0.c cVar = gVarJ instanceof y0.c ? (y0.c) gVarJ : null;
            if (cVar == null || (cVarA = cVar.A(k0Var, uVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                y0.g gVarJ2 = cVarA.j();
                if (bVar != null) {
                    try {
                        if (bVar.k()) {
                            a0.r rVar = new a0.r(13, bVar, tVar);
                            o oVar = tVar.F;
                            if (oVar.E) {
                                p.v("Preparing a composition while composing is not supported");
                                throw null;
                            }
                            oVar.E = true;
                            try {
                                rVar.invoke();
                                oVar.E = false;
                            } catch (Throwable th2) {
                                oVar.E = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        y0.g.p(gVarJ2);
                        throw th3;
                    }
                }
                boolean zT = tVar.t();
                y0.g.p(gVarJ2);
                if (zT) {
                    return tVar;
                }
            } finally {
                q(cVarA);
            }
        }
        return null;
    }

    public static final boolean p(l1 l1Var) {
        List listV;
        synchronized (l1Var.f12478b) {
            boolean z3 = true;
            if (l1Var.f12483g.isEmpty()) {
                if (l1Var.f12484h.isEmpty() && !l1Var.t()) {
                    z3 = false;
                }
                return z3;
            }
            q0.b bVar = l1Var.f12483g;
            l1Var.f12483g = new q0.b();
            synchronized (l1Var.f12478b) {
                listV = l1Var.v();
            }
            try {
                int size = listV.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((t) listV.get(i10)).v(bVar);
                    if (((i1) l1Var.f12493r.getValue()).compareTo(i1.f12443r) <= 0) {
                        break;
                    }
                }
                l1Var.f12483g = new q0.b();
                synchronized (l1Var.f12478b) {
                    if (l1Var.s() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (l1Var.f12484h.isEmpty() && !l1Var.t()) {
                        z3 = false;
                    }
                }
                return z3;
            } catch (Throwable th2) {
                synchronized (l1Var.f12478b) {
                    l1Var.f12483g.b(bVar);
                    throw th2;
                }
            }
        }
    }

    public static void q(y0.c cVar) {
        try {
            if (cVar.v() instanceof y0.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.c();
        }
    }

    public static final void w(ArrayList arrayList, l1 l1Var, t tVar) {
        arrayList.clear();
        synchronized (l1Var.f12478b) {
            Iterator it = l1Var.j.iterator();
            if (it.hasNext()) {
                ((r0) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // o0.r
    public final void a(t tVar, w0.a aVar) throws Exception {
        y0.c cVarA;
        boolean z3 = tVar.F.E;
        try {
            a0.k0 k0Var = new a0.k0(20, tVar);
            a0.u uVar = new a0.u(20, tVar, null);
            y0.g gVarJ = y0.m.j();
            y0.c cVar = gVarJ instanceof y0.c ? (y0.c) gVarJ : null;
            if (cVar == null || (cVarA = cVar.A(k0Var, uVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                y0.g gVarJ2 = cVarA.j();
                try {
                    tVar.i(aVar);
                    if (!z3) {
                        y0.m.j().m();
                    }
                    synchronized (this.f12478b) {
                        if (((i1) this.f12493r.getValue()).compareTo(i1.f12443r) > 0 && !v().contains(tVar)) {
                            this.f12481e.add(tVar);
                            this.f12482f = null;
                        }
                    }
                    try {
                        synchronized (this.f12478b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((r0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            tVar.d();
                            tVar.f();
                            if (z3) {
                                return;
                            }
                            y0.m.j().m();
                        } catch (Exception e8) {
                            y(e8, null);
                        }
                    } catch (Exception e10) {
                        y(e10, tVar);
                    }
                } finally {
                    y0.g.p(gVarJ2);
                }
            } finally {
                q(cVarA);
            }
        } catch (Exception e11) {
            y(e11, tVar);
        }
    }

    @Override // o0.r
    public final boolean c() {
        return false;
    }

    @Override // o0.r
    public final boolean d() {
        return false;
    }

    @Override // o0.r
    public final int f() {
        return TimeExtensionsKt.MILLIS_PER_SECOND;
    }

    @Override // o0.r
    public final ug.h g() {
        return this.f12495t;
    }

    @Override // o0.r
    public final void h(t tVar) {
        oh.e eVarS;
        synchronized (this.f12478b) {
            if (this.f12484h.contains(tVar)) {
                eVarS = null;
            } else {
                this.f12484h.add(tVar);
                eVarS = s();
            }
        }
        if (eVarS != null) {
            ((oh.f) eVarS).resumeWith(qg.o.f13926a);
        }
    }

    @Override // o0.r
    public final void k(t tVar) {
        synchronized (this.f12478b) {
            try {
                LinkedHashSet linkedHashSet = this.f12489n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f12489n = linkedHashSet;
                }
                linkedHashSet.add(tVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o0.r
    public final void n(t tVar) {
        synchronized (this.f12478b) {
            this.f12481e.remove(tVar);
            this.f12482f = null;
            this.f12484h.remove(tVar);
            this.f12485i.remove(tVar);
        }
    }

    public final void r() {
        synchronized (this.f12478b) {
            if (((i1) this.f12493r.getValue()).compareTo(i1.f12446u) >= 0) {
                rh.h1 h1Var = this.f12493r;
                i1 i1Var = i1.f12443r;
                h1Var.getClass();
                h1Var.k(null, i1Var);
            }
        }
        this.f12494s.c(null);
    }

    public final oh.e s() {
        rh.h1 h1Var = this.f12493r;
        int iCompareTo = ((i1) h1Var.getValue()).compareTo(i1.f12443r);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.f12485i;
        ArrayList arrayList3 = this.f12484h;
        if (iCompareTo <= 0) {
            this.f12481e.clear();
            this.f12482f = rg.s.f14664i;
            this.f12483g = new q0.b();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            this.f12488m = null;
            oh.f fVar = this.f12490o;
            if (fVar != null) {
                fVar.o(null);
            }
            this.f12490o = null;
            this.f12491p = null;
            return null;
        }
        u5.l lVar = this.f12491p;
        i1 i1Var = i1.f12447v;
        i1 i1Var2 = i1.f12444s;
        if (lVar == null) {
            if (this.f12479c == null) {
                this.f12483g = new q0.b();
                arrayList3.clear();
                if (t()) {
                    i1Var2 = i1.f12445t;
                }
            } else {
                i1Var2 = (arrayList3.isEmpty() && !this.f12483g.k() && arrayList2.isEmpty() && arrayList.isEmpty() && !t()) ? i1.f12446u : i1Var;
            }
        }
        h1Var.getClass();
        h1Var.k(null, i1Var2);
        if (i1Var2 != i1Var) {
            return null;
        }
        oh.f fVar2 = this.f12490o;
        this.f12490o = null;
        return fVar2;
    }

    public final boolean t() {
        boolean zIsEmpty;
        if (this.f12492q) {
            return false;
        }
        f fVar = this.f12477a;
        synchronized (fVar.f12410r) {
            zIsEmpty = fVar.f12412t.isEmpty();
        }
        return !zIsEmpty;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12478b
            monitor-enter(r0)
            q0.b r1 = r2.f12483g     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.k()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = r2.f12484h     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            boolean r1 = r2.t()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r0)
            return r1
        L21:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l1.u():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List v() {
        Object obj = this.f12482f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f12481e;
            Object arrayList2 = arrayList.isEmpty() ? rg.s.f14664i : new ArrayList(arrayList);
            this.f12482f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    public final List x(List list, q0.b bVar) {
        y0.c cVarA;
        ArrayList arrayList;
        Object obj;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            ((r0) obj2).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj2);
        }
        for (Map.Entry entry : map.entrySet()) {
            t tVar = (t) entry.getKey();
            List list2 = (List) entry.getValue();
            p.O(!tVar.F.E);
            a0.k0 k0Var = new a0.k0(20, tVar);
            a0.u uVar = new a0.u(20, tVar, bVar);
            y0.g gVarJ = y0.m.j();
            y0.c cVar = gVarJ instanceof y0.c ? (y0.c) gVarJ : null;
            if (cVar == null || (cVarA = cVar.A(k0Var, uVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                y0.g gVarJ2 = cVarA.j();
                try {
                    synchronized (this.f12478b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            r0 r0Var = (r0) list2.get(i11);
                            LinkedHashMap linkedHashMap = this.f12486k;
                            r0Var.getClass();
                            List list3 = (List) linkedHashMap.get(null);
                            if (list3 != null) {
                                Object objW = rg.q.W(list3);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(null);
                                }
                                obj = objW;
                            } else {
                                obj = null;
                            }
                            arrayList.add(new qg.g(r0Var, obj));
                        }
                    }
                    tVar.o(arrayList);
                } finally {
                    y0.g.p(gVarJ2);
                }
            } finally {
                q(cVarA);
            }
        }
        return rg.l.x0(map.keySet());
    }

    public final void y(Exception exc, t tVar) throws Exception {
        if (!((Boolean) w.get()).booleanValue() || (exc instanceof j)) {
            synchronized (this.f12478b) {
                u5.l lVar = this.f12491p;
                if (lVar != null) {
                    throw ((Exception) lVar.f17672i);
                }
                this.f12491p = new u5.l(exc);
            }
            throw exc;
        }
        synchronized (this.f12478b) {
            try {
                int i10 = b.f12387b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f12485i.clear();
                this.f12484h.clear();
                this.f12483g = new q0.b();
                this.j.clear();
                this.f12486k.clear();
                this.f12487l.clear();
                this.f12491p = new u5.l(exc);
                if (tVar != null) {
                    ArrayList arrayList = this.f12488m;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f12488m = arrayList;
                    }
                    if (!arrayList.contains(tVar)) {
                        arrayList.add(tVar);
                    }
                    this.f12481e.remove(tVar);
                    this.f12482f = null;
                }
                s();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o0.r
    public final void i(Set set) {
    }
}
