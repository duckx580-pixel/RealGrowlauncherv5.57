package androidx.work;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Worker f2397i;

    public w(Worker worker) {
        this.f2397i = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f2397i;
        try {
            worker.mFuture.i(worker.doWork());
        } catch (Throwable th2) {
            worker.mFuture.j(th2);
        }
    }
}
