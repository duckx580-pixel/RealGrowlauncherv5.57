package qh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f13969a;

    public i(Throwable th2) {
        this.f13969a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return kotlin.jvm.internal.l.a(this.f13969a, ((i) obj).f13969a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f13969a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // qh.j
    public final String toString() {
        return "Closed(" + this.f13969a + ')';
    }
}
