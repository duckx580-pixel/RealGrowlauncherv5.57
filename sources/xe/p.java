package xe;

import android.graphics.Paint;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint.FontMetricsInt f19685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19692i;
    public final ye.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zf.a f19693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f19694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f19695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint.FontMetricsInt f19696n;

    public p(int i10, Paint.FontMetricsInt fontMetricsInt, int i11, int i12, int i13, int i14, int i15, int i16, float f9, ye.a aVar, zf.a aVar2, Paint paint, Paint paint2, Paint.FontMetricsInt fontMetricsInt2) {
        kotlin.jvm.internal.l.f("textMetrics", fontMetricsInt);
        kotlin.jvm.internal.l.f("inlayHintRendererProvider", aVar);
        kotlin.jvm.internal.l.f("colorScheme", aVar2);
        kotlin.jvm.internal.l.f("miscPaint", paint);
        kotlin.jvm.internal.l.f("graphPaint", paint2);
        kotlin.jvm.internal.l.f("graphMetrics", fontMetricsInt2);
        this.f19684a = i10;
        this.f19685b = fontMetricsInt;
        this.f19686c = i11;
        this.f19687d = i12;
        this.f19688e = i13;
        this.f19689f = i14;
        this.f19690g = i15;
        this.f19691h = i16;
        this.f19692i = f9;
        this.j = aVar;
        this.f19693k = aVar2;
        this.f19694l = paint;
        this.f19695m = paint2;
        this.f19696n = fontMetricsInt2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f19684a == pVar.f19684a && kotlin.jvm.internal.l.a(this.f19685b, pVar.f19685b) && this.f19686c == pVar.f19686c && this.f19687d == pVar.f19687d && this.f19688e == pVar.f19688e && this.f19689f == pVar.f19689f && this.f19690g == pVar.f19690g && this.f19691h == pVar.f19691h && Float.compare(this.f19692i, pVar.f19692i) == 0 && kotlin.jvm.internal.l.a(this.j, pVar.j) && kotlin.jvm.internal.l.a(this.f19693k, pVar.f19693k) && kotlin.jvm.internal.l.a(this.f19694l, pVar.f19694l) && kotlin.jvm.internal.l.a(this.f19695m, pVar.f19695m) && kotlin.jvm.internal.l.a(this.f19696n, pVar.f19696n);
    }

    public final int hashCode() {
        return this.f19696n.hashCode() + ((this.f19695m.hashCode() + ((this.f19694l.hashCode() + ((this.f19693k.hashCode() + ((this.j.hashCode() + h0.a(android.support.v4.media.session.a.z(this.f19691h, android.support.v4.media.session.a.z(this.f19690g, android.support.v4.media.session.a.z(0, android.support.v4.media.session.a.z(this.f19689f, android.support.v4.media.session.a.z(this.f19688e, android.support.v4.media.session.a.z(this.f19687d, android.support.v4.media.session.a.z(this.f19686c, (this.f19685b.hashCode() + (Integer.hashCode(this.f19684a) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), this.f19692i, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextRowParams(tabWidth=");
        sb2.append(this.f19684a);
        sb2.append(", textMetrics=");
        sb2.append(this.f19685b);
        sb2.append(", textTop=");
        gb.e.j(sb2, this.f19686c, ", textBottom=", this.f19687d, ", textHeight=");
        gb.e.j(sb2, this.f19688e, ", textBaseline=", this.f19689f, ", rowTop=0, rowBottom=");
        gb.e.j(sb2, this.f19690g, ", rowHeight=", this.f19691h, ", roundTextBackgroundFactor=");
        sb2.append(this.f19692i);
        sb2.append(", inlayHintRendererProvider=");
        sb2.append(this.j);
        sb2.append(", colorScheme=");
        sb2.append(this.f19693k);
        sb2.append(", miscPaint=");
        sb2.append(this.f19694l);
        sb2.append(", graphPaint=");
        sb2.append(this.f19695m);
        sb2.append(", graphMetrics=");
        sb2.append(this.f19696n);
        sb2.append(")");
        return sb2.toString();
    }
}
