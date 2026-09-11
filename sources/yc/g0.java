package yc;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20300i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f20302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f20303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f20304u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20305v;
    public final String w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f20306x;

    public g0(long j, long j10, String str, String str2) {
        this.f20302s = str;
        int i10 = q0.f20409a;
        str = str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
        String strSubstring = str.lastIndexOf(46) != -1 ? str.substring(str.lastIndexOf(46) + 1) : PredefinedUICustomizationFont.defaultFamily;
        this.w = strSubstring.equals("css") ? "text/css" : strSubstring.equals("js") ? "text/javascript" : strSubstring.equals("html") ? "text/html" : "application/octet-stream";
        this.f20303t = str2;
        this.f20304u = "file://".concat(String.valueOf(str2));
        this.f20301r = j;
        this.f20300i = j10;
        this.f20305v = j10 + j;
    }

    public static g0 a(JSONObject jSONObject) {
        g0 g0Var;
        try {
            String string = jSONObject.getString("assetURL");
            String string2 = jSONObject.getString("localFilePath");
            g0Var = new g0(jSONObject.getLong("timeToLive"), jSONObject.getLong("timestamp"), string, string2);
        } catch (JSONException unused) {
            g0Var = null;
        }
        try {
            g0Var.f20306x = jSONObject.optString("offerID");
            return g0Var;
        } catch (JSONException unused2) {
            c0.a(4, "TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- not enough data.");
            return g0Var;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\nURL=");
        sb2.append(this.f20304u);
        sb2.append("\nAssetURL=");
        sb2.append(this.f20302s);
        sb2.append("\nMimeType=");
        sb2.append(this.w);
        sb2.append("\nTimestamp=");
        sb2.append(this.f20300i);
        sb2.append("\nTimeOfDeath=");
        sb2.append(this.f20305v);
        sb2.append("\nTimeToLive=");
        return android.support.v4.media.session.a.k(this.f20301r, "\n", sb2);
    }
}
