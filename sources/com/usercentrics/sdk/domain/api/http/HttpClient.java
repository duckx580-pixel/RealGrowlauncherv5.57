package com.usercentrics.sdk.domain.api.http;

import eh.c;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface HttpClient {
    HttpDisposable get(String str, Map<String, String> map, c cVar, c cVar2);

    HttpResponse get(String str, Map<String, String> map);

    String post(String str, Map<String, String> map, String str2);
}
