package io.mychips.nativesdk.domain;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MCCreatives {
    public final String cover;
    public final String thumbnail;

    public MCCreatives(String str, String str2) {
        this.thumbnail = str;
        this.cover = str2;
    }

    public static MCCreatives fromJson(JSONObject jSONObject) {
        return jSONObject == null ? new MCCreatives(null, null) : new MCCreatives(jSONObject.optString("thumbnail", null), jSONObject.optString("cover", null));
    }
}
