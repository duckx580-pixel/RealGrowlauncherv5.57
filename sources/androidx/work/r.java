package androidx.work;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends w9.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Throwable f2394l;

    public r(Throwable th2) {
        this.f2394l = th2;
    }

    public final String toString() {
        return "FAILURE (" + this.f2394l.getMessage() + ")";
    }
}
