package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends e1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Exception f16462i;

    public c1(Exception exc) {
        this.f16462i = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.f16462i.equals(((c1) obj).f16462i);
    }

    public final int hashCode() {
        return this.f16462i.hashCode();
    }

    public final String toString() {
        return nh.i.B("LoadResult.Error(\n                    |   throwable: " + this.f16462i + "\n                    |) ");
    }
}
