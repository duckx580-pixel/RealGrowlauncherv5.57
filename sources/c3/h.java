package c3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3317m;

    public h(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f3310e = 2;
        } else {
            this.f3310e = 3;
        }
    }

    @Override // c3.g
    public final void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f3312g = i10;
        for (e eVar : this.f3315k) {
            eVar.a(eVar);
        }
    }
}
