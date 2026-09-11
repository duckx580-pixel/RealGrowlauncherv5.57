package ia;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f8252i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f8253r;

    public v(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f8252i = str;
        this.f8253r = executorService;
    }

    @Override // ia.b
    public final void a() {
        String str = this.f8252i;
        ExecutorService executorService = this.f8253r;
        try {
            String strConcat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strConcat, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            String strConcat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strConcat2, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String strF = h0.f("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strF, null);
            }
            executorService.shutdownNow();
        }
    }
}
