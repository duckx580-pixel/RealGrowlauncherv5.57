package com.usercentrics.sdk.v2.async.dispatcher;

import kotlin.jvm.internal.l;
import oh.a0;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class Deferred<T> {
    private final a0 job;

    public Deferred(a0 a0Var) {
        l.f("job", a0Var);
        this.job = a0Var;
    }

    public final Object await(c<? super T> cVar) {
        return this.job.t(cVar);
    }
}
