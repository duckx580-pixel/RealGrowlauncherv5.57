package yj;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLong f20449e = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20453d = f20449e.incrementAndGet();

    public g(String str, byte[] bArr) {
        this.f20450a = str;
        this.f20452c = bArr;
        this.f20451b = bArr.length;
    }

    public static g c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return bytes.length == str.length() ? new f(str, bytes) : new e(str, bytes);
    }

    public abstract int a(int i10);

    public abstract int b(int i10);

    public final void d(int i10, int i11, String str) {
        throw new ArrayIndexOutOfBoundsException(str + " index " + i10 + " is out of range 0.." + i11 + " of " + this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[string=\"");
        return k0.g.l(sb2, this.f20450a, "\"]");
    }
}
