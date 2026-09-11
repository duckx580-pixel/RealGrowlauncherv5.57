package qg;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13914i;

    public static final Throwable a(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).f13913i;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return kotlin.jvm.internal.l.a(this.f13914i, ((i) obj).f13914i);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13914i;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13914i;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
