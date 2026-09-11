package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f3732i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f3733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i1 f3735t;

    public d1(i1 i1Var, boolean z3) {
        this.f3735t = i1Var;
        i1Var.getClass();
        this.f3732i = System.currentTimeMillis();
        this.f3733r = SystemClock.elapsedRealtime();
        this.f3734s = z3;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f3735t;
        if (i1Var.f3822e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e8) {
            i1Var.a(e8, false, this.f3734s);
            b();
        }
    }

    public void b() {
    }
}
