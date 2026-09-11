package ia;

import android.util.Log;
import com.google.android.gms.internal.measurement.j3;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ka.e0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8185i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Throwable f8186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Thread f8187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e0 f8188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f8189u;

    public i(n nVar, long j, Throwable th2, Thread thread, e0 e0Var) {
        this.f8189u = nVar;
        this.f8185i = j;
        this.f8186r = th2;
        this.f8187s = thread;
        this.f8188t = e0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f8185i;
        long j10 = j / 1000;
        n nVar = this.f8189u;
        String strF = nVar.f();
        if (strF == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return o1.c.q(null);
        }
        nVar.f8206c.h();
        mf.c cVar = nVar.f8214l;
        cVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strF);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        cVar.u(this.f8186r, this.f8187s, strF, "crash", j10, true);
        nVar.d(j);
        e0 e0Var = this.f8188t;
        nVar.c(false, e0Var);
        new d(nVar.f8209f);
        n.a(nVar, d.f8176b);
        if (!nVar.f8205b.g()) {
            return o1.c.q(null);
        }
        Executor executor = (Executor) nVar.f8208e.f17675a;
        return ((v8.h) ((AtomicReference) e0Var.f9364i).get()).f18622a.f(executor, new j3(this, executor, strF));
    }
}
