package z7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends UnsupportedOperationException {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y7.c f20671i;

    public o(y7.c cVar) {
        this.f20671i = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f20671i));
    }
}
