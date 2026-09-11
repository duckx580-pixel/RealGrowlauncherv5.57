package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8028a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return kotlin.jvm.internal.l.a(this.f8028a, ((i) obj).f8028a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8028a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f8028a + ')';
    }
}
