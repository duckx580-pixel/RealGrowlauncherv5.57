package tf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17162b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f17164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f17165e;

    public a(c cVar) {
        this.f17165e = cVar;
        this.f17161a = new int[cVar.f17169b + 5];
    }

    public final void a() {
        int iMax = 0;
        for (int i10 = 0; i10 < this.f17162b; i10++) {
            iMax = Math.max(iMax, this.f17161a[i10]);
        }
        this.f17163c = iMax;
    }
}
