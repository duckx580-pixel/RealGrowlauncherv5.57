package o6;

import android.text.TextUtils;
import hd.d0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f12725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f12730g;

    public h(String str) throws JSONException {
        this.f12724a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12725b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f12726c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f12727d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f12728e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        this.f12729f = jSONObject.optString("skuDetailsToken");
        if (strOptString2.equals("inapp")) {
            this.f12730g = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                mc.a aVar = new mc.a();
                jSONObject2.getString("offerIdToken");
                JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
                ArrayList arrayList2 = new ArrayList();
                if (jSONArray != null) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                        if (jSONObjectOptJSONObject != null) {
                            d0 d0Var = new d0();
                            jSONObjectOptJSONObject.optString("billingPeriod");
                            jSONObjectOptJSONObject.optString("priceCurrencyCode");
                            jSONObjectOptJSONObject.optString("formattedPrice");
                            jSONObjectOptJSONObject.optLong("priceAmountMicros");
                            jSONObjectOptJSONObject.optInt("recurrenceMode");
                            jSONObjectOptJSONObject.optInt("billingCycleCount");
                            arrayList2.add(d0Var);
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
                    jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                }
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("offerTags");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                        arrayList3.add(jSONArrayOptJSONArray2.getString(i12));
                    }
                }
                arrayList.add(aVar);
            }
        }
        this.f12730g = arrayList;
    }

    public final g a() {
        JSONObject jSONObjectOptJSONObject = this.f12725b.optJSONObject("oneTimePurchaseOfferDetails");
        if (jSONObjectOptJSONObject != null) {
            return new g(jSONObjectOptJSONObject);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return TextUtils.equals(this.f12724a, ((h) obj).f12724a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12724a.hashCode();
    }

    public final String toString() {
        String string = this.f12725b.toString();
        String strValueOf = String.valueOf(this.f12730g);
        StringBuilder sbO = k0.g.o("ProductDetails{jsonString='", this.f12724a, "', parsedJson=", string, ", productId='");
        k0.g.y(sbO, this.f12726c, "', productType='", this.f12727d, "', title='");
        k0.g.y(sbO, this.f12728e, "', productDetailsToken='", this.f12729f, "', subscriptionOfferDetails=");
        return k0.g.l(sbO, strValueOf, "}");
    }
}
