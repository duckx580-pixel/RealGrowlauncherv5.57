package lc;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f9910d;

    public m(int i10, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f9909c = 1;
        this.f9907a = i10;
        this.f9908b = jCurrentTimeMillis;
        this.f9910d = jSONObject;
        if (!jSONObject.has("euid")) {
            a("euid", UUID.randomUUID().toString());
        }
        if (jSONObject.has("esat")) {
            this.f9909c = jSONObject.optInt("esat", 1);
        } else {
            a("esat", Integer.valueOf(this.f9909c));
        }
    }

    public final void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f9910d.put(str, obj);
        } catch (JSONException e8) {
            i.f9902a.getClass();
            u5.e.a();
            rc.a.INTERNAL.a(e8.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f9907a == mVar.f9907a && this.f9908b == mVar.f9908b && this.f9909c == mVar.f9909c) {
            JSONObject jSONObject = mVar.f9910d;
            JSONObject jSONObject2 = this.f9910d;
            kotlin.jvm.internal.l.f("lhs", jSONObject2);
            kotlin.jvm.internal.l.f("rhs", jSONObject);
            if (r.b(jSONObject2, jSONObject, 0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9910d.toString().hashCode() + h0.b(Integer.hashCode(this.f9907a) * 31, 31, this.f9908b)) * 31) + this.f9909c;
    }

    public final String toString() {
        return ("{\"eventId\":" + this.f9907a + ",\"timestamp\":" + this.f9908b + "," + this.f9910d.toString().substring(1) + "}").replace(",", "\n");
    }
}
