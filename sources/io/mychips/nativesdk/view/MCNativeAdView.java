package io.mychips.nativesdk.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u0;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import fg.c;
import io.mychips.nativesdk.domain.MCCampaign;
import java.util.ArrayList;
import u5.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MCNativeAdView extends FrameLayout {
    public static final int A = Color.parseColor("#FFEBEBEB");
    public static final int B = Color.parseColor("#FFF5F5F5");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f8411i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayoutManager f8412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f8413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ObjectAnimator f8414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MCNativeAdRenderer f8415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8416v;
    public int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public OnCampaignClickListener f8417x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LoadingListener f8418y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f8419z;

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public interface LoadingListener {
        void onCampaignsLoaded(int i10);

        void onError(Exception exc);

        void onLoadingStarted();
    }

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public interface OnCampaignClickListener {
        void onCampaignClick(MCCampaign mCCampaign, int i10);
    }

    public MCNativeAdView(Context context) {
        super(context);
        this.f8416v = 0;
        this.w = 0;
        c();
    }

    public final void a(View view) {
        try {
            if (view.getVisibility() == 8) {
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    a(viewGroup.getChildAt(i10));
                }
                return;
            }
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                imageView.setImageDrawable(null);
                Drawable background = imageView.getBackground();
                boolean z3 = background instanceof GradientDrawable;
                int i11 = A;
                if (z3) {
                    ((GradientDrawable) background).setColor(i11);
                    return;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(getContext().getResources().getDisplayMetrics().density * 8.0f);
                gradientDrawable.setColor(i11);
                imageView.setBackground(gradientDrawable);
                return;
            }
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                float f9 = getContext().getResources().getDisplayMetrics().density;
                int textSize = (int) (textView.getTextSize() * 0.8f);
                textView.setText(PredefinedUICustomizationFont.defaultFamily);
                textView.setTextColor(0);
                textView.setCompoundDrawables(null, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(4.0f * f9);
                gradientDrawable2.setColor(B);
                textView.setBackground(gradientDrawable2);
                if (textView.getMinHeight() == 0 && textView.getLayoutParams().height == -2) {
                    textView.setMinHeight(textSize);
                }
                if (textView.getLayoutParams().width == -2) {
                    textView.setMinWidth((int) (f9 * 60.0f));
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void b() {
        try {
            View view = this.f8419z;
            if (view != null && view.getParent() == this) {
                removeView(this.f8419z);
            }
            ObjectAnimator objectAnimator = this.f8414t;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f8414t = null;
            }
            LinearLayout linearLayout = this.f8413s;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f8413s = null;
            }
            RecyclerView recyclerView = this.f8411i;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    public final void c() {
        try {
            setClipChildren(false);
            setClipToPadding(false);
            RecyclerView recyclerView = new RecyclerView(getContext(), null);
            this.f8411i = recyclerView;
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f8411i.setClipToPadding(false);
            this.f8411i.setClipChildren(false);
            this.f8411i.setItemViewCacheSize(20);
            this.f8411i.setNestedScrollingEnabled(true);
            addView(this.f8411i);
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f8416v);
            this.f8412r = linearLayoutManager;
            this.f8411i.setLayoutManager(linearLayoutManager);
            u0 u0VarA = this.f8411i.getRecycledViewPool().a(0);
            u0VarA.f2245b = 0;
            ArrayList arrayList = u0VarA.f2244a;
            while (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
        } catch (Exception unused) {
        }
    }

    public final void d() {
        try {
            b();
            this.f8411i.setVisibility(4);
            View view = this.f8419z;
            if (view != null) {
                if (view.getParent() != null) {
                    ((ViewGroup) this.f8419z.getParent()).removeView(this.f8419z);
                }
                this.f8419z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                addView(this.f8419z);
                this.f8419z.setVisibility(0);
                return;
            }
            int i10 = this.f8416v == 0 ? 1 : 0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f8413s = linearLayout;
            linearLayout.setOrientation(i10 ^ 1);
            this.f8413s.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            int i11 = i10 != 0 ? 5 : 4;
            MCNativeAdRenderer mCNativeAdRenderer = this.f8415u;
            int itemLayoutId = mCNativeAdRenderer != null ? mCNativeAdRenderer.getItemLayoutId() : 0;
            for (int i12 = 0; i12 < i11; i12++) {
                View view2 = null;
                if (itemLayoutId != 0) {
                    try {
                        View viewInflate = LayoutInflater.from(getContext()).inflate(itemLayoutId, (ViewGroup) this.f8413s, false);
                        a(viewInflate);
                        view2 = viewInflate;
                    } catch (Exception unused) {
                    }
                }
                if (view2 != null) {
                    this.f8413s.addView(view2);
                }
            }
            addView(this.f8413s);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f8413s, "alpha", 1.0f, 0.3f);
            this.f8414t = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(800L);
            this.f8414t.setRepeatCount(-1);
            this.f8414t.setRepeatMode(2);
            this.f8414t.start();
        } catch (Exception unused2) {
        }
    }

    public void load() {
        try {
            try {
                if (this.f8415u == null) {
                    this.f8415u = new MCDefaultAdRenderer();
                }
                d();
                LoadingListener loadingListener = this.f8418y;
                if (loadingListener != null) {
                    try {
                        loadingListener.onLoadingStarted();
                    } catch (Exception unused) {
                    }
                }
                a aVar = new a(this);
                c cVar = f.f17659d;
                if (cVar != null) {
                    cVar.a(aVar);
                }
            } catch (Exception e8) {
                b();
                LoadingListener loadingListener2 = this.f8418y;
                if (loadingListener2 != null) {
                    loadingListener2.onError(e8);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public void setLoadingListener(LoadingListener loadingListener) {
        this.f8418y = loadingListener;
    }

    public void setLoadingView(View view) {
        this.f8419z = view;
    }

    public void setMaxCampaigns(int i10) {
        this.w = Math.max(0, i10);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        try {
            RecyclerView recyclerView = this.f8411i;
            if (recyclerView != null) {
                recyclerView.setNestedScrollingEnabled(z3);
            }
        } catch (Exception unused) {
        }
    }

    public void setOnCampaignClickListener(OnCampaignClickListener onCampaignClickListener) {
        this.f8417x = onCampaignClickListener;
    }

    public void setOrientation(int i10) {
        try {
            this.f8416v = i10;
            LinearLayoutManager linearLayoutManager = this.f8412r;
            if (linearLayoutManager != null) {
                linearLayoutManager.V0(i10);
            }
        } catch (Exception unused) {
        }
    }

    public void setRenderer(MCNativeAdRenderer mCNativeAdRenderer) {
        this.f8415u = mCNativeAdRenderer;
    }

    public MCNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8416v = 0;
        this.w = 0;
        c();
    }

    public MCNativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8416v = 0;
        this.w = 0;
        c();
    }
}
