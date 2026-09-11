package h8;

import h7.n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7650b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f7651c = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7649a = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7651c.newThread(new n(runnable, 1));
        threadNewThread.setName(this.f7649a + "[" + this.f7650b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
