package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface n1 extends o1 {
    @Override // t.l1
    default long b(o oVar, o oVar2, o oVar3) {
        return ((long) (x() + w())) * 1000000;
    }

    int w();

    int x();
}
