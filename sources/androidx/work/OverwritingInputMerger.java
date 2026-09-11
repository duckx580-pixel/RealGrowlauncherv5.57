package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // androidx.work.i
    public final g a(ArrayList arrayList) throws Throwable {
        f fVar = new f();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((g) it.next()).f2343a));
        }
        fVar.a(map);
        g gVar = new g(fVar.f2340a);
        g.b(gVar);
        return gVar;
    }
}
