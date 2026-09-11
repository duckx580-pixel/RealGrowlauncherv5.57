package ll;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10111b;

    public c0(boolean z3) {
        this.f10111b = z3;
    }

    @Override // ll.r0
    public final void a(h0 h0Var, Object obj) {
        if (obj == null) {
            return;
        }
        h0Var.d(obj.toString(), null, this.f10111b);
    }
}
