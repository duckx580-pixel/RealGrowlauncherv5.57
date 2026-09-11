package com.usercentrics.sdk;

import com.usercentrics.sdk.core.application.Application;
import com.usercentrics.sdk.core.application.UsercentricsApplication;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import eh.c;
import kotlin.jvm.internal.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UsercentricsDisposableEvent<T> {
    private c callback;

    /* JADX WARN: Multi-variable type inference failed */
    public UsercentricsDisposableEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void call$usercentrics_release(T t10) {
        UsercentricsApplication instance$usercentrics_release;
        Application application$usercentrics_release;
        Dispatcher dispatcher;
        if (t10 == null || (instance$usercentrics_release = UsercentricsApplication.Companion.getInstance$usercentrics_release()) == null || (application$usercentrics_release = instance$usercentrics_release.getApplication$usercentrics_release()) == null || (dispatcher = application$usercentrics_release.getDispatcher()) == null) {
            return;
        }
        dispatcher.dispatchMain(new UsercentricsDisposableEvent$call$1(this, t10));
    }

    public final void dispose() {
        this.callback = null;
    }

    public final c getCallback$usercentrics_release() {
        return this.callback;
    }

    public final void setCallback$usercentrics_release(c cVar) {
        this.callback = cVar;
    }

    public UsercentricsDisposableEvent(c cVar) {
        this.callback = cVar;
    }

    public /* synthetic */ UsercentricsDisposableEvent(c cVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : cVar);
    }
}
