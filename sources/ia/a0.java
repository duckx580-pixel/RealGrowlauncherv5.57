package ia;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f8173a = f.a("awaitEvenIfOnMainThread task continuation executor");

    public static Object a(v8.l lVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        lVar.g(f8173a, new com.google.gson.internal.b(6, countDownLatch));
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (lVar.e()) {
            return lVar.c();
        }
        if (lVar.f18639d) {
            throw new CancellationException("Task is already canceled");
        }
        if (lVar.h()) {
            throw new IllegalStateException(lVar.b());
        }
        throw new TimeoutException();
    }
}
