package lc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final eh.c f9932i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eh.c f9933r;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(int i10) {
        int i11 = (i10 & 1) != 0 ? a.f9883a : 16;
        u uVar = u.f9929r;
        u uVar2 = u.f9930s;
        super(i11, new eb.b(1));
        this.f9932i = uVar;
        this.f9933r = uVar2;
    }

    public static String a(String str) {
        return v.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        eh.c cVar;
        Throwable e8;
        super.afterExecute(runnable, th2);
        if (th2 != null) {
            this.f9933r.invoke(a(th2.toString()));
            this.f9932i.invoke(th2);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e10) {
                i.f9902a.getClass();
                u5.e.a();
                this.f9933r.invoke(a(e10.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                e8 = e11;
                i.f9902a.getClass();
                u5.e.a();
                this.f9933r.invoke(a(e8.toString()));
                cVar = this.f9932i;
                cVar.invoke(e8);
            } catch (ExecutionException e12) {
                i.f9902a.getClass();
                u5.e.a();
                this.f9933r.invoke(a(e12.toString()));
                cVar = this.f9932i;
                e8 = e12.getCause();
                cVar.invoke(e8);
            }
        }
    }
}
