package com.rtsoft.growtopia;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
class CSTSWebView extends WebView {
    private CSTSWebViewClient _webClient;

    public CSTSWebView(Context context) {
        super(context);
        this._webClient = null;
        setupWebView();
    }

    private void setupWebView() {
        if (this._webClient == null) {
            CSTSWebViewClient cSTSWebViewClient = new CSTSWebViewClient();
            this._webClient = cSTSWebViewClient;
            setWebViewClient(cSTSWebViewClient);
            getSettings().setJavaScriptEnabled(true);
            getSettings().setDomStorageEnabled(true);
            clearCache(true);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        }
    }

    public CSTSWebViewClient getWebClient() {
        return this._webClient;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean shouldGoBackToFirstURL() {
        if (getUrl().contains("facebook")) {
            return true;
        }
        return this._webClient.isInCreateAccount();
    }

    public CSTSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._webClient = null;
        setupWebView();
    }

    public CSTSWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this._webClient = null;
        setupWebView();
    }
}
