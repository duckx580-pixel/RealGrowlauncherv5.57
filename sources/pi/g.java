package pi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1.f f13488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eh.e f13490g;

    public g(int i10, String str, String str2, String str3, k1.f fVar, Object obj, eh.e eVar) {
        kotlin.jvm.internal.l.f("icon", fVar);
        kotlin.jvm.internal.l.f("onChange", eVar);
        this.f13484a = i10;
        this.f13485b = str;
        this.f13486c = str2;
        this.f13487d = str3;
        this.f13488e = fVar;
        this.f13489f = obj;
        this.f13490g = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f13484a == gVar.f13484a && this.f13485b.equals(gVar.f13485b) && this.f13486c.equals(gVar.f13486c) && this.f13487d.equals(gVar.f13487d) && kotlin.jvm.internal.l.a(this.f13488e, gVar.f13488e) && kotlin.jvm.internal.l.a(this.f13489f, gVar.f13489f) && kotlin.jvm.internal.l.a(this.f13490g, gVar.f13490g);
    }

    public final int hashCode() {
        int iHashCode = (this.f13488e.hashCode() + android.support.v4.media.session.a.i(android.support.v4.media.session.a.i(android.support.v4.media.session.a.i(Integer.hashCode(this.f13484a) * 31, 31, this.f13485b), 31, this.f13486c), 31, this.f13487d)) * 31;
        Object obj = this.f13489f;
        return this.f13490g.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MenuSetting(type=");
        sb2.append(this.f13484a);
        sb2.append(", alias=");
        sb2.append(this.f13485b);
        sb2.append(", title=");
        k0.g.y(sb2, this.f13486c, ", description=", this.f13487d, ", icon=");
        sb2.append(this.f13488e);
        sb2.append(", value=");
        sb2.append(this.f13489f);
        sb2.append(", onChange=");
        sb2.append(this.f13490g);
        sb2.append(")");
        return sb2.toString();
    }
}
