package y7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b8.a0;
import b8.x;
import b8.y;
import b8.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f20203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f20204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile z f20205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f20206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f20207e;

    static {
        new k(0, l.B("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new k(1, l.B("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f20203a = new k(2, l.B("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f20204b = new k(3, l.B("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f20206d = new Object();
    }

    public static r a(String str, m mVar, boolean z3, boolean z10) {
        try {
            b();
            a0.h(f20207e);
            try {
                z zVar = f20205c;
                j8.b bVar = new j8.b(f20207e.getPackageManager());
                x xVar = (x) zVar;
                Parcel parcelZ = xVar.z();
                int i10 = o8.a.f12795a;
                boolean z11 = true;
                parcelZ.writeInt(1);
                int iJ = w9.a.J(parcelZ, 20293);
                w9.a.G(parcelZ, 1, str);
                w9.a.E(parcelZ, 2, mVar);
                w9.a.L(parcelZ, 3, 4);
                parcelZ.writeInt(z3 ? 1 : 0);
                w9.a.L(parcelZ, 4, 4);
                parcelZ.writeInt(z10 ? 1 : 0);
                w9.a.K(parcelZ, iJ);
                o8.a.c(parcelZ, bVar);
                Parcel parcelY = xVar.y(parcelZ, 5);
                if (parcelY.readInt() == 0) {
                    z11 = false;
                }
                parcelY.recycle();
                return z11 ? r.f20213d : new q(new j(z3, str, mVar));
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return new r(false, "module call", e8);
            }
        } catch (k8.b e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return new r(false, "module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    public static void b() {
        z xVar;
        if (f20205c != null) {
            return;
        }
        a0.h(f20207e);
        synchronized (f20206d) {
            try {
                if (f20205c == null) {
                    IBinder iBinderB = k8.e.c(f20207e, k8.e.f9273c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = y.f2875e;
                    if (iBinderB == null) {
                        xVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    f20205c = xVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
