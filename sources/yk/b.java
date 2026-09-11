package yk;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f20458b = new b("\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f20459c = new b("\u0000\r\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f20460d = new b(" \u0000\r\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f20461e = new b("\t \u0000\r\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f20462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f20463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f20464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f20465i;
    public static final Map j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f20466a;

    static {
        new b("\u0000 \t");
        f20462f = new b("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$_.!~*'()%,[]");
        f20463g = new b("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$_.!~*'()%");
        f20464h = new b("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
        HashMap map = new HashMap();
        map.put('0', "\u0000");
        map.put('a', "\u0007");
        map.put('b', "\b");
        map.put('t', "\t");
        map.put('n', "\n");
        map.put('v', "\u000b");
        map.put('f', "\f");
        map.put('r', "\r");
        map.put('e', "\u001b");
        map.put(' ', " ");
        map.put('\"', "\"");
        map.put('/', "/");
        map.put('\\', "\\");
        map.put('N', "\u0085");
        map.put('_', " ");
        f20465i = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put('x', 2);
        map2.put('u', 4);
        map2.put('U', 8);
        j = Collections.unmodifiableMap(map2);
    }

    public b(String str) {
        boolean[] zArr = new boolean[128];
        this.f20466a = zArr;
        Arrays.fill(zArr, false);
        for (int i10 = 0; i10 < str.length(); i10++) {
            this.f20466a[str.codePointAt(i10)] = true;
        }
    }

    public static String a(String str) {
        Map map = f20465i;
        for (Character ch2 : map.keySet()) {
            String str2 = (String) map.get(ch2);
            if (!" ".equals(str2) && !"/".equals(str2) && !"\"".equals(str2) && str2.equals(str)) {
                return "\\" + ch2;
            }
        }
        return str;
    }

    public final boolean b(int i10) {
        return i10 < 128 && this.f20466a[i10];
    }

    public final boolean c(int i10) {
        return !b(i10);
    }
}
