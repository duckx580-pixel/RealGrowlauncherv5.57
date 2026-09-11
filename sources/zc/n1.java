package zc;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21012b;

    static {
        new n1(-1L);
    }

    public n1() {
        this.f21011a = 3600000L;
        try {
            this.f21012b = SystemClock.elapsedRealtime() - 3600000;
        } catch (NullPointerException unused) {
            this.f21012b = -1L;
        }
    }

    public n1(long j) {
        this.f21011a = j;
        this.f21012b = SystemClock.elapsedRealtime();
    }
}
