package n5;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m5.c;
import m5.d;
import m5.i;
import n7.e;
import u5.j;
import u5.s;
import v5.k;
import v5.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i, q5.b, d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f12118z = p.f("GreedyScheduler");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f12119i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m5.p f12120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f12121s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f12123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12124v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f12126y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f12122t = new HashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f12125x = new s(12);
    public final Object w = new Object();

    public b(Context context, androidx.work.b bVar, u5.i iVar, m5.p pVar) {
        this.f12119i = context;
        this.f12120r = pVar;
        this.f12121s = new e(iVar, this);
        this.f12123u = new a(this, bVar.f2320e);
    }

    @Override // m5.i
    public final boolean a() {
        return false;
    }

    @Override // m5.d
    public final void b(j jVar, boolean z3) {
        this.f12125x.o(jVar);
        synchronized (this.w) {
            try {
                Iterator it = this.f12122t.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    u5.p pVar = (u5.p) it.next();
                    if (vd.a.o(pVar).equals(jVar)) {
                        p.d().a(f12118z, "Stopping tracking for " + jVar);
                        this.f12122t.remove(pVar);
                        this.f12121s.B(this.f12122t);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m5.i
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.f12126y;
        m5.p pVar = this.f12120r;
        if (bool == null) {
            this.f12126y = Boolean.valueOf(k.a(this.f12119i, pVar.f11610b));
        }
        boolean zBooleanValue = this.f12126y.booleanValue();
        String str2 = f12118z;
        if (!zBooleanValue) {
            p.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f12124v) {
            pVar.f11614f.a(this);
            this.f12124v = true;
        }
        p.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f12123u;
        if (aVar != null && (runnable = (Runnable) aVar.f12117c.remove(str)) != null) {
            aVar.f12116b.f11571i.removeCallbacks(runnable);
        }
        Iterator it = this.f12125x.n(str).iterator();
        while (it.hasNext()) {
            pVar.f11612d.e(new l(pVar, (m5.k) it.next(), false));
        }
    }

    @Override // q5.b
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVarO = vd.a.o((u5.p) it.next());
            p.d().a(f12118z, "Constraints not met: Cancelling work ID " + jVarO);
            m5.k kVarO = this.f12125x.o(jVarO);
            if (kVarO != null) {
                m5.p pVar = this.f12120r;
                pVar.f11612d.e(new l(pVar, kVarO, false));
            }
        }
    }

    @Override // q5.b
    public final void e(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            j jVarO = vd.a.o((u5.p) it.next());
            s sVar = this.f12125x;
            if (!sVar.f(jVarO)) {
                p.d().a(f12118z, "Constraints met: Scheduling work ID " + jVarO);
                this.f12120r.H(sVar.r(jVarO), null);
            }
        }
    }

    @Override // m5.i
    public final void f(u5.p... pVarArr) {
        if (this.f12126y == null) {
            this.f12126y = Boolean.valueOf(k.a(this.f12119i, this.f12120r.f11610b));
        }
        if (!this.f12126y.booleanValue()) {
            p.d().e(f12118z, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f12124v) {
            this.f12120r.f11614f.a(this);
            this.f12124v = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (u5.p pVar : pVarArr) {
            if (!this.f12125x.f(vd.a.o(pVar))) {
                long jA = pVar.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pVar.f17682b == 1) {
                    if (jCurrentTimeMillis < jA) {
                        a aVar = this.f12123u;
                        if (aVar != null) {
                            c cVar = aVar.f12116b;
                            HashMap map = aVar.f12117c;
                            Runnable runnable = (Runnable) map.remove(pVar.f17681a);
                            if (runnable != null) {
                                cVar.f11571i.removeCallbacks(runnable);
                            }
                            androidx.fragment.app.d dVar = new androidx.fragment.app.d(12, aVar, pVar);
                            map.put(pVar.f17681a, dVar);
                            cVar.f11571i.postDelayed(dVar, pVar.a() - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        androidx.work.d dVar2 = pVar.j;
                        if (dVar2.f2329c) {
                            p.d().a(f12118z, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (dVar2.f2334h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f17681a);
                        } else {
                            p.d().a(f12118z, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f12125x.f(vd.a.o(pVar))) {
                        p.d().a(f12118z, "Starting work for " + pVar.f17681a);
                        m5.p pVar2 = this.f12120r;
                        s sVar = this.f12125x;
                        sVar.getClass();
                        pVar2.H(sVar.r(vd.a.o(pVar)), null);
                    }
                }
            }
        }
        synchronized (this.w) {
            try {
                if (!hashSet.isEmpty()) {
                    p.d().a(f12118z, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f12122t.addAll(hashSet);
                    this.f12121s.B(this.f12122t);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
