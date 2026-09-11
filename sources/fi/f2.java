package fi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;
import com.rtsoft.growtopia.SharedActivity;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJPlacement;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import launcher.powerkuy.growlauncher.ScriptHubWebActivity;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6355b;

    public /* synthetic */ f2(int i10, Object obj) {
        this.f6354a = i10;
        this.f6355b = obj;
    }

    public boolean a(String str) {
        NetworkInfo activeNetworkInfo;
        StringBuilder sb2;
        String string;
        String host;
        yc.d dVar = (yc.d) this.f6355b;
        try {
            if (dVar.f20272p.getContext() != null && (activeNetworkInfo = ((ConnectivityManager) dVar.f20272p.getContext().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected() && URLUtil.isValidUrl(str)) {
                    try {
                        host = new URL(yc.i0.i("TJC_OPTION_SERVICE_URL")).getHost();
                    } catch (MalformedURLException unused) {
                    }
                    if ((host != null && str.contains(host)) || str.contains(yc.i0.f20343q)) {
                        return false;
                    }
                    String strI = yc.i0.i("TJC_OPTION_PLACEMENT_SERVICE_URL");
                    int i10 = yc.q0.f20409a;
                    if (str.contains(strI != null ? strI.substring(strI.indexOf("//") + 2, strI.lastIndexOf("/")) : PredefinedUICustomizationFont.defaultFamily)) {
                        return false;
                    }
                    if (dVar.f20270n.f20290a) {
                        Uri uri = Uri.parse(str);
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(uri);
                        intent.addFlags(268435456);
                        if (dVar.f20272p.getContext() == null) {
                            return false;
                        }
                        try {
                            dVar.f20272p.getContext().startActivity(intent);
                            return true;
                        } catch (Exception e8) {
                            sb2 = new StringBuilder("Exception in loading URL. ");
                            string = e8.getMessage();
                        }
                    } else {
                        if (!str.startsWith("javascript:")) {
                            return false;
                        }
                        try {
                            dVar.f20272p.evaluateJavascript(str.replaceFirst("javascript:", PredefinedUICustomizationFont.defaultFamily), null);
                            return true;
                        } catch (Exception e10) {
                            sb2 = new StringBuilder("Exception in evaluateJavascript. Device not supported. ");
                            string = e10.toString();
                        }
                    }
                    sb2.append(string);
                    yc.c0.d("TJAdUnit", sb2.toString());
                    return false;
                }
            }
        } catch (Exception e11) {
            yc.c0.a(3, "TJAdUnit", "Exception getting NetworkInfo: " + e11.getLocalizedMessage());
        }
        TJAdUnitActivity tJAdUnitActivity = dVar.f20269m;
        if (tJAdUnitActivity == null) {
            return true;
        }
        tJAdUnitActivity.c();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f6354a) {
            case 1:
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        yc.b0 b0Var;
        yc.f fVar;
        switch (this.f6354a) {
            case 0:
                kotlin.jvm.internal.l.f("view", webView);
                kotlin.jvm.internal.l.f("url", str);
                webView.evaluateJavascript("document.documentElement.classList.add('sw-render')", null);
                break;
            default:
                yc.c0.a(3, "TJAdUnit", "onPageFinished: ".concat(String.valueOf(str)));
                yc.d dVar = (yc.d) this.f6355b;
                TJAdUnitActivity tJAdUnitActivity = dVar.f20269m;
                if (tJAdUnitActivity != null) {
                    tJAdUnitActivity.w.setVisibility(4);
                }
                dVar.f20281z = true;
                if (dVar.f20278v && (fVar = dVar.f20270n) != null) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(new Object[0]));
                    yc.b0 b0Var2 = (yc.b0) fVar.f20294e;
                    if (b0Var2 != null) {
                        try {
                            b0Var2.a(new JSONArray((Collection) arrayList), "display", null);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                }
                yc.f fVar2 = dVar.f20270n;
                if (fVar2 != null && (b0Var = (yc.b0) fVar2.f20294e) != null && !b0Var.f20251d) {
                    while (true) {
                        String str2 = (String) b0Var.f20250c.poll();
                        if (str2 == null) {
                            b0Var.f20251d = true;
                            break;
                        } else if (b0Var.f20248a != null) {
                            new yc.a0(b0Var.f20248a).execute(str2);
                        }
                    }
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f6354a) {
            case 1:
                yc.c0.a(3, "TJAdUnit", "onPageStarted: ".concat(String.valueOf(str)));
                yc.f fVar = ((yc.d) this.f6355b).f20270n;
                if (fVar != null) {
                    fVar.f20290a = true;
                    fVar.f20291b = false;
                    yc.c0.a(3, "TJAdUnit", "detachVolumeListener");
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        switch (this.f6354a) {
            case 1:
                yc.c0.a(3, "TJAdUnit", "error:".concat(String.valueOf(str)));
                yc.d dVar = (yc.d) this.f6355b;
                TJAdUnitActivity tJAdUnitActivity = dVar.f20269m;
                if (tJAdUnitActivity != null) {
                    tJAdUnitActivity.c();
                }
                dVar.getClass();
                super.onReceivedError(webView, i10, str, str2);
                break;
            default:
                super.onReceivedError(webView, i10, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f6354a) {
            case 0:
                kotlin.jvm.internal.l.f("view", webView);
                kotlin.jvm.internal.l.f("request", webResourceRequest);
                kotlin.jvm.internal.l.f("errorResponse", webResourceResponse);
                if (webResourceRequest.isForMainFrame() && webResourceResponse.getStatusCode() >= 500) {
                    ScriptHubWebActivity scriptHubWebActivity = (ScriptHubWebActivity) this.f6355b;
                    int i10 = ScriptHubWebActivity.f9860v;
                    scriptHubWebActivity.d(true);
                    break;
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        TJPlacement tJPlacementA;
        SharedActivity sharedActivity;
        switch (this.f6354a) {
            case 0:
                kotlin.jvm.internal.l.f("view", webView);
                kotlin.jvm.internal.l.f("detail", renderProcessGoneDetail);
                ((ScriptHubWebActivity) this.f6355b).recreate();
                break;
            default:
                yc.c0.c("TJAdUnit", new ec.c(2, 4, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
                yc.d dVar = (yc.d) this.f6355b;
                VideoView videoView = dVar.f20266i;
                if (videoView != null && (dVar.f20276t || videoView.getDuration() > 0)) {
                    dVar.f20276t = false;
                    dVar.f20275s = true;
                    yc.c0.d("TJAdUnit", "Firing onVideoError with error: ".concat("WebView loading while trying to play video."));
                    yc.m mVar = dVar.f20268l;
                    if (mVar != null && (tJPlacementA = ((yc.p) mVar.f20368i).a("SHOW")) != null && (sharedActivity = tJPlacementA.f4730d) != null) {
                        sharedActivity.onVideoError(tJPlacementA, "WebView loading while trying to play video.");
                    }
                }
                yc.z zVar = dVar.f20271o;
                if (zVar != null) {
                    ViewGroup viewGroup = (ViewGroup) zVar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(dVar.f20271o);
                    }
                    dVar.f20271o.removeAllViews();
                    dVar.f20271o.destroy();
                    dVar.f20271o = null;
                }
                yc.z zVar2 = dVar.f20272p;
                if (zVar2 != null) {
                    ViewGroup viewGroup2 = (ViewGroup) zVar2.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.f20272p);
                    }
                    dVar.f20272p.removeAllViews();
                    dVar.f20272p.destroy();
                    dVar.f20272p = null;
                }
                yc.f fVar = dVar.f20270n;
                if (fVar != null) {
                    yc.b0 b0Var = (yc.b0) fVar.f20294e;
                    if (b0Var != null) {
                        WebView webView2 = b0Var.f20248a;
                        if (webView2 != null) {
                            webView2.removeAllViews();
                            ((yc.b0) fVar.f20294e).f20248a.destroy();
                            ((yc.b0) fVar.f20294e).f20248a = null;
                        }
                        fVar.f20294e = null;
                    }
                    dVar.f20270n = null;
                }
                TJAdUnitActivity tJAdUnitActivity = dVar.f20269m;
                if (tJAdUnitActivity != null) {
                    tJAdUnitActivity.finish();
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.f6354a) {
            case 1:
                t6.b bVar = t6.b.f16712u;
                if (bVar != null) {
                    bVar.getClass();
                    String strC = t6.b.c(str);
                    WebResourceResponse webResourceResponse = null;
                    yc.g0 g0Var = strC != PredefinedUICustomizationFont.defaultFamily ? (yc.g0) ((yc.f0) bVar.f16713i).get(strC) : null;
                    if (g0Var != null) {
                        try {
                            webResourceResponse = new WebResourceResponse(g0Var.w, "UTF-8", new FileInputStream(g0Var.f20303t));
                        } catch (Exception unused) {
                        }
                        if (webResourceResponse != null) {
                            StringBuilder sbP = android.support.v4.media.session.a.p("Reading request for ", str, " from cache -- localPath: ");
                            sbP.append(g0Var.f20303t);
                            yc.c0.a(3, "TJAdUnit", sbP.toString());
                        }
                    }
                }
                break;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f6354a) {
            case 0:
                kotlin.jvm.internal.l.f("view", webView);
                kotlin.jvm.internal.l.f("request", webResourceRequest);
                String host = webResourceRequest.getUrl().getHost();
                int i10 = ScriptHubWebActivity.f9860v;
                if (kotlin.jvm.internal.l.a(host, Uri.parse(s.o()).getHost())) {
                    return false;
                }
                ((ScriptHubWebActivity) this.f6355b).startActivity(new Intent("android.intent.action.VIEW", webResourceRequest.getUrl()));
                return true;
            default:
                return a(webResourceRequest.getUrl().toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f6354a) {
            case 0:
                kotlin.jvm.internal.l.f("view", webView);
                kotlin.jvm.internal.l.f("request", webResourceRequest);
                kotlin.jvm.internal.l.f("error", webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    ScriptHubWebActivity scriptHubWebActivity = (ScriptHubWebActivity) this.f6355b;
                    int i10 = ScriptHubWebActivity.f9860v;
                    scriptHubWebActivity.d(true);
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f6354a) {
            case 1:
                return a(str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    private final void b(WebView webView, String str) {
    }
}
