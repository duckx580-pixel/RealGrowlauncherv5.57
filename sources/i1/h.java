package i1;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7994d;

    public h(float f9, float f10, int i10, int i11, int i12) {
        f10 = (i12 & 2) != 0 ? 4.0f : f10;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f7991a = f9;
        this.f7992b = f10;
        this.f7993c = i10;
        this.f7994d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7991a == hVar.f7991a && this.f7992b == hVar.f7992b && this.f7993c == hVar.f7993c && this.f7994d == hVar.f7994d;
    }

    public final int hashCode() {
        return android.support.v4.media.session.a.z(this.f7994d, android.support.v4.media.session.a.z(this.f7993c, h0.a(Float.hashCode(this.f7991a) * 31, this.f7992b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f7991a);
        sb2.append(", miter=");
        sb2.append(this.f7992b);
        sb2.append(", cap=");
        String str = "Unknown";
        int i10 = this.f7993c;
        sb2.append((Object) (i10 == 0 ? "Butt" : i10 == 1 ? "Round" : i10 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i11 = this.f7994d;
        if (i11 == 0) {
            str = "Miter";
        } else if (i11 == 1) {
            str = "Round";
        } else if (i11 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
