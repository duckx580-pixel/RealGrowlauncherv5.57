package com.usercentrics.sdk.ui;

import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService;
import eh.a;
import eh.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class NoCookieInformationService implements UsercentricsCookieInformationService {
    @Override // com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService
    public PredefinedUICookieInformationLabels cookieInformationLabels() {
        return null;
    }

    @Override // com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService
    public void fetchCookieInfo(String str, c cVar, a aVar) {
        l.f("cookieInfoURL", str);
        l.f("onSuccess", cVar);
        l.f("onError", aVar);
        aVar.invoke();
    }

    @Override // com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService
    public void fetchSDKInfo(String str, c cVar, a aVar) {
        l.f("cookieInfoURL", str);
        l.f("onSuccess", cVar);
        l.f("onError", aVar);
        aVar.invoke();
    }
}
