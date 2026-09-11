package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends y0.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12614c;

    public w1(int i10) {
        this.f12614c = i10;
    }

    @Override // y0.a0
    public final void a(y0.a0 a0Var) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", a0Var);
        this.f12614c = ((w1) a0Var).f12614c;
    }

    @Override // y0.a0
    public final y0.a0 b() {
        return new w1(this.f12614c);
    }
}
