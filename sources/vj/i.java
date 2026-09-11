package vj;

import java.util.NoSuchElementException;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ck.b implements c {
    public final d c(String str) {
        d dVar = (d) get(str);
        if (dVar != null) {
            return dVar;
        }
        throw new NoSuchElementException(h0.f("Key '", str, "' does not exit found"));
    }
}
