package li;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9972b;

    public h(int i10, List list) {
        kotlin.jvm.internal.l.f("items", list);
        this.f9971a = list;
        this.f9972b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.l.a(this.f9971a, hVar.f9971a) && this.f9972b == hVar.f9972b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9972b) + (this.f9971a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuShortcutState(items=" + this.f9971a + ", version=" + this.f9972b + ")";
    }
}
