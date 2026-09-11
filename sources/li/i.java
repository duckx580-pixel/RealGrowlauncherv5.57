package li;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9974b;

    public i(int i10, List list) {
        kotlin.jvm.internal.l.f("items", list);
        this.f9973a = list;
        this.f9974b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f9973a, iVar.f9973a) && this.f9974b == iVar.f9974b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9974b) + (this.f9973a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuUiState(items=" + this.f9973a + ", version=" + this.f9974b + ")";
    }

    public /* synthetic */ i() {
        this(0, rg.s.f14664i);
    }
}
