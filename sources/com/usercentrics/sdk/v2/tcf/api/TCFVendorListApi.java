package com.usercentrics.sdk.v2.tcf.api;

import com.usercentrics.sdk.domain.api.http.HttpRequests;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.services.api.NetworkResolver;
import java.util.Map;
import kotlin.jvm.internal.l;
import s.h0;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCFVendorListApi implements ITCFVendorListApi {
    private final NetworkResolver networkResolver;
    private final HttpRequests restClient;

    public TCFVendorListApi(HttpRequests httpRequests, NetworkResolver networkResolver) {
        l.f("restClient", httpRequests);
        l.f("networkResolver", networkResolver);
        this.restClient = httpRequests;
        this.networkResolver = networkResolver;
    }

    private final String buildVendorListUrl() {
        return h0.e(this.networkResolver.cdnBaseUrl(), "/gvl/v3/en.json");
    }

    @Override // com.usercentrics.sdk.v2.tcf.api.ITCFVendorListApi
    public Object getVendorList(Map<String, String> map, c<? super HttpResponse> cVar) {
        return this.restClient.getSync2(buildVendorListUrl(), map, cVar);
    }
}
