package t6;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends LinkedBlockingQueue {
    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj) {
        Runnable runnable = (Runnable) obj;
        if (isEmpty()) {
            return super.offer(runnable);
        }
        return false;
    }
}
