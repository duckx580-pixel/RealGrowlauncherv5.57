package mg;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import io.mychips.offerwall.controller.MCOfferwallActivity;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueCallback f11712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MCOfferwallActivity f11713b;

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        MCOfferwallActivity mCOfferwallActivity = this.f11713b;
        ValueCallback valueCallback2 = this.f11712a;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.f11712a = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        try {
            mCOfferwallActivity.startActivityForResult(Intent.createChooser(intent, "Select Files (Images or Videos)"), 1001);
            return true;
        } catch (ActivityNotFoundException unused) {
            this.f11712a = null;
            Toast.makeText(mCOfferwallActivity, "Cannot open file chooser", 1).show();
            return false;
        }
    }
}
