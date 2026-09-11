package s8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.o0 f15340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f15341b;

    public f3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.o0 o0Var) {
        this.f15341b = appMeasurementDynamiteService;
        this.f15340a = o0Var;
    }

    @Override // s8.g1
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f15340a.i(j, bundle, str, str2);
        } catch (RemoteException e8) {
            y0 y0Var = this.f15341b.f4109d;
            if (y0Var != null) {
                i0 i0Var = y0Var.f15665y;
                y0.k(i0Var);
                i0Var.f15413z.c("Event listener threw exception", e8);
            }
        }
    }
}
