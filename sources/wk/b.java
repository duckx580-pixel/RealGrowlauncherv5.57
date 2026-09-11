package wk;

import dl.c;
import java.util.function.UnaryOperator;
import yk.d;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements UnaryOperator {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        d dVar = (d) obj;
        if (dVar.f20473i == 1) {
            return dVar;
        }
        throw new c(dVar.toString());
    }
}
