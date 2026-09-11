package el;

import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {
    public a(g gVar, int i10, Optional optional) {
        super(gVar, optional);
        if (i10 == 0) {
            throw new NullPointerException("Flow style must be provided.");
        }
    }
}
