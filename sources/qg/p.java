package qg;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements d, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public eh.a f13927i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f13928r;

    @Override // qg.d
    public final Object getValue() {
        if (this.f13928r == n.f13925a) {
            eh.a aVar = this.f13927i;
            kotlin.jvm.internal.l.c(aVar);
            this.f13928r = aVar.invoke();
            this.f13927i = null;
        }
        return this.f13928r;
    }

    public final String toString() {
        return this.f13928r != n.f13925a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
