package r4;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14512i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f14513r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(0);
        this.f14512i = i10;
        this.f14513r = kVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f14512i) {
            case 0:
                k kVar = this.f14513r;
                Context context = kVar.f14516i;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new s0(applicationContext instanceof Application ? (Application) applicationContext : null, kVar, kVar.a());
            default:
                k kVar2 = this.f14513r;
                if (!kVar2.f14524z) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                androidx.lifecycle.x xVar = kVar2.f14522x;
                if (xVar.f1943d == androidx.lifecycle.o.f1906i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                h hVar = new h();
                hVar.f14507i = kVar2.f14523y.f367b;
                hVar.f14508r = xVar;
                return ((i) new mf.a(kVar2.getViewModelStore(), hVar, kVar2.getDefaultViewModelCreationExtras()).l(kotlin.jvm.internal.y.a(i.class))).f14509b;
        }
    }
}
