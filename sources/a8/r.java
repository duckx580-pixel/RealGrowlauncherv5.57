package a8;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements b8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7.d f534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f535c;

    public r(x xVar, z7.d dVar, boolean z3) {
        this.f533a = new WeakReference(xVar);
        this.f534b = dVar;
        this.f535c = z3;
    }

    @Override // b8.d
    public final void a(y7.a aVar) {
        x xVar = (x) this.f533a.get();
        if (xVar == null) {
            return;
        }
        Lock lock = xVar.f561r;
        b8.a0.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == xVar.f560i.f461q.w);
        lock.lock();
        try {
            if (!xVar.h(0)) {
                lock.unlock();
                return;
            }
            if (!aVar.j()) {
                xVar.f(aVar, this.f534b, this.f535c);
            }
            if (xVar.j()) {
                xVar.g();
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
