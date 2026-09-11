package io.mychips.nativesdk.domain;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MCProgress {
    public final int eventsCompleted;
    public final double progressValue;
    public final String status;
    public final int totalEvents;
    public final double valueEarned;

    public MCProgress(String str, int i10, int i11, double d10, double d11) {
        this.status = str;
        this.eventsCompleted = i10;
        this.totalEvents = i11;
        this.valueEarned = d10;
        this.progressValue = d11;
    }

    public static MCProgress fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new MCProgress(jSONObject.optString("status", PredefinedUICustomizationFont.defaultFamily), jSONObject.optInt("eventsCompleted", 0), jSONObject.optInt("totalEvents", 0), jSONObject.optDouble("valueEarned", 0.0d), jSONObject.optDouble("progressValue", 0.0d));
    }
}
