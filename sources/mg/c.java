package mg;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cf.f;
import io.mychips.offerwall.controller.MCOfferwallActivity;
import io.mychips.offerwall.view.MCWebView;
import java.util.HashMap;
import l5.o;
import mf.e;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MCWebView f11716b;

    public c(MCWebView mCWebView, Context context) {
        this.f11716b = mCWebView;
        this.f11715a = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        d dVar = this.f11716b.f8430i;
        if (dVar != null) {
            MCOfferwallActivity mCOfferwallActivity = (MCOfferwallActivity) ((o) dVar).f9810i;
            mCOfferwallActivity.f8426s.setVisibility(8);
            mCOfferwallActivity.f8427t = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        d dVar = this.f11716b.f8430i;
        if (dVar != null) {
            MCOfferwallActivity mCOfferwallActivity = (MCOfferwallActivity) ((o) dVar).f9810i;
            if (mCOfferwallActivity.f8427t) {
                mCOfferwallActivity.f8426s.setVisibility(0);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        try {
            if (webResourceRequest.isForMainFrame()) {
                webView.loadDataWithBaseURL(null, "<html><head><style>body { font-size:30pt; font-family: Arial, sans-serif; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh; background-color: #f7f7f7; }div { text-align: center; }h1 { color: #333; }p { color: #666; }</style></head><body><div><h1>Connection Error</h1><p>Sorry, we're unable to load the offers.<br>Please check your connection and try again.</p></div></body></html>", "text/html", "UTF-8", null);
            }
            Log.e("MCWebViewClient", webResourceError.getDescription().toString());
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        JSONObject jSONObject;
        if (!webResourceRequest.getUrl().toString().startsWith("mychips://")) {
            boolean zStartsWith = webResourceRequest.getUrl().toString().startsWith("https://api.mychips.io");
            Context context = this.f11715a;
            if (zStartsWith && webResourceRequest.getUrl().toString().contains("redirect")) {
                context.getSharedPreferences("RateLimitServicePrefs", 0).edit().putLong("getBalance_eventTime", System.currentTimeMillis()).apply();
                String string = webResourceRequest.getUrl().toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse(string));
                context.startActivity(intent);
                return true;
            }
            if (!webResourceRequest.getUrl().toString().startsWith("veriff://")) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            Uri uri = Uri.parse(webResourceRequest.getUrl().toString().replaceFirst("veriff://", "https://"));
            Uri.Builder builderBuildUpon = uri.buildUpon();
            if (uri.getQueryParameter("page") == null) {
                builderBuildUpon.appendQueryParameter("page", "redeem");
            }
            String string2 = builderBuildUpon.build().toString();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(Uri.parse(string2));
            context.startActivity(intent2);
            return true;
        }
        String string3 = webResourceRequest.getUrl().toString();
        int i10 = MCWebView.f8429s;
        Uri uri2 = Uri.parse(string3);
        String host = uri2.getHost();
        String queryParameter = uri2.getQueryParameter("params");
        e eVar = this.f11716b.f8431r;
        lg.a aVar = (lg.a) ((HashMap) eVar.f11711t).get(host);
        if (aVar == null) {
            Log.e("CommandDispatcher", "Unknown method: " + host);
            return true;
        }
        if (queryParameter != null) {
            try {
                jSONObject = queryParameter.trim().isEmpty() ? new JSONObject() : new JSONObject(queryParameter);
            } catch (Exception e8) {
                Log.e("CommandDispatcher", "err: " + e8.toString());
                return true;
            }
        }
        ((MCWebView) eVar.f11709r).post(new f(6, eVar, "window.mychipsNativeCallback('" + host + "', " + aVar.a((Context) eVar.f11710s, jSONObject) + ");"));
        return true;
    }
}
