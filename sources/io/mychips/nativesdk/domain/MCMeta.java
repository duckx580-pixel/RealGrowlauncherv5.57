package io.mychips.nativesdk.domain;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MCMeta {
    public final int count;
    public final String version;

    public MCMeta(String str, int i10) {
        this.version = str;
        this.count = i10;
    }

    public static MCMeta fromJson(JSONObject jSONObject) {
        return jSONObject == null ? new MCMeta("1.0", 0) : new MCMeta(jSONObject.optString("version", "1.0"), jSONObject.optInt("count", 0));
    }
}
