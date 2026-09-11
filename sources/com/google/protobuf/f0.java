package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4556a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f4557b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f4558c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4558c = bArr;
        ByteBuffer.wrap(bArr);
        j.f(bArr, 0, 0, false);
    }

    public static void a(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static z c(Object obj, Object obj2) {
        z zVar = (z) ((a) obj);
        x xVar = (x) zVar.f(5);
        xVar.c();
        x.d(xVar.f4674r, zVar);
        a aVar = (a) obj2;
        if (!xVar.f4673i.getClass().isInstance(aVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        xVar.c();
        x.d(xVar.f4674r, (z) aVar);
        return xVar.b();
    }
}
