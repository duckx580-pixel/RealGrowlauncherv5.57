package u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u5.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f17551g;

    @Override // u5.f
    public final boolean k(g gVar) {
        return gVar == this.f17551g.getKey();
    }

    @Override // u5.f
    public final Object o(g gVar) {
        if (gVar == this.f17551g.getKey()) {
            return this.f17551g.getValue();
        }
        throw new IllegalStateException("Check failed.");
    }
}
