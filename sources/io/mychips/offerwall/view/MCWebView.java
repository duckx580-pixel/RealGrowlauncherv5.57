package io.mychips.offerwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import lg.a;
import mf.e;
import mg.b;
import mg.c;
import mg.d;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MCWebView extends WebView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f8429s = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f8430i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f8431r;

    public MCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e eVar = new e(22, false);
        eVar.f11709r = this;
        eVar.f11710s = context;
        HashMap map = new HashMap();
        eVar.f11711t = map;
        map.put("GetNetworkInfo", new a(3));
        map.put("GetDeviceInfo", new a(1));
        map.put("GetAppInfo", new a(0));
        map.put("GetUserInfo", new a(4));
        map.put("GetSDKConfig", new a(2));
        this.f8431r = eVar;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setCacheMode(2);
        getSettings().setDomStorageEnabled(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setTextZoom(100);
        setWebChromeClient(new b(0));
        setWebViewClient(new c(this, context));
    }

    public void setOnPageEventListener(d dVar) {
        this.f8430i = dVar;
    }
}
