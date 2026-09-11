package j2;

import i2.w;
import i2.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.g;
import rg.l;
import rg.q;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f8725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8726d;

    public b(x xVar, boolean z3) {
        w[] wVarArr = new w[0];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (wVarArr.length > 0) {
            w wVar = wVarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(g.k(android.support.v4.media.session.a.p("'", str, "' must be unique. Actual [ ["), l.j0(list, null, null, null, null, 63), ']').toString());
            }
            q.S(arrayList, list);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.size() > 0) {
            arrayList2.get(0).getClass();
            throw new ClassCastException();
        }
        this.f8723a = "Lexend";
        this.f8724b = zi.b.f21371a;
        this.f8725c = xVar;
        this.f8726d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f8723a, bVar.f8723a) && kotlin.jvm.internal.l.a(this.f8724b, bVar.f8724b) && kotlin.jvm.internal.l.a(this.f8725c, bVar.f8725c) && this.f8726d == bVar.f8726d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8726d) + android.support.v4.media.session.a.z(0, (((this.f8724b.hashCode() + (this.f8723a.hashCode() * 31)) * 31) + this.f8725c.f8062i) * 31, 31);
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.f8723a + "\", bestEffort=" + this.f8726d + "), weight=" + this.f8725c + ", style=" + ((Object) "Normal") + ')';
    }
}
