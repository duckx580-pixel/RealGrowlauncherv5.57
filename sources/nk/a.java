package nk;

import rk.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[][] f12357a = {"alnum".getBytes(), "alpha".getBytes(), "blank".getBytes(), "cntrl".getBytes(), "digit".getBytes(), "graph".getBytes(), "lower".getBytes(), "print".getBytes(), "punct".getBytes(), "space".getBytes(), "upper".getBytes(), "xdigit".getBytes(), "ascii".getBytes(), "word".getBytes()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f12358b = {13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 14, 12};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f12359c = new c(19, 1);

    static {
        int i10 = 0;
        while (true) {
            int[] iArr = f12358b;
            if (i10 >= iArr.length) {
                return;
            }
            f12359c.q(f12357a[i10], Integer.valueOf(iArr[i10]));
            i10++;
        }
    }
}
