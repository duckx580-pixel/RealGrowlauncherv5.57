package r5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;
import s5.e;
import s5.f;
import u5.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f14589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n7.e f14593e;

    public b(e eVar) {
        l.f("tracker", eVar);
        this.f14589a = eVar;
        this.f14590b = new ArrayList();
        this.f14591c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        l.f("workSpecs", iterable);
        this.f14590b.clear();
        this.f14591c.clear();
        ArrayList arrayList = this.f14590b;
        for (Object obj : iterable) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f14590b;
        ArrayList arrayList3 = this.f14591c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p) it.next()).f17681a);
        }
        if (this.f14590b.isEmpty()) {
            this.f14589a.d(this);
        } else {
            e eVar = this.f14589a;
            eVar.getClass();
            synchronized (eVar.f15185c) {
                try {
                    if (((LinkedHashSet) eVar.f15187e).add(this)) {
                        if (((LinkedHashSet) eVar.f15187e).size() == 1) {
                            eVar.f15186d = eVar.b();
                            androidx.work.p.d().a(f.f15188a, eVar.getClass().getSimpleName() + ": initial state = " + eVar.f15186d);
                            eVar.f();
                        }
                        Object obj2 = eVar.f15186d;
                        this.f14592d = obj2;
                        d(this.f14593e, obj2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d(this.f14593e, this.f14592d);
    }

    public final void d(n7.e eVar, Object obj) {
        if (this.f14590b.isEmpty() || eVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f14590b;
            l.f("workSpecs", arrayList);
            synchronized (eVar.f12174t) {
                q5.b bVar = (q5.b) eVar.f12172r;
                if (bVar != null) {
                    bVar.d(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f14590b;
        l.f("workSpecs", arrayList2);
        synchronized (eVar.f12174t) {
            try {
                ArrayList<p> arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (eVar.g(((p) obj2).f17681a)) {
                        arrayList3.add(obj2);
                    }
                }
                for (p pVar : arrayList3) {
                    androidx.work.p.d().a(q5.c.f13799a, "Constraints met for " + pVar);
                }
                q5.b bVar2 = (q5.b) eVar.f12172r;
                if (bVar2 != null) {
                    bVar2.e(arrayList3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
