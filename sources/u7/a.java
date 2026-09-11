package u7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b8.a0;
import b8.n0;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l8.d;
import t6.n;
import y7.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f17716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f17717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17719d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f17720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f17721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17722g;

    public a(Context context) {
        a0.h(context);
        Context applicationContext = context.getApplicationContext();
        this.f17721f = applicationContext != null ? applicationContext : context;
        this.f17718c = false;
        this.f17722g = -1L;
    }

    public static n0 a(Context context) {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            n0 n0VarE = aVar.e();
            d(n0VarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return n0VarE;
        } finally {
        }
    }

    public static void d(n0 n0Var, long j, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (n0Var != null) {
                map.put("limit_ad_tracking", true != n0Var.f2841c ? "0" : "1");
                String str = n0Var.f2840b;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new b(map).start();
        }
    }

    public final void b() {
        a0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f17721f == null || this.f17716a == null) {
                    return;
                }
                try {
                    if (this.f17718c) {
                        f8.a.a().b(this.f17721f, this.f17716a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f17718c = false;
                this.f17717b = null;
                this.f17716a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        a0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f17718c) {
                    b();
                }
                Context context = this.f17721f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = e.f20181b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    n nVar = new n(1);
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!f8.a.a().c(context, context.getClass().getName(), intent, nVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f17716a = nVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = nVar.a();
                            int i10 = l8.c.f9845d;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f17717b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new l8.b(iBinderA);
                            this.f17718c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new pe.a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final n0 e() {
        n0 n0Var;
        a0.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f17718c) {
                    synchronized (this.f17719d) {
                        c cVar = this.f17720e;
                        if (cVar == null || !cVar.f17727t) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f17718c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                a0.h(this.f17716a);
                a0.h(this.f17717b);
                try {
                    l8.b bVar = (l8.b) this.f17717b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z3 = true;
                    Parcel parcelC = bVar.c(parcelObtain, 1);
                    String string = parcelC.readString();
                    parcelC.recycle();
                    l8.b bVar2 = (l8.b) this.f17717b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = l8.a.f9843a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelC2 = bVar2.c(parcelObtain2, 2);
                    if (parcelC2.readInt() == 0) {
                        z3 = false;
                    }
                    parcelC2.recycle();
                    n0Var = new n0(2, string, z3);
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f17719d) {
            c cVar2 = this.f17720e;
            if (cVar2 != null) {
                cVar2.f17726s.countDown();
                try {
                    this.f17720e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f17722g;
            if (j > 0) {
                this.f17720e = new c(this, j);
            }
        }
        return n0Var;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
