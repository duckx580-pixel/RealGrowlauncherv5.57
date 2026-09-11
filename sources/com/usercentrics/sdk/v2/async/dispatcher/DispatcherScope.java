package com.usercentrics.sdk.v2.async.dispatcher;

import eh.c;
import kotlin.jvm.internal.l;
import oh.s;
import oh.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DispatcherScope {
    private final s asyncDispatcher;

    public DispatcherScope(s sVar) {
        l.f("asyncDispatcher", sVar);
        this.asyncDispatcher = sVar;
    }

    public final <T> Deferred<T> async(c cVar) {
        l.f("block", cVar);
        return new Deferred<>(x.e(DispatcherKt.scope(this.asyncDispatcher), null, new DispatcherScope$async$async$1(cVar, null), 3));
    }
}
