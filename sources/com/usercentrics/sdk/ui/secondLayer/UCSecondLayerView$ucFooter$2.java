package com.usercentrics.sdk.ui.secondLayer;

import com.usercentrics.sdk.ui.R;
import com.usercentrics.sdk.ui.secondLayer.component.footer.UCSecondLayerFooter;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSecondLayerView$ucFooter$2 extends m implements a {
    final UCSecondLayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCSecondLayerView$ucFooter$2(UCSecondLayerView uCSecondLayerView) {
        super(0);
        this.this$0 = uCSecondLayerView;
    }

    @Override // eh.a
    public final UCSecondLayerFooter invoke() {
        return (UCSecondLayerFooter) this.this$0.findViewById(R.id.ucFooter);
    }
}
