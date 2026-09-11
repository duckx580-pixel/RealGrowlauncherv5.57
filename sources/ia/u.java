package ia;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Number f8251c;

    public u() {
        this.f8249a = 1;
        this.f8250b = Executors.defaultThreadFactory();
        this.f8251c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f8249a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new t(runnable));
                threadNewThread.setName(((String) this.f8250b) + ((AtomicLong) this.f8251c).getAndIncrement());
                return threadNewThread;
            default:
                Thread threadNewThread2 = ((ThreadFactory) this.f8250b).newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + ((AtomicInteger) this.f8251c).getAndIncrement());
                return threadNewThread2;
        }
    }

    public u(String str, AtomicLong atomicLong) {
        this.f8249a = 0;
        this.f8250b = str;
        this.f8251c = atomicLong;
    }
}
