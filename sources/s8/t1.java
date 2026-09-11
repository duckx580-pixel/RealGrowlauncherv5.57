package s8;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15596i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.m0 f15597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f15598s;

    public /* synthetic */ t1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.m0 m0Var, int i10) {
        this.f15596i = i10;
        this.f15598s = appMeasurementDynamiteService;
        this.f15597r = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15596i) {
            case 0:
                l2 l2VarS = this.f15598s.f4109d.s();
                com.google.android.gms.internal.measurement.m0 m0Var = this.f15597r;
                l2VarS.t();
                l2VarS.u();
                l2VarS.F(new a8.h1(l2VarS, l2VarS.C(false), m0Var, 14));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f15598s;
                e3 e3Var = appMeasurementDynamiteService.f4109d.B;
                y0.h(e3Var);
                com.google.android.gms.internal.measurement.m0 m0Var2 = this.f15597r;
                y0 y0Var = appMeasurementDynamiteService.f4109d;
                e3Var.K(m0Var2, y0Var.Q != null && y0Var.Q.booleanValue());
                break;
        }
    }
}
