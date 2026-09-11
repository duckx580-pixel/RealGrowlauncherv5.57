package xd;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import lc.n;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static j f19600h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19605e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19603c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19602b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19601a = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19607g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19606f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qe.e f19604d = (qe.e) i8.a.e(qe.e.class);

    public j() {
        if (n.f9913u == null) {
            n nVar = new n(28, false);
            nVar.f9915r = new HashMap();
            n.f9913u = nVar;
        }
        n nVar2 = n.f9913u;
        synchronized (((HashMap) nVar2.f9915r)) {
            ((HashMap) nVar2.f9915r).put(new Integer(hashCode()), this);
        }
    }

    public static j c() {
        if (f19600h == null) {
            f19600h = new j();
        }
        return f19600h;
    }

    public final void a() {
        this.f19605e = System.nanoTime();
        this.f19601a = 0;
        this.f19607g = 0;
        e(new qe.a(4, "native_initialization_started", (Object) null));
    }

    public final void b(boolean z3) {
        long jNanoTime = System.nanoTime();
        long j = this.f19603c;
        if (j == 0 || jNanoTime == 0) {
            ie.c.a("sendPrivacyResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else {
            e(z3 ? new qe.a(4, "native_privacy_request_success_time", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(jNanoTime - j))) : new qe.a(4, "native_privacy_request_failure_time", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(jNanoTime - j))));
        }
    }

    public final i d() {
        i iVar = new i();
        iVar.put("c_retry", String.valueOf(this.f19601a));
        iVar.put("wv_retry", String.valueOf(this.f19607g));
        return iVar;
    }

    public final void e(qe.a aVar) {
        this.f19604d.a(aVar);
    }
}
