package va;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18643b;

    public c(String str, Map map) {
        this.f18642a = str;
        this.f18643b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f18642a.equals(cVar.f18642a) && this.f18643b.equals(cVar.f18643b);
    }

    public final int hashCode() {
        return this.f18643b.hashCode() + (this.f18642a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f18642a + ", properties=" + this.f18643b.values() + "}";
    }
}
