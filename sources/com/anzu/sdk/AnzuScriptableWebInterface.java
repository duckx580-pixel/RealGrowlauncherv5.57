package com.anzu.sdk;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
class AnzuScriptableWebInterface {
    private OnCommandListener mOnCommandListener = null;

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public interface OnCommandListener {
        void onCommand(String str);
    }

    @JavascriptInterface
    public void runCommand(String str) {
        OnCommandListener onCommandListener = this.mOnCommandListener;
        if (onCommandListener != null) {
            onCommandListener.onCommand(str);
        }
    }

    public void setOnCommandListener(OnCommandListener onCommandListener) {
        this.mOnCommandListener = onCommandListener;
    }
}
