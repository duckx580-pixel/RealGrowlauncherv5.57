package ih;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    @Override // ih.d
    public final int a(int i10) {
        return ((-i10) >> 31) & (f().nextInt() >>> (32 - i10));
    }

    @Override // ih.d
    public final int b() {
        return f().nextInt();
    }

    @Override // ih.d
    public final long d() {
        return f().nextLong();
    }

    public abstract Random f();
}
