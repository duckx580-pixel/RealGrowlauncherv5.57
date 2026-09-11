package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends d1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f3987v;
    public final /* synthetic */ i1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(i1 i1Var, Bundle bundle, int i10) {
        super(i1Var, true);
        this.f3986u = i10;
        this.w = i1Var;
        this.f3987v = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final void a() {
        switch (this.f3986u) {
            case 0:
                k0 k0Var = this.w.f3823f;
                b8.a0.h(k0Var);
                k0Var.setConditionalUserProperty(this.f3987v, this.f3732i);
                break;
            default:
                k0 k0Var2 = this.w.f3823f;
                b8.a0.h(k0Var2);
                k0Var2.setConsentThirdParty(this.f3987v, this.f3732i);
                break;
        }
    }
}
