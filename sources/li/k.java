package li;

import a8.w0;
import java.util.ArrayList;
import java.util.List;
import t4.b1;
import t4.c1;
import t4.d1;
import t4.e1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f9978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9980c;

    public k(String str, List list) {
        kotlin.jvm.internal.l.f("allData", list);
        this.f9978a = new w0(5);
        this.f9979b = list;
        this.f9980c = str;
    }

    public final e1 a(b1 b1Var) {
        String str = this.f9980c;
        try {
            Integer num = (Integer) b1Var.a();
            int iIntValue = num != null ? num.intValue() : 0;
            int length = str.length();
            List list = this.f9979b;
            if (length != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (nh.h.M((String) obj, str, true)) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            int i10 = iIntValue * 20;
            int iMin = Math.min(i10 + 20, list.size());
            if (i10 >= list.size()) {
                return new d1(rg.s.f14664i, iIntValue > 0 ? new Integer(iIntValue - 1) : null, null);
            }
            return new d1(list.subList(i10, iMin), iIntValue > 0 ? new Integer(iIntValue - 1) : null, iMin < list.size() ? new Integer(iIntValue + 1) : null);
        } catch (Exception e8) {
            return new c1(e8);
        }
    }
}
