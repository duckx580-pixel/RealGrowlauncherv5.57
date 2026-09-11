package com.usercentrics.sdk;

import com.usercentrics.sdk.ui.PredefinedUIResponse;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UsercentricsConsentUserResponseKt {
    public static final UsercentricsConsentUserResponse toUserResponse(PredefinedUIResponse predefinedUIResponse) {
        l.f("<this>", predefinedUIResponse);
        return new UsercentricsConsentUserResponse(UsercentricsUserInteractionKt.toUsercentricsUserInteraction(predefinedUIResponse.getUserInteraction()), predefinedUIResponse.getConsents(), predefinedUIResponse.getControllerId());
    }
}
