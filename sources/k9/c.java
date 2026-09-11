package k9;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xd.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f9294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f9295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd.c f9296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f9297e;

    public c(d dVar, Context context, TextPaint textPaint, xd.c cVar) {
        super(8);
        this.f9297e = dVar;
        this.f9294b = context;
        this.f9295c = textPaint;
        this.f9296d = cVar;
    }

    @Override // xd.c
    public final void t(int i10) {
        this.f9296d.t(i10);
    }

    @Override // xd.c
    public final void u(Typeface typeface, boolean z3) {
        this.f9297e.g(this.f9294b, this.f9295c, typeface);
        this.f9296d.u(typeface, z3);
    }
}
