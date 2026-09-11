package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends y0.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12611c;

    public v1(float f9) {
        this.f12611c = f9;
    }

    @Override // y0.a0
    public final void a(y0.a0 a0Var) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", a0Var);
        this.f12611c = ((v1) a0Var).f12611c;
    }

    @Override // y0.a0
    public final y0.a0 b() {
        return new v1(this.f12611c);
    }
}
