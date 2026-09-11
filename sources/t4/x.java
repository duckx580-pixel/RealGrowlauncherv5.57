package t4;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f16655g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f16656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f16660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f16661f;

    static {
        List listC = sb.c.C(m1.f16579d);
        r rVar = r.f16616c;
        r rVar2 = r.f16615b;
        f16655g = new x(u.f16637i, listC, 0, 0, new t(rVar, rVar2, rVar2), null);
    }

    public x(u uVar, List list, int i10, int i11, t tVar, t tVar2) {
        this.f16656a = uVar;
        this.f16657b = list;
        this.f16658c = i10;
        this.f16659d = i11;
        this.f16660e = tVar;
        this.f16661f = tVar2;
        if (uVar != u.f16639s && i10 < 0) {
            throw new IllegalArgumentException(k0.g.d(i10, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
        }
        if (uVar != u.f16638r && i11 < 0) {
            throw new IllegalArgumentException(k0.g.d(i11, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
        }
        if (uVar == u.f16637i && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f16656a == xVar.f16656a && kotlin.jvm.internal.l.a(this.f16657b, xVar.f16657b) && this.f16658c == xVar.f16658c && this.f16659d == xVar.f16659d && kotlin.jvm.internal.l.a(this.f16660e, xVar.f16660e) && kotlin.jvm.internal.l.a(this.f16661f, xVar.f16661f);
    }

    public final int hashCode() {
        int iHashCode = (this.f16660e.hashCode() + android.support.v4.media.session.a.z(this.f16659d, android.support.v4.media.session.a.z(this.f16658c, k0.g.a(this.f16656a.hashCode() * 31, 31, this.f16657b), 31), 31)) * 31;
        t tVar = this.f16661f;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.f16657b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((m1) it.next()).f16581b.size();
        }
        int i10 = this.f16658c;
        String strValueOf = i10 != -1 ? String.valueOf(i10) : "none";
        int i11 = this.f16659d;
        String strValueOf2 = i11 != -1 ? String.valueOf(i11) : "none";
        StringBuilder sb2 = new StringBuilder("PageEvent.Insert for ");
        sb2.append(this.f16656a);
        sb2.append(", with ");
        sb2.append(size);
        sb2.append(" items (\n                    |   first item: ");
        m1 m1Var = (m1) rg.l.e0(list3);
        Object objL0 = null;
        sb2.append((m1Var == null || (list2 = m1Var.f16581b) == null) ? null : rg.l.e0(list2));
        sb2.append("\n                    |   last item: ");
        m1 m1Var2 = (m1) rg.l.l0(list3);
        if (m1Var2 != null && (list = m1Var2.f16581b) != null) {
            objL0 = rg.l.l0(list);
        }
        sb2.append(objL0);
        sb2.append("\n                    |   placeholdersBefore: ");
        sb2.append(strValueOf);
        sb2.append("\n                    |   placeholdersAfter: ");
        sb2.append(strValueOf2);
        sb2.append("\n                    |   sourceLoadStates: ");
        sb2.append(this.f16660e);
        sb2.append("\n                    ");
        String string = sb2.toString();
        t tVar = this.f16661f;
        if (tVar != null) {
            string = string + "|   mediatorLoadStates: " + tVar + '\n';
        }
        return nh.i.B(string + "|)");
    }
}
