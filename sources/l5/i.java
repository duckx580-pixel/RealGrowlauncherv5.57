package l5;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(SafeBrowsingResponse safeBrowsingResponse, boolean z3) {
        safeBrowsingResponse.backToSafety(z3);
    }

    public static Uri b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void c(SafeBrowsingResponse safeBrowsingResponse, boolean z3) {
        safeBrowsingResponse.proceed(z3);
    }

    public static void d(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void e(SafeBrowsingResponse safeBrowsingResponse, boolean z3) {
        safeBrowsingResponse.showInterstitial(z3);
    }

    public static void f(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
