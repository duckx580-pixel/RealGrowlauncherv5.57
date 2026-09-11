package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.b f8031a;

    public j(j2.b bVar) {
        this.f8031a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && kotlin.jvm.internal.l.a(this.f8031a, ((j) obj).f8031a);
    }

    public final int hashCode() {
        return this.f8031a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f8031a + ", loaderKey=null)";
    }
}
