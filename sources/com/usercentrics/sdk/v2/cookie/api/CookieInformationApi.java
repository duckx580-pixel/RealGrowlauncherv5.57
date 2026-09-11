package com.usercentrics.sdk.v2.cookie.api;

import com.usercentrics.sdk.domain.api.http.HttpRequests;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CookieInformationApi implements ICookieInformationApi {
    private final HttpRequests restClient;

    public CookieInformationApi(HttpRequests httpRequests) {
        l.f("restClient", httpRequests);
        this.restClient = httpRequests;
    }

    @Override // com.usercentrics.sdk.v2.cookie.api.ICookieInformationApi
    public HttpResponse getCookiesInfo(String str) {
        l.f("url", str);
        return this.restClient.getSync(str, null);
    }
}
