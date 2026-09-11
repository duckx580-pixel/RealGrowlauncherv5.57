package com.anzu.sdk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class PersistentAnzuWebView {
    private AnzuWebView mAnzuWebView;

    public PersistentAnzuWebView(AnzuWebView anzuWebView) {
        this.mAnzuWebView = anzuWebView;
        anzuWebView.setWrapper(this);
    }

    public void UpdateAnzuWebViewOnRenderProcessGone(AnzuWebView anzuWebView) {
        this.mAnzuWebView = anzuWebView;
    }

    public void clean() {
        if (this.mAnzuWebView != null) {
            Anzu.Log("Removing interstitial from view hierarchy ");
            this.mAnzuWebView.removeFromViewHierarchy();
            this.mAnzuWebView = null;
        }
    }

    public AnzuWebView get() {
        return this.mAnzuWebView;
    }
}
