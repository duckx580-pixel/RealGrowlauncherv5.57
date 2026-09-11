package bl;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends al.c {
    @Override // wk.a
    public final Object b(el.c cVar) {
        String str = ((el.e) cVar).f5565e;
        try {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return new BigInteger(str);
            }
        } catch (NumberFormatException unused2) {
            return Long.valueOf(str);
        }
    }
}
