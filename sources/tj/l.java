package tj;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f17373d = new ArrayDeque(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17376c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17375b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17374a = new ArrayList();

    public l(ArrayList arrayList) {
        this.f17376c = arrayList;
    }

    public final void a(m mVar, int i10) {
        b(mVar.f17385i, i10);
    }

    public final void b(af.a aVar, int i10) {
        if (this.f17375b >= i10) {
            return;
        }
        int i11 = aVar != null ? aVar.f596b : 0;
        List list = this.f17376c;
        if (!list.isEmpty()) {
            if (aVar != null) {
                ((x7.h) aVar.f598d).D();
            } else {
                List list2 = Collections.EMPTY_LIST;
            }
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ((n) it.next()).getClass();
                throw null;
            }
        }
        List list3 = this.f17374a;
        if (!list3.isEmpty() && ((Integer) list3.get(list3.size() - 1)).intValue() == i11) {
            this.f17375b = i10;
            return;
        }
        list3.add(Integer.valueOf(this.f17375b));
        list3.add(Integer.valueOf(i11));
        this.f17375b = i10;
    }
}
