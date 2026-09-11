package zd;

import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21323b;

    public d(e eVar, JSONObject jSONObject) {
        this.f21322a = eVar;
        this.f21323b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f21322a == dVar.f21322a && l.a(this.f21323b, dVar.f21323b);
    }

    public final int hashCode() {
        int iHashCode = c.f21321r.hashCode();
        int iHashCode2 = this.f21322a.hashCode();
        Object obj = this.f21323b;
        return (((iHashCode * 31) + iHashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "StorageEventInfo(eventType=" + c.f21321r + ", storageType=" + this.f21322a + ", value=" + this.f21323b + ')';
    }
}
