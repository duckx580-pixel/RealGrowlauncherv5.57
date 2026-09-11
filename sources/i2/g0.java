package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f8016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f8017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8020e;

    public g0(o oVar, x xVar, int i10, int i11, Object obj) {
        this.f8016a = oVar;
        this.f8017b = xVar;
        this.f8018c = i10;
        this.f8019d = i11;
        this.f8020e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.l.a(this.f8016a, g0Var.f8016a) && kotlin.jvm.internal.l.a(this.f8017b, g0Var.f8017b) && this.f8018c == g0Var.f8018c && this.f8019d == g0Var.f8019d && kotlin.jvm.internal.l.a(this.f8020e, g0Var.f8020e);
    }

    public final int hashCode() {
        o oVar = this.f8016a;
        int iZ = android.support.v4.media.session.a.z(this.f8019d, android.support.v4.media.session.a.z(this.f8018c, (((oVar == null ? 0 : oVar.hashCode()) * 31) + this.f8017b.f8062i) * 31, 31), 31);
        Object obj = this.f8020e;
        return iZ + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f8016a);
        sb2.append(", fontWeight=");
        sb2.append(this.f8017b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i10 = this.f8018c;
        sb2.append((Object) (i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i11 = this.f8019d;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "All";
        } else if (i11 == 2) {
            str = "Weight";
        } else if (i11 == 3) {
            str = "Style";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f8020e);
        sb2.append(')');
        return sb2.toString();
    }
}
