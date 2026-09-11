package a8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f471a;

    public i0(f fVar) {
        this.f471a = fVar;
    }

    @Override // a8.b
    public final void a(boolean z3) {
        com.google.android.gms.internal.measurement.f0 f0Var = this.f471a.f444n;
        f0Var.sendMessage(f0Var.obtainMessage(1, Boolean.valueOf(z3)));
    }
}
