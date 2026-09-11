package com.usercentrics.sdk.v2.async.dispatcher;

import eh.c;
import kotlin.jvm.internal.l;
import qg.h;
import qg.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DispatcherCallback<T> {
    private c failureBlock;
    private i result;
    private c successBlock;

    public final DispatcherCallback<T> onFailure(c cVar) {
        l.f("block", cVar);
        i iVar = this.result;
        if (iVar == null) {
            this.failureBlock = cVar;
            return this;
        }
        Throwable thA = i.a(iVar.f13914i);
        if (thA != null) {
            cVar.invoke(thA);
        }
        return this;
    }

    public final DispatcherCallback<T> onSuccess(c cVar) {
        l.f("block", cVar);
        i iVar = this.result;
        if (iVar == null) {
            this.successBlock = cVar;
            return this;
        }
        Object obj = iVar.f13914i;
        if (!(obj instanceof h)) {
            cVar.invoke(obj);
        }
        return this;
    }

    public final void setResult$usercentrics_release(Object obj) {
        this.result = new i(obj);
        c cVar = this.failureBlock;
        if (cVar != null) {
            this.failureBlock = null;
            Throwable thA = i.a(obj);
            if (thA != null) {
                cVar.invoke(thA);
            }
        }
        c cVar2 = this.successBlock;
        if (cVar2 != null) {
            this.successBlock = null;
            if (obj instanceof h) {
                return;
            }
            cVar2.invoke(obj);
        }
    }
}
