package rg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends sb.c {
    public static int O(Iterable iterable, int i10) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static ArrayList P(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q.S(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
