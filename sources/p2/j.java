package p2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f13274b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f13275c = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f13276d = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13277a;

    public j(int i10) {
        this.f13277a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f13277a == ((j) obj).f13277a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13277a;
    }

    public final String toString() {
        int i10 = this.f13277a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return k0.g.k(new StringBuilder("TextDecoration["), w9.a.n(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
