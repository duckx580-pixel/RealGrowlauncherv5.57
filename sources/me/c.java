package me;

import java.io.Serializable;
import java.util.Map;
import k0.g;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f11674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11679f;

    public c(Serializable serializable, int i10, Map map, String str, String str2, String str3) {
        l.f("headers", map);
        this.f11674a = serializable;
        this.f11678e = i10;
        this.f11676c = map;
        this.f11679f = str;
        this.f11677d = str2;
        this.f11675b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11674a.equals(cVar.f11674a) && this.f11678e == cVar.f11678e && l.a(this.f11676c, cVar.f11676c) && this.f11679f.equals(cVar.f11679f) && this.f11677d.equals(cVar.f11677d) && this.f11675b.equals(cVar.f11675b);
    }

    public final int hashCode() {
        return this.f11675b.hashCode() + android.support.v4.media.session.a.i(android.support.v4.media.session.a.i((this.f11676c.hashCode() + android.support.v4.media.session.a.z(this.f11678e, this.f11674a.hashCode() * 31, 31)) * 31, 31, this.f11679f), 31, this.f11677d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponse(body=");
        sb2.append(this.f11674a);
        sb2.append(", statusCode=");
        sb2.append(this.f11678e);
        sb2.append(", headers=");
        sb2.append(this.f11676c);
        sb2.append(", urlString=");
        sb2.append(this.f11679f);
        sb2.append(", protocol=");
        sb2.append(this.f11677d);
        sb2.append(", client=");
        return g.k(sb2, this.f11675b, ')');
    }
}
