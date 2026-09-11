package com.usercentrics.sdk.domain.api.http;

import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import oh.e;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpRequestsImpl$getSync2$2$1$onSuccess$1 extends m implements c {
    final e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestsImpl$getSync2$2$1$onSuccess$1(e eVar) {
        super(1);
        this.$continuation = eVar;
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpResponse) obj);
        return o.f13926a;
    }

    public final void invoke(HttpResponse httpResponse) {
        l.f("it", httpResponse);
        this.$continuation.resumeWith(httpResponse);
    }
}
