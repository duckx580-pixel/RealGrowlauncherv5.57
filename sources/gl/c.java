package gl;

import el.g;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f7243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f7244b;

    public c(g gVar, Pattern pattern) {
        Objects.requireNonNull(gVar);
        Objects.requireNonNull(pattern);
        this.f7243a = gVar;
        this.f7244b = pattern;
    }

    public final String toString() {
        return "Tuple tag=" + this.f7243a + " regexp=" + this.f7244b;
    }
}
