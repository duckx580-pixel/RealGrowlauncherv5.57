package io.mychips.nativesdk.domain;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MCLinks {
    public final String detailUrl;
    public final String trackingPixelUrl;
    public final String trackingUrl;

    public MCLinks(String str, String str2, String str3) {
        this.trackingUrl = str;
        this.trackingPixelUrl = str2;
        this.detailUrl = str3;
    }

    public static MCLinks fromJson(JSONObject jSONObject) {
        return jSONObject == null ? new MCLinks(null, null, null) : new MCLinks(jSONObject.optString("trackingUrl", null), jSONObject.optString("trackingPixelUrl", null), jSONObject.optString("detailUrl", null));
    }
}
