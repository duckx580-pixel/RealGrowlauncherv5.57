package j6;

import android.graphics.drawable.Drawable;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f8859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b6.f f8861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h6.a f8862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8865g;

    public o(Drawable drawable, i iVar, b6.f fVar, h6.a aVar, String str, boolean z3, boolean z10) {
        this.f8859a = drawable;
        this.f8860b = iVar;
        this.f8861c = fVar;
        this.f8862d = aVar;
        this.f8863e = str;
        this.f8864f = z3;
        this.f8865g = z10;
    }

    @Override // j6.j
    public final i a() {
        return this.f8860b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.f8859a, oVar.f8859a) && kotlin.jvm.internal.l.a(this.f8860b, oVar.f8860b) && this.f8861c == oVar.f8861c && kotlin.jvm.internal.l.a(this.f8862d, oVar.f8862d) && kotlin.jvm.internal.l.a(this.f8863e, oVar.f8863e) && this.f8864f == oVar.f8864f && this.f8865g == oVar.f8865g;
    }

    public final int hashCode() {
        int iHashCode = (this.f8861c.hashCode() + ((this.f8860b.hashCode() + (this.f8859a.hashCode() * 31)) * 31)) * 31;
        h6.a aVar = this.f8862d;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f8863e;
        return Boolean.hashCode(this.f8865g) + h0.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f8864f);
    }
}
