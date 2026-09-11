package k9;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends xd.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f9289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kb.c f9290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9291d;

    public a(kb.c cVar, Typeface typeface) {
        super(8);
        this.f9289b = typeface;
        this.f9290c = cVar;
    }

    @Override // xd.c
    public final void t(int i10) {
        if (this.f9291d) {
            return;
        }
        i9.b bVar = (i9.b) this.f9290c.f9562i;
        if (bVar.k(this.f9289b)) {
            bVar.i(false);
        }
    }

    @Override // xd.c
    public final void u(Typeface typeface, boolean z3) {
        if (this.f9291d) {
            return;
        }
        i9.b bVar = (i9.b) this.f9290c.f9562i;
        if (bVar.k(typeface)) {
            bVar.i(false);
        }
    }
}
