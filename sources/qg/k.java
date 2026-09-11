package qg;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public eh.a f13918i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Object f13919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13920s;

    public k(eh.a aVar) {
        kotlin.jvm.internal.l.f("initializer", aVar);
        this.f13918i = aVar;
        this.f13919r = n.f13925a;
        this.f13920s = this;
    }

    @Override // qg.d
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f13919r;
        n nVar = n.f13925a;
        if (obj != nVar) {
            return obj;
        }
        synchronized (this.f13920s) {
            objInvoke = this.f13919r;
            if (objInvoke == nVar) {
                eh.a aVar = this.f13918i;
                kotlin.jvm.internal.l.c(aVar);
                objInvoke = aVar.invoke();
                this.f13919r = objInvoke;
                this.f13918i = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f13919r != n.f13925a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
