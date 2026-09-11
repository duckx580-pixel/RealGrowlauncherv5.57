package d4;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4932a;

    public e(String str) {
        this.f4932a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return l.a(this.f4932a, ((e) obj).f4932a);
    }

    public final int hashCode() {
        return this.f4932a.hashCode();
    }

    public final String toString() {
        return this.f4932a;
    }
}
