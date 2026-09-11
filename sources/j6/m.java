package j6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f8844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f8845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k6.f f8846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k6.e f8847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8851i;
    public final bj.o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f8852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f8853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f8854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f8855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f8856o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, k6.f fVar, k6.e eVar, boolean z3, boolean z10, boolean z11, String str, bj.o oVar, p pVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f8843a = context;
        this.f8844b = config;
        this.f8845c = colorSpace;
        this.f8846d = fVar;
        this.f8847e = eVar;
        this.f8848f = z3;
        this.f8849g = z10;
        this.f8850h = z11;
        this.f8851i = str;
        this.j = oVar;
        this.f8852k = pVar;
        this.f8853l = nVar;
        this.f8854m = bVar;
        this.f8855n = bVar2;
        this.f8856o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (kotlin.jvm.internal.l.a(this.f8843a, mVar.f8843a) && this.f8844b == mVar.f8844b) {
            return (Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.l.a(this.f8845c, mVar.f8845c)) && kotlin.jvm.internal.l.a(this.f8846d, mVar.f8846d) && this.f8847e == mVar.f8847e && this.f8848f == mVar.f8848f && this.f8849g == mVar.f8849g && this.f8850h == mVar.f8850h && kotlin.jvm.internal.l.a(this.f8851i, mVar.f8851i) && kotlin.jvm.internal.l.a(this.j, mVar.j) && kotlin.jvm.internal.l.a(this.f8852k, mVar.f8852k) && kotlin.jvm.internal.l.a(this.f8853l, mVar.f8853l) && this.f8854m == mVar.f8854m && this.f8855n == mVar.f8855n && this.f8856o == mVar.f8856o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8844b.hashCode() + (this.f8843a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f8845c;
        int iC = h0.c(h0.c(h0.c((this.f8847e.hashCode() + ((this.f8846d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f8848f), 31, this.f8849g), 31, this.f8850h);
        String str = this.f8851i;
        return this.f8856o.hashCode() + ((this.f8855n.hashCode() + ((this.f8854m.hashCode() + ((this.f8853l.f8858i.hashCode() + ((this.f8852k.f8867a.hashCode() + ((((iC + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.f3167i)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
