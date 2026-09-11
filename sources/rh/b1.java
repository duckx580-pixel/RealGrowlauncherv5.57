package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14690a;

    @Override // rh.a1
    public final h a(sh.a0 a0Var) {
        switch (this.f14690a) {
            case 0:
                return new k();
            default:
                return new a6.i(new a4.e(26, a0Var, (ug.c) null));
        }
    }

    public final String toString() {
        switch (this.f14690a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
