package com.usercentrics.sdk.services.api.http;

import com.usercentrics.sdk.domain.api.http.HttpClient;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpClientResolver {
    public final HttpClient buildHttpClient(long j, Dispatcher dispatcher) {
        l.f("dispatcher", dispatcher);
        return new AndroidHttpClient(j, dispatcher);
    }
}
