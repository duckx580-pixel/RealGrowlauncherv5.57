package com.usercentrics.sdk.ui.components;

import com.usercentrics.sdk.ui.R;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCButton$ucButtonBackground$2 extends m implements a {
    final UCButton this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCButton$ucButtonBackground$2(UCButton uCButton) {
        super(0);
        this.this$0 = uCButton;
    }

    @Override // eh.a
    public final UCImageView invoke() {
        return (UCImageView) this.this$0.findViewById(R.id.ucButtonBackground);
    }
}
