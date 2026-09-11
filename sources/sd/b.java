package sd;

import ie.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import qg.e;
import rh.h1;
import rh.w0;
import xd.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f15742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f15743c;

    public b() {
        new ConcurrentLinkedQueue();
        w0.c(-1);
        this.f15743c = w0.c(null);
        this.f15742b = Executors.newSingleThreadExecutor();
        this.f15741a = android.support.v4.media.session.b.p(e.f13909r, new kd.b(4, this));
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, qg.d] */
    public final void a(String str) {
        Object value;
        if (str == null) {
            return;
        }
        h1 h1Var = this.f15743c;
        do {
            value = h1Var.getValue();
        } while (!h1Var.i(value, str));
        j jVarC = j.c();
        synchronized (jVarC) {
            if (!jVarC.f19606f) {
                if (jVarC.f19605e == 0) {
                    c.a("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
                } else {
                    jVarC.e(new qe.a("native_token_availability_latency_config", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jVarC.f19605e)), jVarC.d()));
                }
                if (jVarC.f19602b == 0) {
                    c.a("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
                } else {
                    jVarC.e(new qe.a("native_token_resolution_request_latency", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jVarC.f19602b)), jVarC.d()));
                }
                jVarC.f19606f = true;
            }
        }
        synchronized (((a) this.f15741a.getValue())) {
        }
    }
}
