package sh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements ug.c, wg.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ug.c f15847i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ug.h f15848r;

    public z(ug.c cVar, ug.h hVar) {
        this.f15847i = cVar;
        this.f15848r = hVar;
    }

    @Override // wg.d
    public final wg.d getCallerFrame() {
        ug.c cVar = this.f15847i;
        if (cVar instanceof wg.d) {
            return (wg.d) cVar;
        }
        return null;
    }

    @Override // ug.c
    public final ug.h getContext() {
        return this.f15848r;
    }

    @Override // ug.c
    public final void resumeWith(Object obj) {
        this.f15847i.resumeWith(obj);
    }
}
