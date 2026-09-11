package u5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17680b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.f17679a, oVar.f17679a) && this.f17680b == oVar.f17680b;
    }

    public final int hashCode() {
        return t.g.c(this.f17680b) + (this.f17679a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f17679a + ", state=" + android.support.v4.media.session.a.E(this.f17680b) + ')';
    }
}
