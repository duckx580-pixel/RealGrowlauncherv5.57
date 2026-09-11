package o6;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12723c;

    public g(JSONObject jSONObject) {
        this.f12721a = jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        this.f12722b = jSONObject.optString("priceCurrencyCode");
        this.f12723c = jSONObject.optString("offerIdToken");
        jSONObject.optString("offerId");
        jSONObject.optInt("offerType");
    }
}
