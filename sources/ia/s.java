package ia;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.e0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc.n f8243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f8244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f8245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fa.a f8246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8247e = new AtomicBoolean(false);

    public s(lc.n nVar, e0 e0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, fa.a aVar) {
        this.f8243a = nVar;
        this.f8244b = e0Var;
        this.f8245c = uncaughtExceptionHandler;
        this.f8246d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th2 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f8246d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8245c;
        AtomicBoolean atomicBoolean = this.f8247e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    this.f8243a.m(this.f8244b, thread, th2);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e8) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e8);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            atomicBoolean.set(false);
        } catch (Throwable th3) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
