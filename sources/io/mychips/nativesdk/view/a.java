package io.mychips.nativesdk.view;

import io.mychips.nativesdk.domain.MCCampaignsCallback;
import io.mychips.nativesdk.domain.MCMeta;
import io.mychips.nativesdk.view.MCNativeAdView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements MCCampaignsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MCNativeAdView f8420a;

    public a(MCNativeAdView mCNativeAdView) {
        this.f8420a = mCNativeAdView;
    }

    @Override // io.mychips.nativesdk.domain.MCCampaignsCallback
    public final void onCampaignsLoaded(List list, MCMeta mCMeta) {
        MCNativeAdView mCNativeAdView = this.f8420a;
        try {
            if (mCNativeAdView.isAttachedToWindow()) {
                int i10 = MCNativeAdView.A;
                mCNativeAdView.b();
                if (mCNativeAdView.w > 0) {
                    int size = list.size();
                    int i11 = mCNativeAdView.w;
                    if (size > i11) {
                        list = list.subList(0, i11);
                    }
                }
                mCNativeAdView.f8411i.setAdapter(new b(mCNativeAdView, list));
                MCNativeAdView.LoadingListener loadingListener = mCNativeAdView.f8418y;
                if (loadingListener != null) {
                    loadingListener.onCampaignsLoaded(list.size());
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // io.mychips.nativesdk.domain.MCCampaignsCallback
    public final void onError(Exception exc) {
        MCNativeAdView mCNativeAdView = this.f8420a;
        try {
            if (mCNativeAdView.isAttachedToWindow()) {
                int i10 = MCNativeAdView.A;
                mCNativeAdView.b();
                MCNativeAdView.LoadingListener loadingListener = mCNativeAdView.f8418y;
                if (loadingListener != null) {
                    loadingListener.onError(exc);
                }
            }
        } catch (Exception unused) {
        }
    }
}
