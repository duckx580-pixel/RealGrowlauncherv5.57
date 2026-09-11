package s7;

import android.util.SparseArray;
import e7.b;
import java.util.HashMap;
import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f15224a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f15225b;

    static {
        HashMap map = new HashMap();
        f15225b = map;
        map.put(b.f5414i, 0);
        map.put(b.f5415r, 1);
        map.put(b.f5416s, 2);
        for (b bVar : map.keySet()) {
            f15224a.append(((Integer) f15225b.get(bVar)).intValue(), bVar);
        }
    }

    public static int a(b bVar) {
        Integer num = (Integer) f15225b.get(bVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + bVar);
    }

    public static b b(int i10) {
        b bVar = (b) f15224a.get(i10);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(g.d(i10, "Unknown Priority for value "));
    }
}
