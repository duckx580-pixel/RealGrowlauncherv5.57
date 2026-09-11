package p2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f13285c = new q(u5.f.q(0), u5.f.q(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13287b;

    public q(long j, long j10) {
        this.f13286a = j;
        this.f13287b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return q2.n.a(this.f13286a, qVar.f13286a) && q2.n.a(this.f13287b, qVar.f13287b);
    }

    public final int hashCode() {
        q2.o[] oVarArr = q2.n.f13756b;
        return Long.hashCode(this.f13287b) + (Long.hashCode(this.f13286a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) q2.n.d(this.f13286a)) + ", restLine=" + ((Object) q2.n.d(this.f13287b)) + ')';
    }
}
