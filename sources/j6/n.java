package j6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import rg.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, fh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f8857r = new n(t.f14665i);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f8858i;

    public n(Map map) {
        this.f8858i = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return kotlin.jvm.internal.l.a(this.f8858i, ((n) obj).f8858i);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8858i.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f8858i;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new qg.g(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f8858i + ')';
    }
}
