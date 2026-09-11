package com.usercentrics.sdk.core.settings;

import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.core.settings.SettingsOrchestratorImpl", f = "SettingsOrchestratorImpl.kt", l = {207}, m = "initAdditionalConsentMode-IoAF18A")
public final class SettingsOrchestratorImpl$initAdditionalConsentMode$1 extends c {
    int label;
    Object result;
    final SettingsOrchestratorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsOrchestratorImpl$initAdditionalConsentMode$1(SettingsOrchestratorImpl settingsOrchestratorImpl, ug.c<? super SettingsOrchestratorImpl$initAdditionalConsentMode$1> cVar) {
        super(cVar);
        this.this$0 = settingsOrchestratorImpl;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM58initAdditionalConsentModeIoAF18A = this.this$0.m58initAdditionalConsentModeIoAF18A(this);
        return objM58initAdditionalConsentModeIoAF18A == a.f18663i ? objM58initAdditionalConsentModeIoAF18A : new i(objM58initAdditionalConsentModeIoAF18A);
    }
}
