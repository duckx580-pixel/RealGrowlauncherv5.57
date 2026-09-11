package r4;

import a0.k0;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f14510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14511b;

    public abstract v a();

    public final m b() {
        m mVar = this.f14510a;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, c0 c0Var) {
        bh.h hVar = new bh.h(new mh.f(new mh.h(rg.l.X(list), new k0(25, this, c0Var), 2), false, new fi.d0(1)));
        while (hVar.hasNext()) {
            b().f((k) hVar.next());
        }
    }

    public void e(k kVar, boolean z3) {
        kotlin.jvm.internal.l.f("popUpTo", kVar);
        List list = (List) b().f14533e.f14808i.getValue();
        if (!list.contains(kVar)) {
            throw new IllegalStateException(("popBackStack was called with " + kVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        k kVar2 = null;
        while (f()) {
            kVar2 = (k) listIterator.previous();
            if (kotlin.jvm.internal.l.a(kVar2, kVar)) {
                break;
            }
        }
        if (kVar2 != null) {
            b().c(kVar2, z3);
        }
    }

    public boolean f() {
        return true;
    }

    public v c(v vVar) {
        return vVar;
    }
}
