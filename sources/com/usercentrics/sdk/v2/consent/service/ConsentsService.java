package com.usercentrics.sdk.v2.consent.service;

import com.usercentrics.sdk.models.settings.UsercentricsConsentAction;
import eh.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ConsentsService {
    void getRemoteUserConsents(String str, c cVar, c cVar2);

    void processConsentsBuffer();

    void saveConsentsState(UsercentricsConsentAction usercentricsConsentAction);
}
