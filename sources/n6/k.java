package n6;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f12150i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f12151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i6.e f12152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12154u = true;

    public k(z5.h hVar) {
        this.f12150i = new WeakReference(hVar);
    }

    public final synchronized void a() {
        o oVar;
        i6.e hVar;
        try {
            z5.h hVar2 = (z5.h) this.f12150i.get();
            if (hVar2 != null) {
                if (this.f12152s == null) {
                    if (hVar2.f20632d.f12143b) {
                        Context context = hVar2.f20629a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) i3.c.b(context, ConnectivityManager.class);
                        if (connectivityManager == null || i3.f.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                            hVar = new zd.h();
                        } else {
                            try {
                                hVar = new mf.e(connectivityManager, this);
                            } catch (Exception unused) {
                                hVar = new zd.h();
                            }
                        }
                    } else {
                        hVar = new zd.h();
                    }
                    this.f12152s = hVar;
                    this.f12154u = hVar.a();
                }
                oVar = o.f13926a;
            } else {
                oVar = null;
            }
            if (oVar == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f12153t) {
                return;
            }
            this.f12153t = true;
            Context context = this.f12151r;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            i6.e eVar = this.f12152s;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.f12150i.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        try {
            if ((((z5.h) this.f12150i.get()) != null ? o.f13926a : null) == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        o oVar;
        try {
            z5.h hVar = (z5.h) this.f12150i.get();
            if (hVar != null) {
                h6.c cVar = (h6.c) hVar.f20631c.getValue();
                if (cVar != null) {
                    cVar.f7589a.k(i10);
                    h6.g gVar = cVar.f7590b;
                    synchronized (gVar) {
                        if (i10 >= 10 && i10 != 20) {
                            gVar.b();
                        }
                    }
                }
                oVar = o.f13926a;
            } else {
                oVar = null;
            }
            if (oVar == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
