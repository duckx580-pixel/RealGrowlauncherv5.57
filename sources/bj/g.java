package bj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f3110c = new g(rg.l.B0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vd.a f3112b;

    public g(Set set, vd.a aVar) {
        this.f3111a = set;
        this.f3112b = aVar;
    }

    public final void a(String str, eh.a aVar) {
        kotlin.jvm.internal.l.f("hostname", str);
        Iterator it = this.f3111a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.l.a(gVar.f3111a, this.f3111a) && kotlin.jvm.internal.l.a(gVar.f3112b, this.f3112b);
    }

    public final int hashCode() {
        int iHashCode = (this.f3111a.hashCode() + 1517) * 41;
        vd.a aVar = this.f3112b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
