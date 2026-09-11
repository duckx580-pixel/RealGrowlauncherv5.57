package com.usercentrics.sdk.ui.components.sdk;

import android.widget.LinearLayout;
import com.usercentrics.sdk.ui.R;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSDKView$ucCookieRetryBox$2 extends m implements a {
    final UCSDKView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCSDKView$ucCookieRetryBox$2(UCSDKView uCSDKView) {
        super(0);
        this.this$0 = uCSDKView;
    }

    @Override // eh.a
    public final LinearLayout invoke() {
        return (LinearLayout) this.this$0.findViewById(R.id.ucCookieRetryBox);
    }
}
