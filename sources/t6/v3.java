package t6;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y3 f17087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17088e;

    public v3(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.f17084a = string;
            this.f17085b = jSONObject.optBoolean("test_mode");
            this.f17086c = str;
            this.f17088e = string.startsWith("default") ? 1 : 2;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.f17087d = jSONObjectOptJSONObject != null ? new y3(jSONObjectOptJSONObject) : null;
        } catch (JSONException e8) {
            s6.h.u("Error in RC config parsing", e8);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v3.class != obj.getClass()) {
            return false;
        }
        v3 v3Var = (v3) obj;
        if (this.f17085b == v3Var.f17085b && this.f17084a.equals(v3Var.f17084a)) {
            return this.f17086c.equals(v3Var.f17086c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f17086c.hashCode() + ((((this.f17085b ? 1 : 0) * 31) + this.f17084a.hashCode()) * 31);
        y3 y3Var = this.f17087d;
        if (y3Var == null) {
            return iHashCode;
        }
        return y3Var.hashCode() + (iHashCode * 31);
    }
}
