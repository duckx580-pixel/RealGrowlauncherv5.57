package com.usercentrics.sdk.ui.components.cookie;

import android.view.View;
import com.usercentrics.sdk.ui.R;
import com.usercentrics.sdk.ui.components.UCTextView;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CookieInformationAdapter$CookieViewHolder$ucCookieCardTitle$2 extends m implements a {
    final View $itemView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CookieInformationAdapter$CookieViewHolder$ucCookieCardTitle$2(View view) {
        super(0);
        this.$itemView = view;
    }

    @Override // eh.a
    public final UCTextView invoke() {
        return (UCTextView) this.$itemView.findViewById(R.id.ucCookieCardTitle);
    }
}
