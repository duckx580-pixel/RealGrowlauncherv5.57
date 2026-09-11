package com.usercentrics.sdk.domain.api.http;

import eh.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpDisposable {
    private final a disconnectBlock;

    public HttpDisposable(a aVar) {
        l.f("disconnectBlock", aVar);
        this.disconnectBlock = aVar;
    }

    public final void disconnect() {
        this.disconnectBlock.invoke();
    }
}
