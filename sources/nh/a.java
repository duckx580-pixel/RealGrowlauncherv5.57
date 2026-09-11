package nh;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f12288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f12289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Charset f12290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Charset f12291d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.l.e("forName(...)", charsetForName);
        f12288a = charsetForName;
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16BE"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16LE"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("US-ASCII"));
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.l.e("forName(...)", charsetForName2);
        f12289b = charsetForName2;
    }
}
