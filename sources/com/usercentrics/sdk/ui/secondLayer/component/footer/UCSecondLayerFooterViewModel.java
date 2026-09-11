package com.usercentrics.sdk.ui.secondLayer.component.footer;

import com.usercentrics.sdk.ui.components.UCButtonSettings;
import com.usercentrics.sdk.ui.components.UCButtonType;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface UCSecondLayerFooterViewModel {
    List<List<UCButtonSettings>> getButtons();

    String getOptOutToggle();

    boolean getOptOutToggleInitialValue();

    String getPoweredBy();

    void onButtonClick(UCButtonType uCButtonType);

    void onOptOutSwitchChanged(boolean z3);
}
