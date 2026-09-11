package com.usercentrics.sdk.v2.settings.api;

import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.v2.settings.data.BasicConsentTemplate;
import java.util.List;
import java.util.Map;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface IAggregatorApi {
    Object getServices(String str, List<BasicConsentTemplate> list, Map<String, String> map, c<? super HttpResponse> cVar);
}
