package uf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cg.d f17897h = new cg.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cg.d f17901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f17904g;

    public m(n nVar, float f9, float f10, int i10, cg.d dVar) {
        this.f17904g = nVar;
        this.f17898a = f9;
        this.f17899b = f10;
        this.f17900c = i10;
        this.f17901d = dVar;
    }

    public final boolean a() {
        c cVar = this.f17904g.f17919p;
        int i10 = this.f17900c;
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        return cVar.getCursorBlink().f17850r || cVar.getEventHandler().f17945e == 0 || cVar.f17844x0;
    }
}
