package li;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10070b;

    public y(String str) {
        long jNanoTime = System.nanoTime();
        kotlin.jvm.internal.l.f("message", str);
        this.f10069a = jNanoTime;
        this.f10070b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f10069a == yVar.f10069a && kotlin.jvm.internal.l.a(this.f10070b, yVar.f10070b);
    }

    public final int hashCode() {
        return this.f10070b.hashCode() + (Long.hashCode(this.f10069a) * 31);
    }

    public final String toString() {
        return "TimedLog(id=" + this.f10069a + ", message=" + this.f10070b + ")";
    }
}
