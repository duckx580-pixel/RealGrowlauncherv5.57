package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Queue f17102i;

    public x(SynchronousQueue synchronousQueue) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, timeUnit);
        super(1, 4, 30L, timeUnit, synchronousQueue, new RejectedExecutionHandler(concurrentLinkedQueue) { // from class: t6.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Queue f17089a;

            {
                this.f17089a = concurrentLinkedQueue;
            }

            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Queue queue = this.f17089a;
                kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, queue);
                kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, runnable);
                kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, threadPoolExecutor);
                queue.add(runnable);
            }
        });
        this.f17102i = concurrentLinkedQueue;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, runnable);
        super.afterExecute(runnable, th2);
        if (th2 != null) {
            m3.g(s6.h.f15212b, 33, "Error while executing task: " + runnable, th2, true, true, true, false, 64);
            return;
        }
        try {
            synchronized (this) {
                int size = this.f17102i.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Runnable runnable2 = (Runnable) this.f17102i.poll();
                    if (runnable2 == null) {
                        break;
                    }
                    execute(runnable2);
                }
            }
        } catch (Throwable th3) {
            m3.g(s6.h.f15212b, 33, "Error while executing rejected tasks", th3, true, true, true, false, 64);
        }
    }
}
