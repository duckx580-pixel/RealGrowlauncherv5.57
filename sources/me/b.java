package me;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Map;
import k0.g;
import kotlin.jvm.internal.l;
import rg.t;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f11666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fd.c f11669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f11670i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11673m;

    public b(String str, int i10, Object obj, Map map, int i11, int i12, int i13, int i14) {
        i10 = (i14 & 4) != 0 ? 2 : i10;
        obj = (i14 & 8) != 0 ? null : obj;
        int i15 = i14 & 16;
        t tVar = t.f14665i;
        map = i15 != 0 ? tVar : map;
        i11 = (i14 & 512) != 0 ? 30000 : i11;
        i12 = (i14 & 1024) != 0 ? 30000 : i12;
        i13 = (i14 & 2048) != 0 ? 30000 : i13;
        boolean z3 = (i14 & 8192) == 0;
        l.f("baseURL", str);
        g.s(i10, "method");
        l.f("headers", map);
        g.s(1, "bodyType");
        this.f11662a = str;
        this.j = PredefinedUICustomizationFont.defaultFamily;
        this.f11668g = i10;
        this.f11663b = obj;
        this.f11666e = map;
        this.f11670i = tVar;
        this.f11664c = 1;
        this.f11672l = "https";
        this.f11665d = i11;
        this.f11671k = i12;
        this.f11673m = i13;
        this.f11667f = z3;
        this.f11669h = fd.c.f6083s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f11662a, bVar.f11662a) && this.j.equals(bVar.j) && this.f11668g == bVar.f11668g && l.a(this.f11663b, bVar.f11663b) && this.f11666e.equals(bVar.f11666e) && this.f11670i.equals(bVar.f11670i) && this.f11664c == bVar.f11664c && this.f11672l.equals(bVar.f11672l) && this.f11665d == bVar.f11665d && this.f11671k == bVar.f11671k && this.f11673m == bVar.f11673m && this.f11667f == bVar.f11667f && this.f11669h == bVar.f11669h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    public final int hashCode() {
        int iHashCode = this.f11662a.hashCode();
        int iHashCode2 = this.j.hashCode();
        int iC = t.g.c(this.f11668g);
        Object obj = this.f11663b;
        int iHashCode3 = obj == null ? 0 : obj.hashCode();
        int iHashCode4 = this.f11666e.hashCode();
        int iHashCode5 = this.f11670i.hashCode();
        int iC2 = t.g.c(this.f11664c);
        int iHashCode6 = this.f11672l.hashCode();
        int iHashCode7 = Integer.hashCode(this.f11665d);
        int iHashCode8 = Integer.hashCode(this.f11671k);
        int iHashCode9 = Integer.hashCode(this.f11673m);
        int iHashCode10 = Integer.hashCode(30000);
        boolean z3 = this.f11667f;
        ?? r12 = z3;
        if (z3) {
            r12 = 1;
        }
        return this.f11669h.hashCode() + (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iC) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iC2) * 31) + iHashCode6) * 961) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + r12) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest(baseURL=");
        sb2.append(this.f11662a);
        sb2.append(", path=");
        sb2.append(this.j);
        sb2.append(", method=");
        sb2.append(a.b(this.f11668g));
        sb2.append(", body=");
        sb2.append(this.f11663b);
        sb2.append(", headers=");
        sb2.append(this.f11666e);
        sb2.append(", parameters=");
        sb2.append(this.f11670i);
        sb2.append(", bodyType=");
        int i10 = this.f11664c;
        sb2.append(i10 != 1 ? i10 != 2 ? "null" : "STRING" : "UNKNOWN");
        sb2.append(", scheme=");
        sb2.append(this.f11672l);
        sb2.append(", port=null, connectTimeout=");
        sb2.append(this.f11665d);
        sb2.append(", readTimeout=");
        sb2.append(this.f11671k);
        sb2.append(", writeTimeout=");
        sb2.append(this.f11673m);
        sb2.append(", callTimeout=30000, isProtobuf=");
        sb2.append(this.f11667f);
        sb2.append(", operationType=");
        sb2.append(this.f11669h);
        sb2.append(')');
        return sb2.toString();
    }
}
