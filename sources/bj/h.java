package bj;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        kotlin.jvm.internal.l.f("a", str);
        kotlin.jvm.internal.l.f("b", str2);
        int iMin = Math.min(str.length(), str2.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = str.charAt(i10);
            char cCharAt2 = str2.charAt(i10);
            if (cCharAt != cCharAt2) {
                return kotlin.jvm.internal.l.g(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
