package s8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements ServiceConnection, b8.b, b8.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f15457i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile f0 f15458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l2 f15459s;

    public k2(l2 l2Var) {
        this.f15459s = l2Var;
    }

    @Override // b8.b
    public final void c(int i10) {
        b8.a0.d("MeasurementServiceConnection.onConnectionSuspended");
        y0 y0Var = (y0) this.f15459s.f3470r;
        i0 i0Var = y0Var.f15665y;
        y0.k(i0Var);
        i0Var.D.b("Service connection suspended");
        x0 x0Var = y0Var.f15666z;
        y0.k(x0Var);
        x0Var.B(new j2(this, 0));
    }

    @Override // b8.c
    public final void onConnectionFailed(y7.a aVar) {
        b8.a0.d("MeasurementServiceConnection.onConnectionFailed");
        i0 i0Var = ((y0) this.f15459s.f3470r).f15665y;
        if (i0Var == null || !i0Var.f15297s) {
            i0Var = null;
        }
        if (i0Var != null) {
            i0Var.f15413z.c("Service connection failed", aVar);
        }
        synchronized (this) {
            this.f15457i = false;
            this.f15458r = null;
        }
        x0 x0Var = ((y0) this.f15459s.f3470r).f15666z;
        y0.k(x0Var);
        x0Var.B(new j2(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b8.a0.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f15457i = false;
                i0 i0Var = ((y0) this.f15459s.f3470r).f15665y;
                y0.k(i0Var);
                i0Var.w.b("Service connected with null binder");
                return;
            }
            b0 a0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    a0Var = iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new a0(iBinder);
                    i0 i0Var2 = ((y0) this.f15459s.f3470r).f15665y;
                    y0.k(i0Var2);
                    i0Var2.E.b("Bound to IMeasurementService interface");
                } else {
                    i0 i0Var3 = ((y0) this.f15459s.f3470r).f15665y;
                    y0.k(i0Var3);
                    i0Var3.w.c("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                i0 i0Var4 = ((y0) this.f15459s.f3470r).f15665y;
                y0.k(i0Var4);
                i0Var4.w.b("Service connect failed to get IMeasurementService");
            }
            if (a0Var == null) {
                this.f15457i = false;
                try {
                    f8.a aVarA = f8.a.a();
                    l2 l2Var = this.f15459s;
                    aVarA.b(((y0) l2Var.f3470r).f15658i, l2Var.f15467t);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                x0 x0Var = ((y0) this.f15459s.f3470r).f15666z;
                y0.k(x0Var);
                x0Var.B(new i2(this, a0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b8.a0.d("MeasurementServiceConnection.onServiceDisconnected");
        y0 y0Var = (y0) this.f15459s.f3470r;
        i0 i0Var = y0Var.f15665y;
        y0.k(i0Var);
        i0Var.D.b("Service disconnected");
        x0 x0Var = y0Var.f15666z;
        y0.k(x0Var);
        x0Var.B(new androidx.fragment.app.d(29, this, componentName));
    }

    @Override // b8.b
    public final void v() {
        b8.a0.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                b8.a0.h(this.f15458r);
                b0 b0Var = (b0) this.f15458r.w();
                x0 x0Var = ((y0) this.f15459s.f3470r).f15666z;
                y0.k(x0Var);
                x0Var.B(new i2(this, b0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f15458r = null;
                this.f15457i = false;
            }
        }
    }
}
