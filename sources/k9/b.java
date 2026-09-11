package k9;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j3.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xd.c f9292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f9293i;

    public b(d dVar, xd.c cVar) {
        this.f9293i = dVar;
        this.f9292h = cVar;
    }

    @Override // j3.b
    public final void g(int i10) {
        this.f9293i.f9309m = true;
        this.f9292h.t(i10);
    }

    @Override // j3.b
    public final void h(Typeface typeface) {
        d dVar = this.f9293i;
        dVar.f9310n = Typeface.create(typeface, dVar.f9300c);
        dVar.f9309m = true;
        this.f9292h.u(dVar.f9310n, false);
    }
}
