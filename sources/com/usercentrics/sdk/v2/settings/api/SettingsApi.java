package com.usercentrics.sdk.v2.settings.api;

import com.usercentrics.sdk.BuildKonfig;
import com.usercentrics.sdk.domain.api.http.HttpRequests;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.services.api.NetworkResolver;
import java.util.Map;
import k0.g;
import kotlin.jvm.internal.l;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SettingsApi implements ISettingsApi {
    private final NetworkResolver networkResolver;
    private final HttpRequests restClient;

    public SettingsApi(HttpRequests httpRequests, NetworkResolver networkResolver) {
        l.f("restClient", httpRequests);
        l.f("networkResolver", networkResolver);
        this.restClient = httpRequests;
        this.networkResolver = networkResolver;
    }

    private final String buildUrl(String str, String str2, String str3) {
        String strCdnBaseUrl = this.networkResolver.cdnBaseUrl();
        String endpoint_settingsUrlPath = BuildKonfig.INSTANCE.getEndpoint_settingsUrlPath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strCdnBaseUrl);
        sb2.append("/");
        sb2.append(endpoint_settingsUrlPath);
        sb2.append("/");
        sb2.append(str);
        g.y(sb2, "/", str2, "/", str3);
        sb2.append(".json");
        return sb2.toString();
    }

    @Override // com.usercentrics.sdk.v2.settings.api.ISettingsApi
    public Object getSettings(String str, String str2, String str3, Map<String, String> map, c<? super HttpResponse> cVar) {
        return this.restClient.getSync2(buildUrl(str, str2, str3), map, cVar);
    }
}
