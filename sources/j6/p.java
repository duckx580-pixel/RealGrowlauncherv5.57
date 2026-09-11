package j6;

import java.util.Map;
import rg.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f8866b = new p(t.f14665i);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8867a;

    public p(Map map) {
        this.f8867a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return kotlin.jvm.internal.l.a(this.f8867a, ((p) obj).f8867a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8867a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f8867a + ')';
    }
}
