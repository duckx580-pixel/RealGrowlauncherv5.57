package com.usercentrics.sdk.ui.image;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCRemoteImage {
    private final Map<String, List<String>> headers;
    private final byte[] payload;

    /* JADX WARN: Multi-variable type inference failed */
    public UCRemoteImage(byte[] bArr, Map<String, ? extends List<String>> map) {
        l.f("payload", bArr);
        l.f("headers", map);
        this.payload = bArr;
        this.headers = map;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final boolean isSVG() {
        List<String> list = this.headers.get("content-type");
        return l.a(list != null ? (String) rg.l.e0(list) : null, "image/svg+xml");
    }
}
