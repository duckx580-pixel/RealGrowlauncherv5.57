package zc;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f20751a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f20752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile long f20753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f20754d;

    static {
        a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), false);
    }

    public static void a(long j, long j10, boolean z3) {
        synchronized (c5.class) {
            try {
                f20751a = z3;
                f20752b = j;
                f20753c = j10;
                f20754d = f20752b - f20753c;
                SystemClock.elapsedRealtime();
                System.currentTimeMillis();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static long b() {
        return SystemClock.elapsedRealtime() + f20754d;
    }
}
