package jh;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ih.a {
    @Override // ih.d
    public final int c() {
        return ThreadLocalRandom.current().nextInt(0, 10000);
    }

    @Override // ih.d
    public final long e(long j, long j10) {
        return ThreadLocalRandom.current().nextLong(j, j10);
    }

    @Override // ih.a
    public final Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.e("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
