package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends m0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f12883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o0 f12884t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, long j, f fVar) {
        super(j);
        this.f12884t = o0Var;
        this.f12883s = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12883s.D(this.f12884t);
    }

    @Override // oh.m0
    public final String toString() {
        return super.toString() + this.f12883s;
    }
}
