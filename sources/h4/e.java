package h4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7560b;

    public e(long j, long j10) {
        if (j10 == 0) {
            this.f7559a = 0L;
            this.f7560b = 1L;
        } else {
            this.f7559a = j;
            this.f7560b = j10;
        }
    }

    public final String toString() {
        return this.f7559a + "/" + this.f7560b;
    }
}
