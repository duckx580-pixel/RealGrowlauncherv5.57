package bl;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends al.c {
    @Override // wk.a
    public final Object b(el.c cVar) {
        String strSubstring = ((el.e) cVar).f5565e;
        if (".inf".equals(strSubstring)) {
            return Double.valueOf(Double.POSITIVE_INFINITY);
        }
        if ("-.inf".equals(strSubstring)) {
            return Double.valueOf(Double.NEGATIVE_INFINITY);
        }
        if (".nan".equals(strSubstring)) {
            return Double.valueOf(Double.NaN);
        }
        char cCharAt = strSubstring.charAt(0);
        int i10 = 1;
        if (cCharAt == '-') {
            strSubstring = strSubstring.substring(1);
            i10 = -1;
        } else if (cCharAt == '+') {
            strSubstring = strSubstring.substring(1);
        }
        return Double.valueOf(Double.valueOf(strSubstring).doubleValue() * ((double) i10));
    }
}
