package s8;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15441i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k2 f15442r;

    public /* synthetic */ j2(k2 k2Var, int i10) {
        this.f15441i = i10;
        this.f15442r = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15441i) {
            case 0:
                k2 k2Var = this.f15442r;
                l2 l2Var = k2Var.f15459s;
                Context context = ((y0) l2Var.f3470r).f15658i;
                ((y0) k2Var.f15459s.f3470r).getClass();
                l2.H(l2Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                break;
            default:
                l2 l2Var2 = this.f15442r.f15459s;
                l2Var2.f15468u = null;
                l2Var2.D();
                break;
        }
    }
}
