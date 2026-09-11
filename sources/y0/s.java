package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0.d f20095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20096d;

    public s(r0.d dVar) {
        this.f20095c = dVar;
    }

    @Override // y0.a0
    public final void a(a0 a0Var) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>", a0Var);
        s sVar = (s) a0Var;
        synchronized (r.f20094b) {
            this.f20095c = sVar.f20095c;
            this.f20096d = sVar.f20096d;
        }
    }

    @Override // y0.a0
    public final a0 b() {
        return new s(this.f20095c);
    }
}
