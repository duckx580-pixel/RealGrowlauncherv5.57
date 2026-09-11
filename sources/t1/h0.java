package t1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface h0 {
    i0 a(j0 j0Var, List list, long j);

    default int c(m mVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j((g0) list.get(i11), 1, 2, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, rk.a.G(i10, 0, 13)).a();
    }

    default int e(m mVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = 2;
            arrayList.add(new j((g0) list.get(i11), i12, i12, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, rk.a.G(i10, 0, 13)).a();
    }

    default int h(m mVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new j((g0) list.get(i11), 2, 1, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, rk.a.G(0, i10, 7)).b();
    }

    default int i(m mVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = 1;
            arrayList.add(new j((g0) list.get(i11), i12, i12, 0));
        }
        return a(new o(mVar, mVar.getLayoutDirection()), arrayList, rk.a.G(0, i10, 7)).b();
    }
}
