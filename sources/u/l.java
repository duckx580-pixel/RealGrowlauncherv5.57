package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g1.i f17461a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.l.a(this.f17461a, ((l) obj).f17461a);
    }

    public final int hashCode() {
        g1.i iVar = this.f17461a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "BorderCache(imageBitmap=null, canvas=null, canvasDrawScope=null, borderPath=" + this.f17461a + ')';
    }
}
