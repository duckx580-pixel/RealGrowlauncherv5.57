package z4;

import java.util.List;
import k0.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f20597e;

    public b(String str, String str2, String str3, List list, List list2) {
        l.f("columnNames", list);
        l.f("referenceColumnNames", list2);
        this.f20593a = str;
        this.f20594b = str2;
        this.f20595c = str3;
        this.f20596d = list;
        this.f20597e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.a(this.f20593a, bVar.f20593a) && l.a(this.f20594b, bVar.f20594b) && l.a(this.f20595c, bVar.f20595c) && l.a(this.f20596d, bVar.f20596d)) {
            return l.a(this.f20597e, bVar.f20597e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20597e.hashCode() + g.a(android.support.v4.media.session.a.i(android.support.v4.media.session.a.i(this.f20593a.hashCode() * 31, 31, this.f20594b), 31, this.f20595c), 31, this.f20596d);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f20593a + "', onDelete='" + this.f20594b + " +', onUpdate='" + this.f20595c + "', columnNames=" + this.f20596d + ", referenceColumnNames=" + this.f20597e + '}';
    }
}
