package u7;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f17724i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f17725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CountDownLatch f17726s = new CountDownLatch(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17727t = false;

    public c(a aVar, long j) {
        this.f17724i = new WeakReference(aVar);
        this.f17725r = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f17724i;
        try {
            if (this.f17726s.await(this.f17725r, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f17727t = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f17727t = true;
            }
        }
    }
}
