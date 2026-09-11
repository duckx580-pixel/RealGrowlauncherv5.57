package com.google.firebase.crashlytics;

import al.h;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import ea.b;
import ia.g;
import ia.k;
import ia.n;
import ia.q;
import java.util.concurrent.atomic.AtomicMarkableReference;
import o1.c;
import v8.l;
import w9.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f4318a;

    public FirebaseCrashlytics(q qVar) {
        this.f4318a = qVar;
    }

    public static FirebaseCrashlytics getInstance() {
        f fVarB = f.b();
        fVarB.a();
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) fVarB.f19152d.a(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public Task checkForUnsentReports() {
        n nVar = this.f4318a.f8230h;
        if (nVar.f8219q.compareAndSet(false, true)) {
            return nVar.f8216n.f18622a;
        }
        Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
        return c.q(Boolean.FALSE);
    }

    public void deleteUnsentReports() {
        n nVar = this.f4318a.f8230h;
        nVar.f8217o.b(Boolean.FALSE);
        l lVar = nVar.f8218p.f18622a;
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f4318a.f8229g;
    }

    public void log(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVar = this.f4318a;
        long j = jCurrentTimeMillis - qVar.f8226d;
        n nVar = qVar.f8230h;
        nVar.f8208e.n(new k(nVar, j, str));
    }

    public void recordException(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        n nVar = this.f4318a.f8230h;
        Thread threadCurrentThread = Thread.currentThread();
        nVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        u5.n nVar2 = nVar.f8208e;
        ia.l lVar = new ia.l(nVar, jCurrentTimeMillis, th2, threadCurrentThread);
        nVar2.getClass();
        nVar2.n(new g(0, lVar));
    }

    public void sendUnsentReports() {
        n nVar = this.f4318a.f8230h;
        nVar.f8217o.b(Boolean.TRUE);
        l lVar = nVar.f8218p.f18622a;
    }

    public void setCrashlyticsCollectionEnabled(boolean z3) {
        this.f4318a.c(Boolean.valueOf(z3));
    }

    public void setCustomKey(String str, boolean z3) {
        this.f4318a.d(str, Boolean.toString(z3));
    }

    public void setCustomKeys(b bVar) {
        throw null;
    }

    public void setUserId(String str) {
        h hVar = this.f4318a.f8230h.f8207d;
        hVar.getClass();
        String strA = ja.b.a(1024, str);
        synchronized (((AtomicMarkableReference) hVar.f643g)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) hVar.f643g).getReference();
                if (strA == null ? str2 == null : strA.equals(str2)) {
                    return;
                }
                ((AtomicMarkableReference) hVar.f643g).set(strA, true);
                ((u5.n) hVar.f639c).n(new ja.k(0, hVar));
            } finally {
            }
        }
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f4318a.c(bool);
    }

    public void setCustomKey(String str, double d10) {
        this.f4318a.d(str, Double.toString(d10));
    }

    public void setCustomKey(String str, float f9) {
        this.f4318a.d(str, Float.toString(f9));
    }

    public void setCustomKey(String str, int i10) {
        this.f4318a.d(str, Integer.toString(i10));
    }

    public void setCustomKey(String str, long j) {
        this.f4318a.d(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.f4318a.d(str, str2);
    }
}
