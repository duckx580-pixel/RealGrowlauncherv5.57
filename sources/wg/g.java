package wg;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(ug.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != ug.i.f17989i) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // ug.c
    public final ug.h getContext() {
        return ug.i.f17989i;
    }
}
