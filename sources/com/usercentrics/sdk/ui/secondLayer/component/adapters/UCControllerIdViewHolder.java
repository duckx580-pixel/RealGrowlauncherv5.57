package com.usercentrics.sdk.ui.secondLayer.component.adapters;

import android.view.View;
import androidx.recyclerview.widget.f1;
import com.usercentrics.sdk.ui.R;
import com.usercentrics.sdk.ui.components.UCControllerId;
import com.usercentrics.sdk.ui.components.cards.UCControllerIdPM;
import com.usercentrics.sdk.ui.extensions.ViewExtensionsKt;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCControllerIdViewHolder extends f1 {
    private final UCControllerId controllerId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCControllerIdViewHolder(UCThemeData uCThemeData, View view) {
        super(view);
        l.f("theme", uCThemeData);
        l.f("itemView", view);
        UCControllerId uCControllerId = (UCControllerId) view;
        this.controllerId = uCControllerId;
        uCControllerId.style(uCThemeData);
        ViewExtensionsKt.setRVMargins(uCControllerId, (int) view.getResources().getDimension(R.dimen.ucControllerIdHorizontalMargin), (int) view.getResources().getDimension(R.dimen.ucControllerIdVerticalMargin), true);
    }

    public final void bind(UCControllerIdPM uCControllerIdPM) {
        l.f("model", uCControllerIdPM);
        this.controllerId.bind(uCControllerIdPM);
        ViewExtensionsKt.setRVMargins(this.controllerId, (int) this.itemView.getResources().getDimension(R.dimen.ucCardHorizontalMargin), (int) this.itemView.getResources().getDimension(R.dimen.ucCardVerticalMargin), true);
    }
}
