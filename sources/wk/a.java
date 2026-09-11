package wk;

import dl.f;
import el.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    default void a(c cVar, Object obj) {
        if (cVar.f5561c) {
            throw new IllegalStateException("Not implemented in ".concat(getClass().getName()));
        }
        throw new f("Unexpected recursive structure for Node: " + cVar);
    }

    Object b(c cVar);
}
