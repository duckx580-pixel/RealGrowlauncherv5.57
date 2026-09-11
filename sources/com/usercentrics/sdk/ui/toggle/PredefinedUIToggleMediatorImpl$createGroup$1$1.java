package com.usercentrics.sdk.ui.toggle;

import com.usercentrics.sdk.models.settings.PredefinedUIToggleSettings;
import eh.c;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIToggleMediatorImpl$createGroup$1$1 extends m implements c {
    final PredefinedUIToggleSettings $settings;
    final PredefinedUIToggleMediatorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedUIToggleMediatorImpl$createGroup$1$1(PredefinedUIToggleMediatorImpl predefinedUIToggleMediatorImpl, PredefinedUIToggleSettings predefinedUIToggleSettings) {
        super(1);
        this.this$0 = predefinedUIToggleMediatorImpl;
        this.$settings = predefinedUIToggleSettings;
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return o.f13926a;
    }

    public final void invoke(boolean z3) {
        this.this$0.handleToggledCategory(this.$settings.getId(), this.$settings.getConsentId(), z3);
    }
}
