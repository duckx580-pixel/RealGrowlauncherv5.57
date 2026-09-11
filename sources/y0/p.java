package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0.c f20089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20091e;

    public p(s0.c cVar) {
        this.f20089c = cVar;
    }

    @Override // y0.a0
    public final void a(a0 a0Var) {
        synchronized (r.f20093a) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>", a0Var);
            this.f20089c = ((p) a0Var).f20089c;
            this.f20090d = ((p) a0Var).f20090d;
            this.f20091e = ((p) a0Var).f20091e;
        }
    }

    @Override // y0.a0
    public final a0 b() {
        return new p(this.f20089c);
    }
}
