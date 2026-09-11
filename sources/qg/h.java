package qg;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Throwable f13913i;

    public h(Throwable th2) {
        kotlin.jvm.internal.l.f("exception", th2);
        this.f13913i = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.l.a(this.f13913i, ((h) obj).f13913i);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13913i.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13913i + ')';
    }
}
