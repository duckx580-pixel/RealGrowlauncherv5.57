package t6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f17028b = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f17029a = new AtomicInteger();

    public s() {
        f17028b.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = f17028b.get();
        int iIncrementAndGet = this.f17029a.incrementAndGet();
        StringBuilder sb2 = new StringBuilder("queue-");
        sb2.append(i10);
        sb2.append("-");
        sb2.append(iIncrementAndGet);
        return new Thread(runnable, sb2.toString());
    }
}
