package a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface l extends n {
    @Override // a1.n
    default Object a(Object obj, eh.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // a1.n
    default boolean e(eh.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }
}
