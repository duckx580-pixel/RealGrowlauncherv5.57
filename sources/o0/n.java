package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12506b;

    public /* synthetic */ n(int i10, Object obj) {
        this.f12505a = i10;
        this.f12506b = obj;
    }

    public final void a() {
        switch (this.f12505a) {
            case 0:
                o oVar = (o) this.f12506b;
                oVar.f12536z--;
                break;
            default:
                y0.u uVar = (y0.u) this.f12506b;
                uVar.j--;
                break;
        }
    }

    public final void b() {
        switch (this.f12505a) {
            case 0:
                ((o) this.f12506b).f12536z++;
                break;
            default:
                ((y0.u) this.f12506b).j++;
                break;
        }
    }
}
