package ek;

import java.util.List;
import java.util.stream.Collectors;
import t6.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj.d f5527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m[] f5528b;

    public d(List list, m[] mVarArr) {
        yj.d dVar;
        this.f5528b = mVarArr;
        if (yj.h.f20454a) {
            u uVar = new u();
            u5.l lVar = new u5.l();
            lVar.f17672i = (List) list.stream().map(new ak.c(0)).collect(Collectors.toList());
            uVar.f17063i = lVar;
            dVar = uVar;
        } else {
            kb.c cVar = new kb.c();
            cVar.f9562i = new bk.e(list);
            dVar = cVar;
        }
        this.f5527a = dVar;
    }
}
