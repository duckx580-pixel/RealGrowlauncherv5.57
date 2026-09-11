package t6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n4 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16941i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u5.c f16942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f16943s;

    public /* synthetic */ n4(u5.c cVar, d dVar, int i10) {
        this.f16941i = i10;
        this.f16942r = cVar;
        this.f16943s = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16941i) {
            case 0:
                u5.c cVar = this.f16942r;
                d dVar = this.f16943s;
                try {
                    if (cVar.p(new a3(null, null, null))) {
                        dVar.run();
                    }
                } catch (Throwable th2) {
                    s6.h.r(th2.getMessage(), th2);
                    return;
                }
                break;
            default:
                u5.c cVar2 = this.f16942r;
                ExecutorService executorServiceY = ((t) cVar2.f17648r).y();
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorServiceY;
                threadPoolExecutor.execute(new n4(cVar2, this.f16943s, 0));
                break;
        }
    }
}
