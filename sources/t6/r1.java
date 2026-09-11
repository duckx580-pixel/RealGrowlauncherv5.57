package t6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f17020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17021e;

    public r1(Object obj, int i10, boolean z3, Map map, f0 f0Var) {
        this.f17019c = obj;
        this.f17018b = i10;
        this.f17021e = z3;
        this.f17017a = new HashMap(map);
        this.f17020d = f0Var;
    }

    public final String a(String str) {
        List list;
        HashMap map = this.f17017a;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            String str2 = (String) it.next();
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                list = (List) map.get(str2);
                break;
            }
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it2 = list.iterator();
        StringBuilder sb2 = new StringBuilder((String) it2.next());
        while (it2.hasNext()) {
            sb2.append(", ");
            sb2.append((String) it2.next());
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r1.class != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (this.f17018b == r1Var.f17018b && this.f17021e == r1Var.f17021e && this.f17019c.equals(r1Var.f17019c) && this.f17017a.equals(r1Var.f17017a)) {
            return this.f17020d.equals(r1Var.f17020d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f17019c.hashCode();
        return this.f17020d.hashCode() + (((((((iHashCode * 31) + this.f17018b) * 31) + (this.f17021e ? 1 : 0)) * 31) + this.f17017a.hashCode()) * 31);
    }
}
