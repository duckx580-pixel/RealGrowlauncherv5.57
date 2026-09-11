package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements k1, eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12876i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f12877r;

    public /* synthetic */ h0(int i10, Object obj) {
        this.f12876i = i10;
        this.f12877r = obj;
    }

    public final void a(Throwable th2) {
        switch (this.f12876i) {
            case 0:
                ((g0) this.f12877r).dispose();
                break;
            default:
                ((eh.c) this.f12877r).invoke(th2);
                break;
        }
    }

    @Override // eh.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f12876i) {
            case 0:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return qg.o.f13926a;
    }

    public final String toString() {
        switch (this.f12876i) {
            case 0:
                return "DisposeOnCancel[" + ((g0) this.f12877r) + ']';
            default:
                return "InvokeOnCancel[" + ((eh.c) this.f12877r).getClass().getSimpleName() + '@' + x.l(this) + ']';
        }
    }
}
