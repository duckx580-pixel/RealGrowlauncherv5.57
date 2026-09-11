package of;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f12844a = Pattern.compile(".*/|\\..*");

    public static int a(int i10, String str, boolean z3) {
        int i11;
        if (z3) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < str.length()) {
                if (i13 == i10) {
                    return i12;
                }
                if (Character.isHighSurrogate(str.charAt(i12)) && (i11 = i12 + 1) < str.length() && Character.isLowSurrogate(str.charAt(i11))) {
                    i12 = i11;
                }
                i13++;
                i12++;
            }
        }
        return i10;
    }
}
