package com.usercentrics.sdk.v2.async.dispatcher;

import com.usercentrics.sdk.ActualKt;
import com.usercentrics.sdk.errors.UsercentricsTimeoutException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainSemaphore implements Semaphore {
    private volatile int current;
    private int timeout = 15000;
    private volatile int waitingQueue;

    @Override // com.usercentrics.sdk.v2.async.dispatcher.Semaphore
    public void acquire() throws UsercentricsTimeoutException {
        if (this.waitingQueue == 0) {
            this.current = 1;
        }
        this.waitingQueue++;
        int i10 = this.waitingQueue;
        long timeInMillis = ActualKt.getTimeInMillis();
        while (ActualKt.getTimeInMillis() - timeInMillis < this.timeout) {
            if (i10 == this.current) {
                return;
            }
        }
        release();
        throw new UsercentricsTimeoutException();
    }

    public final int getTimeout$usercentrics_release() {
        return this.timeout;
    }

    @Override // com.usercentrics.sdk.v2.async.dispatcher.Semaphore
    public void release() {
        this.current++;
    }

    public final void setTimeout$usercentrics_release(int i10) {
        this.timeout = i10;
    }
}
