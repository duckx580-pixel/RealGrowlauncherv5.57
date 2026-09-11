package t6;

import android.content.Context;
import android.content.pm.ProviderInfo;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 extends p4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProviderInfo f17004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f17005h;

    public q4(ProviderInfo providerInfo, a8.h1 h1Var, t0 t0Var) {
        super("af_referrer", providerInfo.authority, h1Var);
        this.f17005h = t0Var;
        this.f17004g = providerInfo;
    }

    @Override // t6.p4
    public final void c(Context context) {
        s8.o2 o2Var = new s8.o2();
        o2Var.f15529s = this;
        o2Var.f15528r = context;
        ((ThreadPoolExecutor) ((t) this.f17005h).y()).execute(o2Var);
    }
}
