package com.anzu.sdk.browserhelper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.anzu.sdk.browserhelper.CustomTabActivityHelper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class WebviewFallback implements CustomTabActivityHelper.CustomTabFallback {
    @Override // com.anzu.sdk.browserhelper.CustomTabActivityHelper.CustomTabFallback
    public void openUri(Activity activity, Uri uri) {
        Intent intent = new Intent(activity, (Class<?>) WebviewActivity.class);
        intent.putExtra(WebviewActivity.EXTRA_URL, uri.toString());
        activity.startActivityForResult(intent, 1234);
    }
}
