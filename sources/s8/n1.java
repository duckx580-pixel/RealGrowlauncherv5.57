package s8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f15497i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f15498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f15499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f15500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f15501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f15502v;
    public final /* synthetic */ boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v1 f15503x;

    public n1(v1 v1Var, String str, String str2, long j, Bundle bundle, boolean z3, boolean z10, boolean z11) {
        this.f15503x = v1Var;
        this.f15497i = str;
        this.f15498r = str2;
        this.f15499s = j;
        this.f15500t = bundle;
        this.f15501u = z3;
        this.f15502v = z10;
        this.w = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15503x.C(this.f15497i, this.f15498r, this.f15499s, this.f15500t, this.f15501u, this.f15502v, this.w);
    }
}
