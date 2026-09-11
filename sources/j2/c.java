package j2;

import android.graphics.Typeface;
import k0.g;
import oh.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends p3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f8728c;

    public c(f fVar, b bVar) {
        this.f8727b = fVar;
        this.f8728c = bVar;
    }

    @Override // p3.b
    public final void b(int i10) {
        StringBuilder sb2 = new StringBuilder("Failed to load ");
        sb2.append(this.f8728c);
        sb2.append(" (reason=");
        sb2.append(i10);
        sb2.append(", ");
        this.f8727b.o(new IllegalStateException(g.k(sb2, i10 != -4 ? i10 != -3 ? i10 != -2 ? i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown error code" : "The given query was not supported by this provider." : "The provider found the queried font, but it is currently unavailable." : "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml" : "The requested provider was not found on this device." : "The given provider cannot be authenticated with the certificates given." : "Generic error loading font, for example variation settings were not parsable" : "Font was not loaded due to security issues. This usually means the font was attempted to load in a restricted context", ')')));
    }

    @Override // p3.b
    public final void c(Typeface typeface) {
        this.f8727b.resumeWith(typeface);
    }
}
