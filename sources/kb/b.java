package kb;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9559b;

    public b(Set set, c cVar) {
        this.f9558a = a(set);
        this.f9559b = cVar;
    }

    public static String a(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f9556a);
            sb2.append('/');
            sb2.append(aVar.f9557b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }
}
