package rg;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    public static void Q(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void R(List list, Comparator comparator) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
