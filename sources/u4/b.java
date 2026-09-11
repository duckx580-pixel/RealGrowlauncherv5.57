package u4;

import a4.u;
import hd.b0;
import java.util.ArrayList;
import java.util.Iterator;
import o0.n0;
import o0.p;
import o0.z0;
import oh.f0;
import rg.q;
import rg.s;
import rh.d0;
import rh.h;
import t4.l;
import t4.m1;
import t4.o;
import t4.t;
import t4.t0;
import th.m;
import wg.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f17632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f17633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f17634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f17635d;

    static {
        b0 b0Var = l.f16562b;
        if (b0Var == null) {
            b0Var = new b0(15);
        }
        l.f16562b = b0Var;
    }

    public b(h hVar) {
        this.f17632a = hVar;
        vh.d dVar = f0.f12869a;
        ph.d dVar2 = m.f17224a;
        o oVar = new o(0, 0, s.f14664i);
        n0 n0Var = n0.f12510u;
        this.f17633b = p.I(oVar, n0Var);
        a aVar = new a(this, new u5.l(this), dVar2);
        this.f17634c = aVar;
        t4.e eVar = (t4.e) aVar.f17629k.f14808i.getValue();
        if (eVar == null) {
            t tVar = e.f17643a;
            eVar = new t4.e(tVar.f16629a, tVar.f16630b, tVar.f16631c, tVar, null);
        }
        this.f17635d = p.I(eVar, n0Var);
    }

    public static final void a(b bVar) {
        t0 t0Var = bVar.f17634c.f17622c;
        int i10 = t0Var.f16635c;
        int i11 = t0Var.f16636d;
        ArrayList arrayList = t0Var.f16633a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q.S(arrayList2, ((m1) it.next()).f16581b);
        }
        bVar.f17633b.setValue(new o(i10, i11, arrayList2));
    }

    public final Object b(i iVar) throws Throwable {
        this.f17634c.f17629k.collect(new u(new d0(5, this), 2), iVar);
        return vg.a.f18663i;
    }
}
