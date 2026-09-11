package fi;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import launcher.powerkuy.growlauncher.ScriptHubWebActivity;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6337b;

    public /* synthetic */ e2(int i10, Object obj) {
        this.f6336a = i10;
        this.f6337b = obj;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        switch (this.f6336a) {
            case 1:
                yc.d dVar = (yc.d) this.f6337b;
                if (!dVar.f20270n.f20291b || dVar.f20269m == null) {
                    return true;
                }
                for (int i10 = 0; i10 < 5; i10++) {
                    if (consoleMessage.message().contains(new String[]{"Uncaught", "uncaught", "Error", "error", "not defined"}[i10])) {
                        dVar.f20269m.b(false);
                        return true;
                    }
                }
                return true;
            default:
                return super.onConsoleMessage(consoleMessage);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f6336a) {
            case 1:
                yc.c0.a(3, "TJAdUnit", str2);
                return false;
            default:
                return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.f6336a) {
            case 0:
                kotlin.jvm.internal.l.f("view", webView);
                kotlin.jvm.internal.l.f("callback", valueCallback);
                kotlin.jvm.internal.l.f("params", fileChooserParams);
                ScriptHubWebActivity scriptHubWebActivity = (ScriptHubWebActivity) this.f6337b;
                ValueCallback valueCallback2 = scriptHubWebActivity.f9864t;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                scriptHubWebActivity.f9864t = valueCallback;
                try {
                    scriptHubWebActivity.f9865u.a(fileChooserParams.createIntent());
                    return true;
                } catch (Exception unused) {
                    scriptHubWebActivity.f9864t = null;
                    return false;
                }
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }
}
