package s4;

import java.util.Iterator;
import java.util.List;
import r4.c0;
import r4.h0;
import r4.i0;
import r4.v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@h0("dialog")
public final class l extends i0 {
    @Override // r4.i0
    public final v a() {
        w0.a aVar = e.f15153a;
        return new k(this);
    }

    @Override // r4.i0
    public final void d(List list, c0 c0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((r4.k) it.next());
        }
    }

    @Override // r4.i0
    public final void e(r4.k kVar, boolean z3) {
        b().e(kVar, z3);
        int iG0 = rg.l.g0((Iterable) b().f14534f.f14808i.getValue(), kVar);
        int i10 = 0;
        for (Object obj : (Iterable) b().f14534f.f14808i.getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                sb.c.N();
                throw null;
            }
            r4.k kVar2 = (r4.k) obj;
            if (i10 > iG0) {
                b().b(kVar2);
            }
            i10 = i11;
        }
    }
}
