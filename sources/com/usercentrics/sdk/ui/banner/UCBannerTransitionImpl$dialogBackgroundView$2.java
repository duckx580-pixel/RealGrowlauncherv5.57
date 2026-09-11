package com.usercentrics.sdk.ui.banner;

import android.widget.FrameLayout;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCBannerTransitionImpl$dialogBackgroundView$2 extends m implements a {
    final UCBannerTransitionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCBannerTransitionImpl$dialogBackgroundView$2(UCBannerTransitionImpl uCBannerTransitionImpl) {
        super(0);
        this.this$0 = uCBannerTransitionImpl;
    }

    @Override // eh.a
    public final FrameLayout invoke() {
        FrameLayout frameLayout = new FrameLayout(this.this$0.context);
        UCBannerTransitionImpl uCBannerTransitionImpl = this.this$0;
        frameLayout.setVisibility(4);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(uCBannerTransitionImpl.bannerContainerView);
        Integer backgroundOverlayColor = uCBannerTransitionImpl.getBackgroundOverlayColor();
        if (backgroundOverlayColor != null) {
            frameLayout.setBackgroundColor(backgroundOverlayColor.intValue());
        }
        return frameLayout;
    }
}
