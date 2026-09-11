package com.usercentrics.sdk;

import eh.a;
import eh.c;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UsercentricsDisposableEvent$call$1 extends m implements a {
    final T $value;
    final UsercentricsDisposableEvent<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsercentricsDisposableEvent$call$1(UsercentricsDisposableEvent<T> usercentricsDisposableEvent, T t10) {
        super(0);
        this.this$0 = usercentricsDisposableEvent;
        this.$value = t10;
    }

    @Override // eh.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m28invoke();
        return o.f13926a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m28invoke() {
        c callback$usercentrics_release = this.this$0.getCallback$usercentrics_release();
        if (callback$usercentrics_release != null) {
            callback$usercentrics_release.invoke(this.$value);
        }
    }
}
